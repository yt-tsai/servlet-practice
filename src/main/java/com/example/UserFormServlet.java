package com.example;

import java.io.IOException;

import com.example.model.User;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/userForm")
public class UserFormServlet extends HttpServlet {

    @Override
    protected void doPost(
            HttpServletRequest request,
            HttpServletResponse response)
            throws ServletException, IOException {

        String name = request.getParameter("username");
        int age = 0;

        try {
            age = Integer.parseInt(request.getParameter("age"));
        } catch (NumberFormatException e) {
            e.printStackTrace();

        }

        User user = new User(name, age);

        request.setAttribute("user", user);

        request.getRequestDispatcher("/result.jsp")
                .forward(request, response);
    }
}