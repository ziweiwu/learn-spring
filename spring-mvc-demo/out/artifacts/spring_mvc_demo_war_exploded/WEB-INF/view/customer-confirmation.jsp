<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>

<head>
    <title>Customer Confirmation</title>
</head>

<body>

The customer is confirmed: ${customer.firstName} ${customer.lastName}

<br><br>

The customer has: ${customer.freePasses} free passes

<br><br>

Customer's postal code: ${customer.postalCode}

<br><br>

Course code: ${customer.courseCode}


</body>

</html>

