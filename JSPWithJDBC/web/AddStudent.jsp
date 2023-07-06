
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page  import="java.sql.*" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Add New Student</h1>
        <form method="post">
            <table>
                <tr>
                    <td>Roll No:</td>
                    <td><input type="text" name="txtrno" /></td>
                </tr>
                <tr>
                    <td>Student Name:</td>
                    <td><input type="text" name="txtname" /></td>
                </tr>
                <tr>
                    <td>English:</td>
                    <td><input type="text" name="txtenglish" /></td>
                </tr>
                <tr>
                    <td>Maths:</td>
                    <td><input type="text" name="txtmaths" /></td>
                </tr>
                <tr>
                    <td>Science:</td>
                    <td><input type="text" name="txtscience" /></td>
                </tr>
                <tr>
                    <td colspan="2">
                        <input type="submit"  value="Submit" />
                        &nbsp;
                        <a href="Display.jsp">View Students</a>
                    </td>
                </tr>

            </table>
        </form>

        <%
            Class.forName("oracle.jdbc.OracleDriver");
            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "root");
//            String method=request.getMethod();
//            out.println(method);
            if (request.getMethod().equals("POST")) {
                int r = Integer.parseInt(request.getParameter("txtrno"));
                String n = request.getParameter("txtname");
                float e = Float.parseFloat(request.getParameter("txtenglish"));
                float m = Float.parseFloat(request.getParameter("txtmaths"));
                float s = Float.parseFloat(request.getParameter("txtscience"));
                Statement st = con.createStatement();
                int cnt = st.executeUpdate("insert into tblstudents values(" + r + ",'" + n + "'," + e + "," + m + "," + s + ")");
                if (cnt > 0) {
                    out.println("<h2>Student Added Successfully</h2>");
                } else {
                    out.println("<h2>Error!!!!</h2>");

                }
            }
        %>
    </body>
</html>
