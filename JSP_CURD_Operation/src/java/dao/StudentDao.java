package dao;

import model.Student;
import java.sql.*;
import java.util.*;

public class StudentDao {

    Connection con;
    Statement st;
    ResultSet rs;

    public StudentDao() {
        try {
            Class.forName("oracle.jdbc.OracleDriver");
            con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "root");
        } catch (Exception ex) {
            System.out.println("Exception=>" + ex.getMessage());
        }
    }

    public String AddStudent(Student s) {
        String msg="";
        try {
            st = con.createStatement();
            int cnt = st.executeUpdate("insert into tblstudents(rno,name,english,maths,science) values(" + s.getRno() + ",'" + s.getName() + "'," + s.getEnglish() + "," + s.getMaths() + "," + s.getScience() + ")");
            if (cnt > 0) {
                msg = "Data enter successfully";
            } else {
                msg = "Error!!!";
            }
        } catch (Exception ex) {
            msg = ("Exception=>" + ex.getMessage());
        }
        return msg;
    }

    public String UpdateStudent(Student s) {
        String msg="";
        try {
            st = con.createStatement();
            int cnt = st.executeUpdate("update tblStudents set=Name='" + s.getName() + "',English=" + s.getEnglish() + ",Maths=" + s.getMaths() + ",Science=" + s.getScience() + 
                                        " where RollNO=" + s.getRno() + ")");
            if (cnt > 0) {
                msg = "Update entry successfully";
            } else {
                msg = "Error!!!";
            }
        } catch (Exception ex) {
            msg = ("Exception=>" + ex.getMessage());
        }
        return msg;
    }

    public String DeleteStudent(int rno) {
        String msg = "";
        try {
            st = con.createStatement();
            int cnt = st.executeUpdate("delete from tblstudents where RollNO =" + rno);
            if (cnt > 0) {
                msg = "Delete Student successfully";
            } else {
                msg = "Error!!!";
            }
        } catch (Exception ex) {
            msg = ("Exception=>" + ex.getMessage());
        }
        return msg;
    }

    public List<Student> GetStudent() {
        List<Student> lst = new ArrayList<>();
        try {
           st = con.createStatement();
           rs = st.executeQuery("select rno, name, english, maths,science from tblstudents");
           while(rs.next()){
               Student s = new Student(rs.getInt("rno"), rs.getString("name"), rs.getInt("english"), rs.getInt("maths"), rs.getInt("science"));
               lst.add(s);
           }
            

        } catch (Exception ex) {
            System.out.println("Exception=>" + ex.getMessage());
        }
        return lst;
    }
    
     public Student GetStudent(int rno) {
       Student s = null;
        try {
           st = con.createStatement();
           rs = st.executeQuery("select rno, name, english, maths,science from tblstudents where RollNo="+rno);
           while(rs.next()){
                s = new Student(rs.getInt("rno"), rs.getString("name"), rs.getInt("english"), rs.getInt("maths"), rs.getInt("science"));
           }
            

        } catch (Exception ex) {
            System.out.println("Exception=>" + ex.getMessage());
        }
        return s;
    }

}
