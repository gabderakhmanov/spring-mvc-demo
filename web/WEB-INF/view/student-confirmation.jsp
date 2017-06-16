<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<body>
<h2>Student confirmation:</h2>
<br>
<br>

Name: ${student.firstName} ${student.lastName}
<br><br>
Country: ${student.country}
<br><br>
Favorite Language: ${student.favoriteLanguage}
<br><br>
Operating System:
    <ul>
        <c:forEach var="item" items="${student.operatingSystem}" >
            <li>${item}</li>
        </c:forEach>
    </ul>


</body>

</html>