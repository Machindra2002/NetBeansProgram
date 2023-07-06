
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Product Form</h1>
        <form:form action="save" method="POST">
            <table>
                <tr>
                    <td>Product Id</td>
                    <td><form:input path="pid"></form:input></td>
                </tr>
                <tr>
                    <td>Product Name</td>
                    <td><form:input path="pname"></form:input></td>
                </tr>
                <tr>
                    <td>Rate</td>
                    <td><form:input path="rate"></form:input></td>
                </tr>
                <tr>
                    <td>Tax</td>
                    <td><form:input path="tax"></form:input></td>
                </tr>
                <tr>
                    <td>stock Quantity</td>
                    <td><form:input path="stockq" name="sq"></form:input></td>
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
