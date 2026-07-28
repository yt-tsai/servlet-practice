# Servlet Practice

My Java Web learning project using Servlet, JSP, Maven, and Tomcat.

## Environment

- Java 21
- Maven 3.9.16
- Tomcat 11
- VS Code
- macOS

## Current Features

### Servlet / MVC

- HelloServlet implementation
- MVC Servlet example
- UserFormServlet
- JavaBean Model (User class)
- Request Scope

### JSP / Form Handling

- JSP View
- EL Expression
- HTML Form handling
- POST Form

### Deployment

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
        │   ├── com/example
        │   │   ├── HelloServlet.java
        │   │   ├── UserServlet.java
        │   │   └── UserFormServlet.java
        │   │
        │   └── com/example/model
        │       └── User.java
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
→ Model (User)
→ Request Scope (setAttribute)
→ JSP View
→ EL Expression

## Form Handling

### Flow

Browser
→ HTML Form (POST)
→ Servlet Controller
→ request.getParameter()
→ Create User Object
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
Name: Peter
Age: 42
```

Result:

```text
Hello Peter
Welcome to Servlet World!!

User information:
Name: Peter
Age: 42
```
