<%@include file="Header.jsp" %>
<%    ResultSet rstate = st.executeQuery("Select * from States");
%>


<div class="container">
    <form method="POST">
        <div class="col-md-4">
            <div class="form-group">
                <label>State</label>
                <select name="ddstate" class="form-control">
                    <option selected disabled>Select State</option>
                    <%
                        while (rstate.next()) {
                            int sid = rstate.getInt("state_id");
                            String sname = rstate.getString("state_name");
                    %>
                    <option value="<%=sid%>"><%=sname%></option>
                    <%
                        }
                    %>

                </select>

            </div>
            <div class="form-group">
                <label>City Id</label>
                <input type="text" name="cid" class="form-control"/>
            </div>
            <div class="form-group">
                <label>City Name</label>
                <input type="text" name="cname" class="form-control"/>
            </div>
            <div class="form-group">

                <input type="submit" value="submit" class="form-control btn btn-success"/>
            </div>
    </form>
</div>
<%      if (request.getMethod().equals("POST")) {
        int cid = Integer.parseInt(request.getParameter("cid"));
        String cname = request.getParameter("cname");
        int sid = Integer.parseInt(request.getParameter("ddstate"));
        int cnt = st.executeUpdate("insert into citiesss values(" + cid + ",'" + cname + "'," + sid + ")");

        if (cnt > 0) {
            out.println("Date Enter Successfully..");
        } else {
            out.println("Error!!!");
        }
    }
%>
<hr>
<%
    ResultSet rs = st.executeQuery("select * from citiesss");
%>
<hr>
<div class="col-md-9">
    <table border="1"cellpadding="5" cellspacing="1" class="table table-bordered table-striped table-hover">
        <thead style="background: yellowgreen">
            <tr>
                <th>city Id</th>
                <th>city name</th>
                <th>State Id</th>
            </tr>
        </thead>
        <tbody>
            <%
                while (rs.next()) {
                    int cid = rs.getInt("citi_id");
                    String cname = rs.getString("citi_name");
                    int sid = rs.getInt("state_id");
            %>
            <tr>
                <td><%=cid%></td>
                <td><%=cname%></td>
                <td><%=sid%></td>
            </tr>
            <%
                }
            %>
        </tbody>

    </table>
</div>
</div>
<%@include file="Footer.jsp" %>