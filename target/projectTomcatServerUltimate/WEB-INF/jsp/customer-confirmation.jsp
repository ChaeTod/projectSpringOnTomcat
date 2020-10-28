<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Customer Confirmation</title>
</head>
<body>
    The customer is  confirmed: ${customer.firstName} ${customer.lastName}

    <br><br>

    Free pases: ${customer.freePasses}

    <br><br>

    Postal code: ${customer.postalCode}

    <br><br>

    Course code: ${customer.courseCode}
</body>
</html>
