<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Students</title>
    </head>

    <body>
        <h1>Student form</h1>
        <form:form action="save" method="POST">
            <table>
                <tr>
                    <td>Roll No</td>
                    <td><form:input path="rno"></form:input></td>
                    </tr>
                    <tr>
                        <td>Student Name</td>
                        <td><form:input path="name"></form:input></td>
                    <form:form></form:form>
                    </tr>
                    <tr>
                        <td>English</td>
                        <td><form:input path="english"></form:input></td>
                    </tr>
                    <tr>
                        <td>Maths</td>
                        <td><form:input path="maths"></form:input></td>
                    </tr>
                    <tr>
                        <td>Science</td>
                        <td><form:input path="science"></form:input></td>
                    </tr>
                    <tr>
                        <td>
                            <input type="submit" value="submit"/>
                        </td>
                    </tr>       
                </table>
        </form:form>
    </body>

</html>
