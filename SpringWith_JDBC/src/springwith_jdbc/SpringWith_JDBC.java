package springwith_jdbc;
import model.Student;
import dao.StudentDao;
import java.util.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringWith_JDBC {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationcontext.xml");
        StudentDao sd = (StudentDao)context.getBean("sdao");
        List<Student> lst = sd.GetStudent();
        for(Student s:lst){
            System.out.println(s.getRno()+" "+s.getName()+" "+s.getEnglish()+" "+s.getMaths()+" "+s.getScience());
        }
    }
    
}
