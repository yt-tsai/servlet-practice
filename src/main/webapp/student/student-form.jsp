<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>

    <!DOCTYPE html>
    <html>

    <head>
        <meta charset="UTF-8">
        <title>Add Student</title>
    </head>

    <body>

        <h2>Add Student</h2>

        <form action="${pageContext.request.contextPath}/students/add" method="post">

            Name:
            <input type="text" name="name">
            <br><br>

            Age:
            <input type="number" name="age">
            <br><br>

            <input type="submit" value="Add Student">

        </form>

    </body>

    </html>