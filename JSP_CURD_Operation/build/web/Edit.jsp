<%@page contentType="text/html" pageEncoding="UTF-8" import="model.Student,dao.StudentDao,java.util.*"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title> Page</title>
    </head>
    <body>
        <%
            StudentDao sdao = new StudentDao();
            int rn = Integer.parseInt(request.getParameter("rno"));
            Student std = sdao.GetStudent(rn);
        %>
        <form method="post">
            <table>
                <thead>
                    <tr>
                        <td>Roll No</td>
                        <td><input type="text" name="txtrno" value="<%=std.getRno()%>"/></td>
                    </tr>
                    <tr>
                        <td>Student Name</td>
                        <td><input type="text" name="txtname" value="<%=std.getName()%>"/></td>
                    </tr>
                    <tr>
                        <td>English</td>
                        <td><input type="text" name="txtenglish" value="<%=std.getEnglish()%>"/></td>
                    </tr>
                    <tr>
                        <td>Maths</td>
                        <td><input type="text" name="txtmaths" value="<%=std.getMaths()%>"/></td>
                    </tr>
                    <tr>
                        <td>Science</td>
                        <td><input type="text" name="txtscience" value="<%=std.getScience()%>"/></td>
                    </tr>
                    <tr>
                        <td colspan=2"">
                            <input type="submit" value="update"/>
                            &nbsp;
                            <a href="Student.jsp">Back</a>
                        </td>
                    </tr>
                </thead>
            </table>



            <%
                if (request.getMethod().equals("POST")) {
                    int rno = Integer.parseInt(request.getParameter("txtrno"));
                    String name = request.getParameter("txtname");
                    int e = Integer.parseInt(request.getParameter("txtenglish"));
                    int m = Integer.parseInt(request.getParameter("txtmaths"));
                    int s = Integer.parseInt(request.getParameter("txtscience"));
                    Student st = new Student(rno, name, e, m, s);
                    String msg = sdao.UpdateStudent(st);
    //                out.println("<h3>" + msg + "</h3>");
                    response.sendRedirect("Student.jsp");
                }
            %>
        </form>
    </body>
</html>
