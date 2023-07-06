package dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import model.Student;
import java.util.*;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

public class StudentDao {

    /*
   public static List<Student> lststudents = new ArrayList<>();
    
   public int NextRollNo(){
       return lststudents.size()+1;
   }
    public int AddStudent(Student st){
        st.setRno(NextRollNo());
        lststudents.add(st);
        return lststudents.size();
    }
    
    public List<Student>GetStudent(){
       return lststudents; 
    }
    
     */

    JdbcTemplate template;

    public JdbcTemplate getTemplate() {
        return template;
    }

    public void setTemplate(JdbcTemplate template) {
        this.template = template;
    }

    public void AddStudent(Student st) {
        template.execute("insert into tblstudents values("+st.getRno()+",'"+st.getName()+"',"+st.getEnglish()+","+st.getMaths()+","+st.getScience()+")");
    }

    public List<Student> GetStudent() {
        List<Student> lst = template.query("select * from tblstudents", new RowMapper<Student>() {
            @Override
            public Student mapRow(ResultSet rs, int i) throws SQLException {
                Student s = new Student(rs.getInt("rno"), rs.getString("name"), rs.getFloat("english"), rs.getFloat("maths"), rs.getFloat("science"));
                return s;
            }
        });
        return lst;
    }

    public int NextRollNO() {
        List<Student> lst = template.query("select max(rno) rno from tblstudents", new RowMapper<Student>() {
            @Override
            public Student mapRow(ResultSet rs, int i) throws SQLException {
                Student s = new Student(rs.getInt("rno"),"",0,0,0);
                return s;
            }
        });
        if (lst.size() > 0) {
            return lst.get(0).getRno() + 1;
        } else {
            return 1;
        }
    }
    
}
