package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import model.Student;
import dao.StudentDao;
import java.util.*;

public final class Student_005fUpdate_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

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
      response.setContentType("text/html;charset=UTF-8");
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Student Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("       //Update Student Code\n");
      out.write("       \n");
      out.write("        <form method=\"POST\">\n");
      out.write("            <table>\n");
      out.write("                <thead>\n");
      out.write("                    <tr>\n");
      out.write("                        <td>Roll No</td>\n");
      out.write("                        <td><input type=\"text\" name=\"txtrno\"/></td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td>Student Name</td>\n");
      out.write("                        <td><input type=\"text\" name=\"txtname\"/></td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td>English</td>\n");
      out.write("                        <td><input type=\"text\" name=\"txtenglish\"/></td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td>Maths</td>\n");
      out.write("                        <td><input type=\"text\" name=\"txtmaths\"/></td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td>Science</td>\n");
      out.write("                        <td><input type=\"text\" name=\"txtscience\"/></td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td colspan=2\"\"><input type=\"submit\" value=\"submit\"/></td>\n");
      out.write("                    </tr>\n");
      out.write("                </thead>\n");
      out.write("            </table>\n");
      out.write("        </form>\n");
      out.write("        \n");
      out.write("        \n");
      out.write("         ");

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
        
      out.write("\n");
      out.write("        \n");
      out.write("               \n");
      out.write("        <h1>Student Details</h1>\n");
      out.write("        <table border=\"1\">\n");
      out.write("            <thead>\n");
      out.write("                <tr>\n");
      out.write("                    <th>Roll No</th>\n");
      out.write("                    <th>Student Name</th>\n");
      out.write("                    <th>English</th>\n");
      out.write("                    <th>Maths</th>\n");
      out.write("                    <th>Science</th>\n");
      out.write("                    <th>Action</th>\n");
      out.write("                </tr>\n");
      out.write("            </thead>\n");
      out.write("            <tbody>\n");
      out.write("                ");

                    for(Student s : lst){
                
      out.write("\n");
      out.write("                <tr>\n");
      out.write("                    <td>");
      out.print(s.getRno());
      out.write("</td>\n");
      out.write("                    <td>");
      out.print(s.getName());
      out.write("</td>\n");
      out.write("                    <td>");
      out.print(s.getEnglish());
      out.write("</td>\n");
      out.write("                    <td>");
      out.print(s.getMaths());
      out.write("</td>\n");
      out.write("                    <td>");
      out.print(s.getScience());
      out.write("</td>\n");
      out.write("                    <td><a href=\"Edit.jsp\">Edit</a></td>\n");
      out.write("                </tr>\n");
      out.write("                ");

                    }
                
      out.write("\n");
      out.write("            </tbody>\n");
      out.write("        </table>\n");
      out.write("            \n");
      out.write("            \n");
      out.write("    </body>\n");
      out.write("</html>\n");
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
