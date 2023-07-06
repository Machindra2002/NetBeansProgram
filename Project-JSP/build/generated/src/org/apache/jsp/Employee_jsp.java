package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;;
import java.util.*;;

public final class Employee_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(2);
    _jspx_dependants.add("/Header.jsp");
    _jspx_dependants.add("/Footer.jsp");
  }

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <link href=\"Bootstrap Files/css/bootstrap.min.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <script src=\"Bootstrap Files/js/bootstrap.min.js\" type=\"text/javascript\"></script>\n");
      out.write("        <script src=\"Bootstrap Files/js/jquery.min.js\" type=\"text/javascript\"></script>\n");
      out.write("\n");
      out.write("        <title>Project</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");

            Class.forName("oracle.jdbc.OracleDriver");
            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","root");
            Statement st = con.createStatement();
        
      out.write("\n");
      out.write("        <div class=\"container\" style=\"width:100%\">\n");
      out.write("\n");
      out.write("            <div class=\"navbar navbar-inverse\">\n");
      out.write("                <ul class=\"nav navbar-nav\">\n");
      out.write("                    <li><a href=\"#\">CIIT INSTITUTE</a></li>\n");
      out.write("                </ul>\n");
      out.write("                <ul class=\"nav navbar-nav navbar-right\">\n");
      out.write("                    <li><a href=\"#\">Login</a></li>\n");
      out.write("                </ul>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("        <div class=\"container\">\n");
      out.write("\n");
      out.write("            <div class=\"row\">\n");
      out.write("\n");
      out.write("                <div class=\"col-md-3\" style=\"min-height: 700px;border-right:1px solid black  \">\n");
      out.write("                    <ul class=\"list-group\">\n");
      out.write("                        <li class=\"list-group-item\"><a href=\"Dashboard.jsp\">Dashboard</a></li>\n");
      out.write("                        <li class=\"list-group-item\"><a href=\"State2.jsp\">state</a></li>\n");
      out.write("                        <li class=\"list-group-item\"><a href=\"City.jsp\">City</a></li>\n");
      out.write("                        <li class=\"list-group-item\"><a href=\"Designation.jsp\">Designation</a></li>\n");
      out.write("                        <li class=\"list-group-item\"><a href=\"Employee.jsp\">Employee</a></li>\n");
      out.write("                    </ul>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <div class=\"col-md-9\">\n");
      out.write("                    <div Style=\"min-height: 500px; width: 100%\">\n");
      out.write("\n");
      out.write('\n');
    ResultSet rciti = st.executeQuery("select * from citiesss");


      out.write("\n");
      out.write("\n");
      out.write("<div class=\"container\">\n");
      out.write("    <form method=\"POST\">\n");
      out.write("        <div class=\"col-md-4\">\n");
      out.write("            <div class=\"form-group\">\n");
      out.write("                Employee Id\n");
      out.write("                <input type=\"text\"  name=\"eid\" class=\"form-control\"/>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"form-group\">\n");
      out.write("               Employee Name\n");
      out.write("                <input type=\"text\"  name=\"ename\" class=\"form-control\"/>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"form-group\">\n");
      out.write("               Email Id\n");
      out.write("                <input type=\"text\"  name=\"email\" class=\"form-control\"/>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"form-group\">\n");
      out.write("                Contact Number\n");
      out.write("                <input type=\"text\"  name=\"cno\" class=\"form-control\"/>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <div class=\"form-group\">\n");
      out.write("                City Id\n");
      out.write("                <select name=\"citiid\" class=\"form-control\">\n");
      out.write("                    <option selected disabled>select city</option>\n");
      out.write("                    ");
                        while (rciti.next()) {
                            int cid = rciti.getInt("citi_id");
                            String cname = rciti.getString("citi_name");

                    
      out.write("\n");
      out.write("                    <option value=\"");
      out.print(cid);
      out.write('"');
      out.write('>');
      out.print(cname);
      out.write("</option>\n");
      out.write("                    ");

                        }
                    
      out.write("\n");
      out.write("                </select>\n");
      out.write("            </div>\n");
      out.write("            ");

                ResultSet rdes = st.executeQuery("Select * from designation");
            
      out.write("\n");
      out.write("            <div class=\"form-group\">\n");
      out.write("               Designation Id\n");
      out.write("                <select name=\"ddes\" class=\"form-control\">\n");
      out.write("                    <option selected disabled>select Designation</option>\n");
      out.write("                    ");

                        while (rdes.next()) {
                            int did = rdes.getInt("des_id");
                            String dname = rdes.getString("designation");
                    
      out.write("\n");
      out.write("                    <option value=\"");
      out.print(did);
      out.write('"');
      out.write('>');
      out.print(dname);
      out.write("</option>\n");
      out.write("                    ");

                        }
                    
      out.write("\n");
      out.write("                </select>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <div class=\"form-group\">\n");
      out.write("               Salary\n");
      out.write("                <input type=\"text\" name=\"sal\" class=\"form-control\"/>\n");
      out.write("            </div> \n");
      out.write("\n");
      out.write("            <div class=\"form-group\">\n");
      out.write("                <input type=\"submit\" value=\"submit\" class=\"form-control btn btn-success\"/>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("    </form>\n");
      out.write("\n");
      out.write("\n");
      out.write("    ");

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
    
      out.write("\n");
      out.write("    <hr>\n");
      out.write("    ");

        ResultSet emp = st.executeQuery("select * from employeesss order by emp_id");
    
      out.write("\n");
      out.write("    <div class=\"col-md-9\" cellpadding=\"1\" class=\"table table-hover table-striped \">\n");
      out.write("        <table border=\"1\">\n");
      out.write("            <thead>\n");
      out.write("                <tr>\n");
      out.write("                    <th>Emp Id</th>\n");
      out.write("                    <th>Emp Name</th>\n");
      out.write("                    <th>Email</th>\n");
      out.write("                    <th>Mobile No</th>\n");
      out.write("                    <th>City Id</th>\n");
      out.write("                    <th>Designation Id</th>\n");
      out.write("                    <th>Salary</th>\n");
      out.write("                </tr>\n");
      out.write("            </thead>\n");
      out.write("            <tbody>\n");
      out.write("                ");

                    while (emp.next()) {
                        int eid = emp.getInt("emp_id");
                        String ename = emp.getString("emp_name");
                        String email = emp.getString("email");
                        int mob = emp.getInt("mobile");
                        int cid = emp.getInt("citi_id");
                        int des_id = emp.getInt("des_id");
                        int salary = emp.getInt("salary");
                
      out.write("\n");
      out.write("                <tr>\n");
      out.write("                    <td>");
      out.print(eid);
      out.write("</td>\n");
      out.write("                    <td>");
      out.print(ename);
      out.write("</td>\n");
      out.write("                    <td>");
      out.print(email);
      out.write("</td>\n");
      out.write("                    <td>");
      out.print(mob);
      out.write("</td>\n");
      out.write("                    <td>");
      out.print(cid);
      out.write("</td>\n");
      out.write("                    <td>");
      out.print(des_id);
      out.write("</td>\n");
      out.write("                    <td>");
      out.print(salary);
      out.write("</td>\n");
      out.write("                </tr>\n");
      out.write("                ");

                    }
                
      out.write("\n");
      out.write("            </tbody>\n");
      out.write("        </table>\n");
      out.write("\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("            <div>\n");
      out.write("                <p>@Copywrite <a href=\"https://www/ciitinstitute.com\" target=\"blank\">CIIT Training Institute</a></p>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("</html>\n");
      out.write('\n');
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
