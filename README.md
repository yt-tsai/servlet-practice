# Servlet Practice

My Java Web learning project using Servlet, JSP, Maven, and Apache Tomcat.

## Overview

This project demonstrates the fundamental concepts of Java Web development using Servlet, JSP, Maven, and Apache Tomcat.

It includes MVC architecture, form handling, JavaBean, Filter, Listener, and WAR deployment.

---

## Environment

- Java 21
- Maven 3.9.16
- Apache Tomcat 11
- VS Code
- macOS

---

## Current Features

### Servlet / MVC

- HelloServlet
- UserServlet
- UserFormServlet
- JavaBean (User)
- Request Scope

### JSP

- JSP View
- EL (Expression Language)
- HTML Form
- POST Form Handling

### Filter

- CharacterEncodingFilter
- UTF-8 Request Encoding
- `@WebFilter("/*")`
- `chain.doFilter()`

### Listener

- AppLifecycleListener
- `@WebListener`
- Application Lifecycle Monitoring

### Deployment

- Maven Web Application
- WAR Packaging
- Apache Tomcat 11 Deployment

---

## Project Structure

```text
servlet-practice
├── pom.xml
└── src
    └── main
        ├── java
        │   └── com
        │       └── example
        │           ├── HelloServlet.java
        │           ├── UserServlet.java
        │           ├── UserFormServlet.java
        │           ├── filter
        │           │   └── CharacterEncodingFilter.java
        │           ├── listener
        │           │   └── AppLifecycleListener.java
        │           └── model
        │               └── User.java
        └── webapp
            ├── index.jsp
            ├── form.html
            ├── user.jsp
            ├── result.jsp
            └── WEB-INF
                └── web.xml
```

---

## MVC Flow

```text
Browser
    │
    ▼
Servlet Controller
    │
    ▼
Model (User)
    │
    ▼
Request Scope
    │
    ▼
JSP View
    │
    ▼
EL Expression
```

---

## Filter Flow

```text
Browser
    │
    ▼
CharacterEncodingFilter
    │
    ▼
UserFormServlet
    │
    ▼
result.jsp
```

---

## Listener Flow

```text
Tomcat Start
      │
      ▼
Application Started

Tomcat Stop
      │
      ▼
Application Stopped
```

---

## Run

### Build

```bash
mvn clean package
```

Generated WAR file:

```text
target/servlet-practice.war
```

### Deploy

Copy the generated WAR file to the Tomcat **webapps** directory.

### Access

```text
http://localhost:8080/servlet-practice/hello
```

---

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

---

### MVC Servlet

Access:

```text
http://localhost:8080/servlet-practice/user
```

Displays:

```text
Hello Peter
```

---

### Filter

Console Output:

```text
CharacterEncodingFilter executed.
Before Servlet
After Servlet
```

---

### Listener

Console Output:

```text
Application Started
Application Stopped
```

---

## Form Handling

### Request Flow

```text
Browser
    │
    ▼
HTML Form (POST)
    │
    ▼
Servlet Controller
    │
    ▼
request.getParameter()
    │
    ▼
Create User Object
    │
    ▼
request.setAttribute()
    │
    ▼
JSP View
    │
    ▼
EL Expression
```

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

---

## Learning Summary

Through this project, I learned:

- Java Servlet development
- MVC architecture
- JSP and EL
- JavaBean
- HTML Form handling
- Request Scope
- Filter
- Listener
- Maven build
- WAR packaging
- Apache Tomcat deployment
