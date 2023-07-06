package dao;
import citymodel.City;
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

    public void AddStudent(Student st) {
        template.execute("insert into tblstudents values(" + st.getRno() + ",'" + st.getName() + "'," + st.getEnglish() + "," + st.getMaths() +
                "," + st.getScience() + ","+st.getCity()+",'"+st.getGender()+"')");
    }

    public void UpdateStudent(Student st){
        template.execute("update tblstudents set name='"+st.getName()+"',english="+st.getEnglish()+","
                + "maths="+st.getMaths()+",science="+st.getScience()+" where rno="+st.getRno() );
    }
    
    public void DeleteStudent(int rno){
        template.execute("delete from tblstudents where rno=" +rno);
    }
    
    public List<City>GetCities(){
        List<City>lst = template.query("select * from tblcities",new RowMapper<City>() {
            @Override
            public City mapRow(ResultSet rs, int i) throws SQLException {
                City c = new City(rs.getInt("city_id"),rs.getString("city_name"));
                return c;
            }
        });
        return lst;
    }
    
    public List<Student> GetStudent() {
        List<Student> lst = template.query("select rno,name,english,maths,science,gender,c.city_id from tblstudents s "
                + "                                 join tblcities c  on s.city_id=c.city_id ", new RowMapper<Student>() {
            @Override
            public Student mapRow(ResultSet rs, int i) throws SQLException {
                Student s = new Student(rs.getInt("rno"), rs.getString("name"),rs.getFloat("english"), rs.getFloat("maths"),
                        rs.getFloat("science"),rs.getInt("city_id"),rs.getString("gender"));
                return s;
            }
        });
        return lst;
    }
    
    public Student GetStudent(int rno) {
        List<Student> lst = template.query("select * from tblstudents where rno="+rno, new RowMapper<Student>() {
            @Override
            public Student mapRow(ResultSet rs, int i) throws SQLException {
                Student s = new Student(rs.getInt("rno"), rs.getString("name"),rs.getFloat("english"), rs.getFloat("maths"),
                        rs.getFloat("science"),rs.getInt("city_id"),rs.getString("gender"));
                return s;
            }
        });
        return lst.get(0);
    }

    public int NextRollNo() {
        List<Student> lst = template.query("select max(rno) rno from tblstudents", new RowMapper<Student>() {
            @Override
            public Student mapRow(ResultSet rs, int i) throws SQLException {
                Student s = new Student(rs.getInt("rno"), "", 0, 0, 0,0,"");
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
