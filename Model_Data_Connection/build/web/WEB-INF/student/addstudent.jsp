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
        <f:form action="save" method="post">
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
                        <td>Gender</td>
                        <td>
                        <f:radiobutton path="gender" value="Male"></f:radiobutton>Male
                        <f:radiobutton path="gender" value="Female"></f:radiobutton>Female
                        </td>
                    </tr>
                    <tr>
                        <td>City</td>
                        <td>
                        <f:select path="city">
                            <f:option value="0" selected="true" disabled="true">Select City</f:option>
                            <f:options items="${cities}" itemLabel="city_name" itemValue="city_id"></f:options>
                        </f:select>
                    </td>
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
                        <td>
                            <input type="submit" value="submit"/>
                        </td>
                    </tr>
                </table>
        </f:form>
    </body>
</html>
