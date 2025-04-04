package controller;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.*;
import jakarta.servlet.http.*;

public class ArithmeticServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    public ArithmeticServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        // Handle GET request
        System.out.println("... inside Get Request ...");
        response.getWriter().append("served at : ").append(request.getContextPath());
        String servletPath = request.getServletPath();
        System.out.println("Servlet Path: " + servletPath);
        String contextPath = request.getContextPath();
        System.out.println("Context Path: " + contextPath);

        int num1 = Integer.parseInt(request.getParameter("num1"));
        int num2 = Integer.parseInt(request.getParameter("num2"));

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        out.println("<h1>" + num1 + " " + num2 + " = " + (num1 + num2) + "</h1>");
        System.out.println(num1 + " " + num2);

    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws IOException, ServletException {

        // Handle POST request
        System.out.println(request.getServletPath());
        int result = 0;

        if (request.getServletPath().equals("/math")) {
            response.setContentType("text/html");

            String num1 = request.getParameter("num1");
            String num2 = request.getParameter("num2");
            String btn = request.getParameter("btn");
            System.out.println("Button: " + btn);
            PrintWriter out = response.getWriter();
            if (btn.equals("Add")) {
                result = Integer.parseInt(num1) + Integer.parseInt(num2);
            } else if (btn.equals("Subtract")) {
                result = Integer.parseInt(num1) - Integer.parseInt(num2);
            }
            out.println("<h1>Result: " + result + "</h1>");

        } else {
            request.getRequestDispatcher("/contactus.jsp").forward(request, response);
        }

        String message = request.getParameter("msg");
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<h1>Message: " + message + "</h1>");
    }
}
