# Servlet Practice

My Java Web learning project using Servlet, JSP, Maven, and Tomcat.

## Environment

- Java 21
- Maven 3.9.16
- Tomcat 11
- VS Code
- macOS

## Current Features

- HelloServlet implementation
- MVC Servlet example
- HTML Form handling
- Request Scope
- JSP View
- EL Expression
- Maven Web Application
- WAR deployment
- Tomcat deployment
- Browser access test

## Project Structure

```text
servlet-practice
├── pom.xml
└── src
    └── main
        ├── java
        │   └── com/example
        │       ├── HelloServlet.java
        │       ├── UserServlet.java
        │       └── UserFormServlet.java
        └── webapp
            ├── index.jsp
            ├── form.html
            ├── user.jsp
            ├── result.jsp
            └── WEB-INF
                └── web.xml
```

## Run

Build:

```bash
mvn clean package
```

Generated WAR file:

```text
target/servlet-practice.war
```

Deploy WAR file to Tomcat:

Copy `target/servlet-practice.war` to Tomcat `webapps` directory.

Access:

```text
http://localhost:8080/servlet-practice/hello
```

## Result

### HelloServlet

Access:

```text
http://localhost:8080/servlet-practice/hello
```

Displays:

```text
Hello Servlet
My first Servlet on Mac!
```

### MVC Servlet

Access:

```text
http://localhost:8080/servlet-practice/user
```

Displays:

```text
Hello Peter
```

## MVC Flow

Browser
→ Servlet Controller
→ Request Scope (setAttribute)
→ JSP View
→ EL Expression

## Form Handling

### Flow

Browser
→ HTML Form (POST)
→ Servlet Controller
→ request.getParameter()
→ request.setAttribute()
→ JSP View
→ EL Expression

### Example

Access:

```text
http://localhost:8080/servlet-practice/form.html
```

Input:

```text
Peter
```

Result:

```text
Hello Peter
Welcome to Servlet World!!
```
