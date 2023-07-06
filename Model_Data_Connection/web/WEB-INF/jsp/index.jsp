<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Welcome to Spring Web MVC project</title>
    </head>

    <body>
        <p>Hello! This is the default welcome page for a Spring Web MVC project.</p>
        <p><i>To display a different welcome page for this project, modify</i>
            <tt>index.jsp</tt> <i>, or create your own welcome page then change
                the redirection in</i> <tt>redirect.jsp</tt> <i>to point to the new
                welcome page and also update the welcome-file setting in</i>
            <tt>web.xml</tt>.</p>
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
    <f:options items="${cities}" itemLabel="city_id" itemValue="city_name"></f:options>
</f:select>
</td>
</tr>
</body>
</html>
