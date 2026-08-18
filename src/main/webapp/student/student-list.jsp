<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
    <%@ taglib prefix="c" uri="jakarta.tags.core" %>

        <a href="${pageContext.request.contextPath}/student/student-form.jsp">
            Add Student
        </a>

        <br>
        <table border="1">
            <tr>
                <th>ID</th>
                <th>NAME</th>
                <th>AGE</th>
                <th>ACTION</th>
            </tr>

            <c:forEach items="${students}" var="student">
                <tr>
                    <td>${student.id}</td>
                    <td>${student.name}</td>
                    <td>${student.age}</td>
                    <td> <a href="${pageContext.request.contextPath}/students/edit?id=${student.id}">
                            Edit</a>
                    </td>
                </tr>
            </c:forEach>

        </table>