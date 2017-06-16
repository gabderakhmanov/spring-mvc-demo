<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<body>

<form:form action="processForm" modelAttribute="student">

        First Name: <form:input path="firstName"/>
        <br><br>
        Last Name: <form:input path="lastName"/>
        <br><br>
        Country:
        <form:select path="country">
            <form:options items="${theCountryOptions}" />
        </form:select>


        <br><br>

        Favorite Language:
        Java<form:radiobutton path="favoriteLanguage" value="Java"/>
        PHP<form:radiobutton path="favoriteLanguage" value="PHP"/>
        C++<form:radiobutton path="favoriteLanguage" value="C++"/>
        Ruby<form:radiobutton path="favoriteLanguage" value="Ruby"/>

        <br><br>

        Operating System:
        Linux<form:checkbox path="operatingSystem" value="Linux"/>
        Mac<form:checkbox path="operatingSystem" value="Mac OS"/>
        Win<form:checkbox path="operatingSystem" value="Win OS"/>

        <br><br>


        <input type="submit" value="Submit" />

</form:form>

</body>

</html>