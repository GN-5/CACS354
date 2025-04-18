package controller;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.*;
import jakarta.servlet.http.*;

public class FirstServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;
    HttpSession session;

    public FirstServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws IOException, ServletException {
        // Handle GET request
        System.out.println("... inside Get Request ...");
        response.getWriter().append("served at : ").append(request.getContextPath());
        String servletPath = request.getServletPath();
        System.out.println("Servlet Path: " + servletPath);
        String contextPath = request.getContextPath();
        System.out.println("Context Path: " + contextPath);

        if (servletPath.equals("/login")) {
            request.getRequestDispatcher("login.jsp").forward(request, response);
            System.out.println("... inside login.jsp ...");
        }
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws IOException, ServletException {
        // Handle POST request
        session = request.getSession();
        DBConnect db = new DBConnect();
        System.out.println(request.getServletPath());
        if (request.getServletPath().equals("/login")) {
            String username = (String) request.getParameter("username");
            String password = (String) request.getParameter("password");
            System.out.println("Username: " + username);
            System.out.println("Password: " + password);
            response.setContentType("text/html");
            PrintWriter out = response.getWriter();
            if (db.checkUser(username, password)) {
                session.setAttribute("username", username);
                out.println("<h1>Welcome " + username + "</h1>");
                out.println("<a href='logout'>Logout</a>");
                request.getRequestDispatcher("dashboard.jsp").forward(request, response);
            } else {
                out.println("<h1>Invalid Credentials for</h1>" + username);
                out.println("<a href='login.jsp'>Try Again</a>");
            }
        } else if (request.getServletPath().equals("/logout")) {
            session.invalidate();
            response.sendRedirect(request.getContextPath() + "/login.jsp");
        }
    }

}
