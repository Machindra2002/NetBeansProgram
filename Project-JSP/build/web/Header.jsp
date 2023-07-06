<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.sql.*;,java.util.*;" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="Bootstrap Files/css/bootstrap.min.css" rel="stylesheet" type="text/css"/>
        <script src="Bootstrap Files/js/bootstrap.min.js" type="text/javascript"></script>
        <script src="Bootstrap Files/js/jquery.min.js" type="text/javascript"></script>

        <title>Project</title>
    </head>
    <body>
        <%
            Class.forName("oracle.jdbc.OracleDriver");
            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","root");
            Statement st = con.createStatement();
        %>
        <div class="container" style="width:100%">

            <div class="navbar navbar-inverse">
                <ul class="nav navbar-nav">
                    <li><a href="#">CIIT INSTITUTE</a></li>
                </ul>
                <ul class="nav navbar-nav navbar-right">
                    <li><a href="#">Login</a></li>
                </ul>
            </div>

        </div>


        <div class="container">

            <div class="row">

                <div class="col-md-3" style="min-height: 700px;border-right:1px solid black  ">
                    <ul class="list-group">
                        <li class="list-group-item"><a href="Dashboard.jsp">Dashboard</a></li>
                        <li class="list-group-item"><a href="State2.jsp">state</a></li>
                        <li class="list-group-item"><a href="City.jsp">City</a></li>
                        <li class="list-group-item"><a href="Designation.jsp">Designation</a></li>
                        <li class="list-group-item"><a href="Employee.jsp">Employee</a></li>
                    </ul>
                </div>

                <div class="col-md-9">
                    <div Style="min-height: 500px; width: 100%">

