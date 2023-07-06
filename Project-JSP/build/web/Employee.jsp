<%@include file="Header.jsp" %>
<%    ResultSet rciti = st.executeQuery("select * from citiesss");

%>

<div class="container">
    <form method="POST">
        <div class="col-md-4">
            <div class="form-group">
                <label>Employee Id</label>
                <input type="text"  name="eid" class="form-control"/>
            </div>
            <div class="form-group">
                <label>Employee Name</label>
                <input type="text"  name="ename" class="form-control"/>
            </div>
            <div class="form-group">
                <label>Email Id</label>
                <input type="text"  name="email" class="form-control"/>
            </div>
            <div class="form-group">
                <label>Contact Number</label>
                <input type="text"  name="cno" class="form-control"/>
            </div>

            <div class="form-group">
                <label>City Id</label>
                <select name="citiid" class="form-control">
                    <option selected disabled>select city</option>
                    <%                        while (rciti.next()) {
                            int cid = rciti.getInt("citi_id");
                            String cname = rciti.getString("citi_name");

                    %>
                    <option value="<%=cid%>"><%=cname%></option>
                    <%
                        }
                    %>
                </select>
            </div>
            <%
                ResultSet rdes = st.executeQuery("Select * from designation");
            %>
            <div class="form-group">
                <label>Designation Id</label>
                <select name="ddes" class="form-control">
                    <option selected disabled>select Designation</option>
                    <%
                        while (rdes.next()) {
                            int did = rdes.getInt("des_id");
                            String dname = rdes.getString("designation");
                    %>
                    <option value="<%=did%>"><%=dname%></option>
                    <%
                        }
                    %>
                </select>
            </div>

            <div class="form-group">
                <label>Salary</label>
                <input type="text" name="sal" class="form-control"/>
            </div> 

            <div class="form-group">
                <input type="submit" value="submit" class="form-control btn btn-success"/>
            </div>

        </div>
    </form>


    <%
        if (request.getMethod().equals("POST")) {
            int eid = Integer.parseInt(request.getParameter("eid"));
            String ename = request.getParameter("ename");
            String email = request.getParameter("email");
            int mobile = Integer.parseInt(request.getParameter("cno"));
            int cid = Integer.parseInt(request.getParameter("citiid"));
            int des = Integer.parseInt(request.getParameter("ddes"));
            int salary = Integer.parseInt(request.getParameter("sal"));
            int cnt = st.executeUpdate("insert into employeesss values(" + eid + ",'" + ename + "','" + email + "'," + mobile + "," + cid + "," + des + "," + salary + ")");
            if (cnt > 0) {
                out.println("Employee Add Scuccessfully");
            } else {
                out.println("Error!!!");
            }
        }
    %>
    <hr>
    <%
        ResultSet emp = st.executeQuery("select * from employeesss order by emp_id");
    %>
    <div class="col-md-9" cellpadding="1" class="table table-hover table-striped ">
        <table border="1">
            <thead>
                <tr>
                    <th>Emp Id</th>
                    <th>Emp Name</th>
                    <th>Email</th>
                    <th>Mobile No</th>
                    <th>City Id</th>
                    <th>Designation Id</th>
                    <th>Salary</th>
                </tr>
            </thead>
            <tbody>
                <%
                    while (emp.next()) {
                        int eid = emp.getInt("emp_id");
                        String ename = emp.getString("emp_name");
                        String email = emp.getString("email");
                        int mob = emp.getInt("mobile");
                        int cid = emp.getInt("citi_id");
                        int des_id = emp.getInt("des_id");
                        int salary = emp.getInt("salary");
                %>
                <tr>
                    <td><%=eid%></td>
                    <td><%=ename%></td>
                    <td><%=email%></td>
                    <td><%=mob%></td>
                    <td><%=cid%></td>
                    <td><%=des_id%></td>
                    <td><%=salary%></td>
                </tr>
                <%
                    }
                %>
            </tbody>
        </table>

    </div>

</div>


<%@include file="Footer.jsp" %>
