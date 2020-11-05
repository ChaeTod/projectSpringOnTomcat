<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
    <head>
        <title>Student registration form</title>
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
                    <!-- items - refer to the collection of data
                         spring will call student.getCountryOptions
                    -->
                </form:select>

            <br><br>

            Favorite Language:

            <!-- On submit spring will call student.setFavoriteLanguage() -->
            Java <form:radiobutton path="favoriteLanguage" value="Java"/>
            C# <form:radiobutton path="favoriteLanguage" value="C#"/>
            PHP <form:radiobutton path="favoriteLanguage" value="PHP"/>
            Ruby <form:radiobutton path="favoriteLanguage" value="Ruby"/>
            Python <form:radiobutton path="favoriteLanguage" value="Python"/>

            <br><br>

            Operating Systems:

            <!-- On submit spring will call student.setOperatingSystems() -->
            Linux <form:checkbox path="operatingSystems" value="linux"/>
            Mac OS <form:checkbox path="operatingSystems" value="Mac OS"/>
            MS Windows <form:checkbox path="operatingSystems" value="MS Windows"/>

            <br><br>

            <input type="submit" value="Submit"/>
        </form:form>
    </body>
</html>
