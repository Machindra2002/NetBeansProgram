<%@include file="Header.jsp" %>
<div class="container">
    <form method="post">
        <table>
            <tr class="form-group">
                    <th>
                        State Id
                    </th>
                    <th>
                        <input class="form-control" type="text" name="sid"/>
                    </th>
                </tr>
                <tr class="form-group">
                    <th>
                        State Name
                    </th>
                    <th>
                        <input class="form-control" type="text" name="sname"/>
                    </th>
                </tr>
                <tr class="form-group">
                    <th>
                        <input class="form-control btn btn-success" type="Submit" value="submit"/>
                    </th>
                </tr>
        </table>
    </form>

    <%    if (request.getMethod().equals("POST")) {
            int sid = Integer.parseInt(request.getParameter("sid"));
            String sname = request.getParameter("sname");
            int cnt = st.executeUpdate("insert into States values(" + sid + ",'" + sname + "')");
            if (cnt > 0) {
                out.println("Data Enter Successfully");
            } else {
                out.println("Error!!!");
            }
        }

    %>
    <hr>
    <%        
        ResultSet rs = st.executeQuery("Select * from states");
    %> 

    <div class="col-md-9">
        <table border="1" cellpadding="5" cellspacing="1" class="table table-bordered table-striped">
            <thead>
                <tr>
                    <th>State Id</th>
                    <th>State Name</th>
                </tr>
            </thead>
            <tbody>

                <%
                    while (rs.next()) {
                        int sid = rs.getInt("state_id");
                        String sname = rs.getString("state_name");
                %>
                <tr>
                    <td><%=sid%></td>
                    <td><%=sname%></td>
                </tr>
                <%
                    }
                %>
            </tbody>

        </table>
    </div>
</div>
                
     
<%@include file="Footer.jsp" %>