<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
    <%@ taglib prefix="c" uri="jakarta.tags.core" %>

        <table border="1">
            <tr>
                <th>ID</th>
                <th>NAME</th>
                <th>AGE</th>
            </tr>

            <c:forEach items="${students}" var="student">
                <tr>
                    <td>${student.id}</td>
                    <td>${student.name}</td>
                    <td>${student.age}</td>
                </tr>
            </c:forEach>

        </table>