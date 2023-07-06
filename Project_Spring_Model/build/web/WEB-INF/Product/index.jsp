<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="p"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <a href="/Project_Spring_Model/pdt">AddProduct</a>       
        <hr>

        <h1>Product Information</h1>
        <table border="1">
            <thead>
                <tr>
                    <td>Product Id</td>
                    <td>Product Name</td>
                    <td>Rate</td>
                    <td>Tax</td>
                    <td>S_Quantity</td>
                    <td>Status</td>
                </tr>
            </thead>
            <tbody>
                <p:forEach var="pp" items="${products}">
                    <tr>
                        <td>${pp.pid}</td>
                        <td>${pp.pname}</td>
                        <td>${pp.rate}</td>
                        <td>${pp.tax}</td>
                        <td>${pp.stockq}</td>
                        <td>
                            <p:choose>
                                <p:when test="${pp.stockq<0}">
                                    Invalid
                                </p:when>
                                <p:when test="${pp.stockq>0 and pp.stockq <=10}">
                                    Limited Stock 
                                </p:when>
                                <p:otherwise>
                                    Avaliable
                                </p:otherwise>   
                            </p:choose>
                        </td>
                    </tr>
                </p:forEach>
            </tbody>
        </table>
    </body>
</html>
