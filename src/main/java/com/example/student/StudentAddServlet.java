package com.example.student;

import java.io.IOException;
import java.util.List;

import com.example.model.Student;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/students/add")
public class StudentAddServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request,
            HttpServletResponse response)
            throws ServletException, IOException {

        String name = request.getParameter("name");
        String ageText = request.getParameter("age");

        int age = Integer.parseInt(ageText);

        List<Student> students = (List<Student>) getServletContext().getAttribute("students");

        int id = students.size() + 1;

        Student student = new Student(id, name, age);

        students.add(student);

        response.sendRedirect(request.getContextPath() + "/students");

    }
}