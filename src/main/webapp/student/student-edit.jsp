<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>

    <!DOCTYPE html>
    <html>

    <head>
        <meta charset="UTF-8">
        <title>Edit Student</title>
    </head>

    <body>

        <h2>Edit Student</h2>

        <form action="${pageContext.request.contextPath}/students/update" method="post">

            <input type="hidden" name="id" value="${student.id}">

            Name:
            <input type="text" name="name" value="${student.name}">
            <br><br>

            Age:
            <input type="number" name="age" value="${student.age}">
            <br><br>

            <input type="submit" value="Save">

        </form>

    </body>

    </html>