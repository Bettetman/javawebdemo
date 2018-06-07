package com.rimi.cs.javawebdemo.web;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "LoginServlet",urlPatterns = "/login")
public class LoginServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("进入到sERVLET");
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        request.setAttribute("username",username);
        request.setAttribute("password",password);

        System.out.println("用户名"+username);
        System.out.println("密码"+password);

        request.getRequestDispatcher("info.jsp").forward(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
