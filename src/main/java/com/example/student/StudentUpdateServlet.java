package com.example.student;

import java.io.IOException;
import java.util.List;

import com.example.model.Student;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/students/update")
public class StudentUpdateServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request,
            HttpServletResponse response)
            throws ServletException, IOException {

        String idText = request.getParameter("id");
        String name = request.getParameter("name");
        String ageText = request.getParameter("age");

        int id = Integer.parseInt(idText);
        int age = Integer.parseInt(ageText);

        List<Student> students = (List<Student>) getServletContext().getAttribute("students");

        for (Student student : students) {
            if (student.getId() == id) {
                student.setName(name);
                student.setAge(age);
                // Stop searching after finding the target student.
                break;
            }
        }

        // Do not use forward here.
        // Redirect to avoid form resubmission.
        // ---------------------------------------------------------------------
        // RequestDispatcher rd =
        // request.getRequestDispatcher("/student/student-list.jsp");
        // rd.forward(request, response);
        // ---------------------------------------------------------------------

        // Redirect after updating to prevent form resubmission.
        // (PRG: Post -> Redirect -> Get)
        response.sendRedirect(request.getContextPath() + "/students");
    }
}