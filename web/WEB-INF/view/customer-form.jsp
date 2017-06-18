<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<body>

    <form:form action="customerProcessForm" modelAttribute="customer">
        
        First Name: <form:input path="firstName" />
        <br/><br/>
        Last Name: <form:input path="lastName"/>
        <form:errors path="lastName" />
        <br/>
        <br/>
        Free Passes: <form:input path="freePasses"/>
        <form:errors path="freePasses" />
        <br/>
        <br/>
        Post Code: <form:input path="postCode"/>
        <form:errors path="postCode" />
        <br/>
        <br/>
        <input type="submit" value="Submit" />

    </form:form>

</body>
</html>