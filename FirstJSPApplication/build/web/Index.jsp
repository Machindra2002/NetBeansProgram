<%-- 
    Document   : Index
    Created on : Feb 8, 2023, 4:28:45 PM
    Author     : lenovo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Welcome to JSP Application</h1>
        <%
            int a=10,b=20,c;
            c=a+b;
            out.println("<h2>Addition="+c+"</h2>");
            %>
            
    </body>
</html>
