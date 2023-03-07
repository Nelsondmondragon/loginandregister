<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
        <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
            <%@ page isErrorPage="true" %>
                <!DOCTYPE html>
                <html>

                <head>
                    <meta charset="ISO-8859-1">
                    <link rel="stylesheet" type="text/css" href="/css/loginregistration.css">
                    <title>New dojo</title>

                </head>

                <body>
                    <div class="container">
                        <h1 class="container__title">Welcome, ${user.getUserName()}</h1>
                        <h4 class="container__description">Join our growing community</h4>
                        <a href="/">lagout</a>
                    </div>
                </body>

                </html>