<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="s"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <a href="/Model_Data_Connection/add">add student</a>
        <hr>
        <h1>Student Information</h1>
        <table border="1">
            <head>
            <tr>
                <th>Roll No</th>
                <th>Student Name</th>
                <th>English</th>
                <th>Maths</th>
                <th>Science</th>
                <th>city</th>
                <th>Gender</th>
                <th>Total</th>
                <th>Percentage</th>
                <!--<th>Grade</th>-->
                <th>Action</th>
            </tr>
        </head>
        <tbody>
            <s:forEach var="ss" items="${students}">
                <tr>
                    <td>${ss.rno}</td>
                    <td>${ss.name}</td>
                    <td>${ss.english}</td>
                    <td>${ss.maths}</td>
                    <td>${ss.science}</td>
                    <td>${ss.city}</td>
                    <td>${ss.gender}</td>
                    <td>${ss.english+ss.maths+ss.science}</td>
                    <td>${ss.english/3+ss.maths/3+ss.science/3}</td>
                    
                        <%
//                           String grade="";
//                           if( grade>35 && grade<=50){
//                            out.println("C");
//                           }
                        %>
                       
                    </td>
                    <td>
                        <a href="/Model_Data_Connection/Edit/${ss.rno}">Edit</a>
                        &nbsp;
                        <a href="/Model_Data_Connection/Delete/${ss.rno}">Delete</a>
                    </td>
                </tr>
            </s:forEach>
        </tbody>
    </table>
</body>
</html>
