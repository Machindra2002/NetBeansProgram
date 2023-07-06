
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page  import="java.sql.*,java.util.*" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
            Class.forName("oracle.jdbc.OracleDriver");
            Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","root");
            Statement st=con.createStatement();
            ResultSet rs=st.executeQuery("select * from tblstudents");
        %>
            
        <a href="AddStudent.jsp">Add Student</a>

        <h1>All Students!</h1>
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
                <%
                    while(rs.next())
                    {
                        int r=rs.getInt("rno");
                        String n=rs.getString("name");
                        float e=rs.getFloat("english");
                        float m=rs.getFloat("maths");
                        float s=rs.getFloat("science");
                        %>
                        <tr>
                            <td><%=r %> </td>
                            <td><%=n %> </td>
                            <td><%=e %> </td>
                            <td><%=m %> </td>
                            <td><%=s %> </td>
                        </tr>
                        
                        <%
                        
                    }
                    %>
            </tbody>
        </table>
    </body>
</html>
