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
                        <h1 class="container__title">Welcome!</h1>
                        <h4 class="container__description">Join our growing community</h4>
                        <div class="container__register__login">
                            <form:form class="form__register" action="/register" modelAttribute="newUser">
                                <input type="hidden" name="_method" value="post">
                                <h2 class="register__title">Register</h2>

                                <form:errors class="error" path="userName" />
                                <div class="register__field">
                                    <form:label path="userName">User Name:</form:label>
                                    <form:input path="userName" type="text"></form:input>
                                </div>

                                <form:errors class="error" path="email" />
                                <div class="register__field">
                                    <form:label path="email">Email:</form:label>
                                    <form:input path="email" type="text"></form:input>
                                </div>
                                <form:errors class="error" path="password" />
                                <div class="register__field">
                                    <form:label path="password" for="">Password:</form:label>
                                    <form:input path="password" type="text"></form:input>
                                </div>
                                <form:errors class="error" path="confirm" />
                                <div class="register__field">
                                    <form:label path="confirm" for="">Confirm PW:</form:label>
                                    <form:input path="confirm" type="text"></form:input>
                                </div>
                                <input class="register__button" type="submit" value="Submit">
                            </form:form>

                            <form:form class="form__login" action="/login" modelAttribute="newLogin">
                                <input type="hidden" name="_method" value="post">

                                <h2>Log In</h2>
                                <form:errors class="error" path="email" />
                                <div class="login__field">
                                    <form:label path="email">Email:</form:label>
                                    <form:input path="email" type="text"></form:input>
                                </div>

                                <form:errors class="error" path="password" />
                                <div class="login__field">
                                    <form:label path="password">Password:</form:label>
                                    <form:input path="password" type="text"></form:input>
                                </div>

                                <input class="login__button" type="submit" value="Submit">
                            </form:form>

                        </div>
                    </div>
                </body>

                </html>