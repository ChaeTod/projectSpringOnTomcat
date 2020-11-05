<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!-- a reference to a JSTL core tag library - will give each tag for looping over
      a collection with forEach-->
<html>
    <head>
        <title>Student confirmation</title>

    </head>
    <body>

        The student is confirmed: ${student.firstName} ${student.lastName}

        <br><br>

        Country: ${student.country}

        <br><br>

        <!-- here spring will call student.getFavoriteLanguage() -->
        Favorite language: ${student.favoriteLanguage}

        <br><br>

        Operating systems:

        <ul>
            <!-- Spring will call student.getOperationSystems()  -->
            <c:forEach var="temp" items="${student.operatingSystems}">
                <li> ${temp} </li>
            </c:forEach>
        </ul>
    </body>
</html>
