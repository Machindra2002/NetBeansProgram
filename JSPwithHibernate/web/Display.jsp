<%@page contentType="text/html" pageEncoding="UTF-8"
        import="model.Employee, dao.EmployeeDao,java.util.*"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Employees List</h1>
        <table>
            <thead>
                <tr>
                    <th>Employee Id</th>
                    <th>Employee Name</th>
                    <th>Designation</th>
                    <th>Salary</th>
                </tr>
            </thead>
            <tbody>
                <%
                    EmployeeDao edao = new EmployeeDao();
                    List<Employee> lst = edao.GetEmployee();
                    for (Employee e : lst) {
                %>
                <tr>
                    <td><%=e.getEmployee_id() %></td>
                    <td><%=e.getEmployee_name() %></td>
                    <td><%=e.getDesignation()%></td>
                    <td><%=e.getSalary() %></td>
                </tr>
                <%
                    }
                %>
            </tbody>
        </table>

    </body>
</html>
