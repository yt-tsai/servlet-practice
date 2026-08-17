package com.example.student;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.example.model.Student;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/students")
public class StudentListServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        // List<Student> students = new ArrayList<>();
        List<Student> students = (List<Student>) getServletContext().getAttribute("students");

        if (students == null) {
            students = new ArrayList<>();
            students.add(new Student(1, "Peter", 42));
            students.add(new Student(2, "Marina", 20));
            students.add(new Student(3, "Mika", 25));

            getServletContext().setAttribute("students", students);
        }

        request.setAttribute("students", students);
        request.getRequestDispatcher("/student/student-list.jsp")
                .forward(request, response);

    }
}