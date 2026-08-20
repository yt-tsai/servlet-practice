package com.example.student;

import java.io.IOException;
import java.util.List;
import com.example.model.Student;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/students/delete")
public class StudentDeleteServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request,
            HttpServletResponse response)
            throws ServletException, IOException {

        String idText = request.getParameter("id");
        int id = Integer.parseInt(idText);

        List<Student> students = (List<Student>) getServletContext().getAttribute("students");

        // Avoid removing elements while iterating over the list.
        // Use removeIf() with a lambda expression instead.
        students.removeIf(student -> student.getId() == id);

        response.sendRedirect(request.getContextPath() + "/students");

    }
}