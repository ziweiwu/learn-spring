<%--
  Created by IntelliJ IDEA.
  User: ziweiwu
  Date: 2019-04-24
  Time: 10:07
  To change this template use File | Settings | File Templates.
--%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>

<head>
    <title>Student Confirmation</title>
</head>

<body>

The student is confirmed: ${student.firstName} ${student.lastName}

<br><br>

Country: ${student.country}

<br><br>

Favorite Language: ${student.favoriteLanguage}

<br><br>

Operating Systems :

<ul>
    <c:forEach var="temp" items="${student.operatingSystems}">

        <li>${temp}</li>

    </c:forEach>

</ul>

<br><br>

</body>

</html>

