package com.example.student;

import java.io.IOException;
import java.util.List;

import com.example.model.Student;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/students/edit")
public class StudentEditServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request,
            HttpServletResponse response)
            throws ServletException, IOException {

        String idText = request.getParameter("id");
        int id = Integer.parseInt(idText);

        List<Student> students = (List<Student>) getServletContext().getAttribute("students");

        for (Student student : students) {

            if (student.getId() == id) {
                request.setAttribute("student", student);
                request.getRequestDispatcher("/student/student-edit.jsp")
                        .forward(request, response);
                return;
            }
        }

    }
}