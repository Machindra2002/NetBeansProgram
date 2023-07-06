<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="f"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Student Form</h1>
        <f:form action="/Model_Data_Connection/update" method="POST">
            <table>
                <tr>
                    <td>Roll no</td>
                    <td><f:input path="rno"></f:input></td>
                    </tr>
                    <tr>
                        <td>Student Name</td>
                        <td><f:input path="name"></f:input></td>
                    </tr>
                 
                <tr>
                    <td>English</td>
                    <td><f:input path="english"></f:input></td>
                    </tr>
                    <tr>
                        <td>Maths</td>
                        <td><f:input path="maths"></f:input></td>
                    </tr>
                    <tr>
                        <td>Science</td>
                        <td><f:input path="science"></f:input></td>
                    </tr>
                    <tr>
                        <td>
                            <input type="submit" value="update"/>
                        </td>
                    </tr>
                </table>
        </f:form>
    </body>
</html>
