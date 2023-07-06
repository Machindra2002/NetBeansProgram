<%@include file="Header.jsp" %>

<div class="container">
    <form method="POST">
        <table>
            <tr>
                <th>
                    State ID:
                </th>
                <th>
                    <input class="form-control" type="text" name="txtsid"/>
                </th>
            </tr>
            <tr>
                <th>
                    State Name:
                </th>
                <th>
                    <input class="form-control" type="text" name="txtname"/>
                </th>
            </tr>
            <tr>
                <th>
                    <input class="form-control btn btn-success" type="Submit" value="Submit"/>
                </th>
            </tr>
        </table>
    </form>
    <%       
            if (request.getMethod().equals("POST")) {
            int sid = Integer.parseInt(request.getParameter("txtsid"));
            String snm = request.getParameter("txtname");
            int cnt = st.executeUpdate("insert into state_s values(" + sid + ",'" + snm + "')");
            if (cnt > 0) {
                out.println("<h2>Data Added Successfully</h2>");
            } else {
                out.println("<h2>Error....!!!!</h2>");
            }
        }
    %>
    <hr>
    <%
        ResultSet rs = st.executeQuery("Select * from state_s");
    %>
    <div class="col-md-9">
        <table border="1"cellpadding="5" cellspacing="1" class="table table-bordered table-striped table-hover">
            <thead style="background:greenyellow">
                <tr>
                    <th>State_Id</th>
                    <th>State_Name</th>
                </tr>
            </thead>
            <tbody>
                <%
                    while (rs.next()) {
                        int stid = rs.getInt("state_id");
                        String stnm = rs.getString("State_name");
                %>
                <tr>
                    <td><%=stid%></td>
                    <td><%=stnm%></td>
                </tr>
                <%
                    }
                %>
            </tbody>
        </table>
    </div>
</div>
<%@include file="Footer.jsp" %>