package dao;
import java.sql.ResultSet;
import java.sql.SQLException;
import model.Student;
import java.util.*;
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

    public void AddStudent(Student s) {
        template.execute("insert into tblStudents values(" + s.getRno() + ",'" + s.getName() + "'," + s.getEnglish() + "," + s.getMaths() + "," + s.getScience() + ")");
    }
    
     
    public void UpdateStudent(Student s) {
        template.execute("update into tblStudents set name='" + s.getName() + "',English=" + s.getEnglish() + ",English=" + s.getMaths() + ",English=" + s.getScience() + " where RollNo=" + s.getRno() + "");
    }

    public void DeletedStudent(int rno) {
        template.execute("delete from tblStudents where RollNo=" + rno + "");
    }


    public List<Student> GetStudent() {
        List<Student> lst = template.query("select * from tblStudents", new RowMapper<Student>() {
            @Override
            public Student mapRow(ResultSet rs, int i) throws SQLException {
                Student s = new Student(rs.getInt("rno"), rs.getString("name"), rs.getFloat("English"), rs.getFloat("Maths"), rs.getFloat("Science"));
                return s;
            }

        });
        return lst;
    }
    
    public Student GetStudent(int rno){
        List<Student>lst = template.query("Select * from tblstudents where RollNo="+rno, new RowMapper<Student>() {
            @Override
            public Student mapRow(ResultSet rs, int i) throws SQLException {
                Student s = new Student(rs.getInt("rno"),rs.getString("name"),rs.getFloat("english"),rs.getFloat("maths"),rs.getFloat("science"));
                return s;
            }
        });
        return lst.get(0);
    }
    
   
}
