<%@page contentType="text/html" pageEncoding="UTF-8" import="model.Student,dao.StudentDao,java.util.*"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Student Page</title>
    </head>
    <body>
        <%
            
        %>
        <form method="POST">
            <table>
                <thead>
                    <tr>
                        <td>Roll No</td>
                        <td><input type="text" name="txtrno"/></td>
                    </tr>
                    <tr>
                        <td>Student Name</td>
                        <td><input type="text" name="txtname"/></td>
                    </tr>
                    <tr>
                        <td>English</td>
                        <td><input type="text" name="txtenglish"/></td>
                    </tr>
                    <tr>
                        <td>Maths</td>
                        <td><input type="text" name="txtmaths"/></td>
                    </tr>
                    <tr>
                        <td>Science</td>
                        <td><input type="text" name="txtscience"/></td>
                    </tr>
                    <tr>
                        <td colspan=2""><input type="submit" value="submit"/></td>
                    </tr>
                </thead>
            </table>
        </form>
        
        
         <%
            StudentDao sdao = new StudentDao();
            if(request.getMethod().equals("POST")){
                int rno = Integer.parseInt(request.getParameter("txtrno"));
                String name = request.getParameter("txtname");
                int e =  Integer.parseInt(request.getParameter("txtenglish"));
                int m = Integer.parseInt(request.getParameter("txtmaths"));
                int s =  Integer.parseInt(request.getParameter("txtscience"));
                Student st = new Student(rno,name,e,m,s);
                String msg = sdao.AddStudent(st);
                out.println("<h3>"+ msg +"</h3>");
            }
            List<Student> lst = sdao.GetStudent();
        %>
        
        <hr> 
        <h1>Student Details</h1>
        <table border="1" class="table table-">
            <thead>
                <tr>
                    <th>Roll No</th>
                    <th>Student Name</th>
                    <th>English</th>
                    <th>Maths</th>
                    <th>Science</th>
                    <th>Action</th>
                </tr>
            </thead>
            <tbody>
                <%
                    for(Student s : lst){
                %>
                <tr>
                    <td><%=s.getRno()%></td>
                    <td><%=s.getName()%></td>
                    <td><%=s.getEnglish()%></td>
                    <td><%=s.getMaths()%></td>
                    <td><%=s.getScience()%></td>
                    <td><a href="Edit.jsp?rno<%=s.getRno()  %>">Edit</a></td>
                </tr>
                <%
                    }
                %>
            </tbody>
        </table>
            
            
    </body>
</html>
