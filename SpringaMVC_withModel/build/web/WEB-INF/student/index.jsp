<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>student</title>
    </head>
    <body>
        <a href="/SpringaMVC_withModel/add">Add Student</a>
        <hr>
        <h1>Students</h1>
        <table border="1">
            <thead>
                <tr>
                    <th>Roll No</th>
                    <th>Student Name</th>
                    <th>English</th>
                    <th>Maths</th>
                    <th>Science</th>
                </tr>
            </thead>
            <tbody>
                <c:forEach var="s" items="${students}">
                    <tr>
                        <td>${s.rno}</td>
                        <td>${s.name}</td>
                        <td>${s.english}</td>
                        <td>${s.maths}</td>
                        <td>${s.science}</td>
                    </tr>
                </c:forEach>
            </tbody>
        </table>
    </body>
</html>
