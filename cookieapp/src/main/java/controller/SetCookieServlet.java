package controller;

import java.io.IOException;

import jakarta.servlet.*;
import jakarta.servlet.http.*;

public class SetCookieServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        Cookie cookie = new Cookie("username", "JohnDoe");
        cookie.setMaxAge(60 * 60); // 1 hour
        response.addCookie(cookie);
        response.getWriter().println("Cookie set successfully!");
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doGet(request, response);
    }

}
