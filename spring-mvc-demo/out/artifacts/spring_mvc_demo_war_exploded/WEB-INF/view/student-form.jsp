<%--
  Created by IntelliJ IDEA.
  User: ziweiwu
  Date: 2019-04-24
  Time: 10:00
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>

<head>
    <title>Student Registration Form</title>
</head>

<body>

<form:form action="processForm" modelAttribute="student">

    First name: <form:input path="firstName"/>

    <br><br>

    Last name: <form:input path="lastName"/>

    <br><br>

    Country:

    <form:select path="country">
        <form:options items="${student.countryOptions}"/>
    </form:select>

    <br><br>

    Favorite Language:

    <form:radiobuttons
            path="favoriteLanguage"
            items="${student.favoriteLanguageOptions}"/>

    <br><br>

    Operating Systems:

    Linux <form:checkbox path="operatingSystems" value="Linux"/>
    Mac OS <form:checkbox path="operatingSystems" value="Mac OS"/>
    Windows <form:checkbox path="operatingSystems" value="Windows"/>


    <br><br>


    <input type="submit" , value="Submit"/>


</form:form>

</body>

</html>
