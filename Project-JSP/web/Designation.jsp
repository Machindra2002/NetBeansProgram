<%@include file="Header.jsp" %>

<div class="container">
    <form method="post">

        <div class="col-md-4">

            <div class="form-group">
                <lable>Designation Id</lable>
                <input type="text" name="did" class="form-control"/>
            </div>
            <div class="form-group">
                <lable>Designation Nama</lable>
                <input type="text" name="dname" class="form-control"/>
            </div>
            <div class="form-group">
                <input type="submit" value="submit" class="form-control btn btn-danger"/>
            </div>

    </form>
</div>

<%    if (request.getMethod().equals("POST")) {
        int desid = Integer.parseInt(request.getParameter("did"));
        String dname = request.getParameter("dname");

        int cnt = st.executeUpdate("insert into designation values(" + desid + ",'" + dname + "')");
        if (cnt > 0) {
            out.println("data Enter Successfully..");
        } else {
            out.println("Error!!!");
        }
    }
%>
<hr>
<%
    ResultSet rs = st.executeQuery("select * from designation");
%>
<hr>
<div>
    <table cellpadding="5" class="table table-bordered table-hover table-striped">
        <thead>
            <tr>
                <th>Designation Id</th>
                <th>Employee Designation</th>
            </tr>
        </thead>
        <tbody>
            <%
                while (rs.next()) {
                    int desid = rs.getInt("des_id");
                    String dname = rs.getString("designation");
            %>
            <tr>
                <td><%=desid%></td>
                <td><%=dname%></td>
            </tr>
            <%
                }
            %>
        </tbody>

    </table>
</div>
</div>

<%@include file="Footer.jsp" %>