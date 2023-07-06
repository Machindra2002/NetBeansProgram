package dao;

import model.Student;
import java.util.*;
import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

public class StudentDao {
    
    JdbcTemplate template;
    
    public JdbcTemplate getTemplate() {
        return template;
    }
    
    public void setTemplate(JdbcTemplate template) {
        this.template = template;
    }
    
    public void AddStudent(Student st) {
        template.execute("insert into stud values(" + st.getRno() + ",'" + st.getName() + "'," + st.getEnglish() + ","
                + "" + st.getMaths() + "," + st.getScience() + ")");
    }
    
   public void UpdateStudent(Student st) {
        template.execute("update stud set name='" + st.getName() + "',english=" + st.getEnglish() + ",maths="
                + "" + st.getMaths() + ",science=" + st.getScience() + "where rno="+st.getRno());
    }
    
    public void DeleteStudent(int rno){
        template.execute("delete from stud where rno="+rno);
    }
    
    public List<Student> GetStudent() {
        return template.query("select * from stud", new RowMapper<Student>() {
            @Override
            public Student mapRow(ResultSet rs, int i) throws SQLException {
                Student s = new Student(rs.getInt("rno"), rs.getString("name"), rs.getFloat("english"), 
                        rs.getFloat("maths"), rs.getFloat("science"));
                return s;
            }
        });
    }
    
    public Student GetStudent(int rno) {
        return template.query("select * from stud where rno=" + rno, new RowMapper<Student>() {
            @Override
            public Student mapRow(ResultSet rs, int i) throws SQLException {
                Student s = new Student(rs.getInt("rno"), rs.getString("name"), rs.getFloat("english"),
                        rs.getFloat("maths"), rs.getFloat("science"));
                return s;
            }
        }).get(0);
    }
}
