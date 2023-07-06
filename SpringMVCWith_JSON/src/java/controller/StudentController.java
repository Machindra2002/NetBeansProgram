package controller;
import model.Student;
import dao.StudentDao;
import java.util.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class StudentController {
    
    @Autowired
    StudentDao sdao;
    //getallstudent-code
    @RequestMapping("studentlist")
    public @ResponseBody List<Student> GetAllStudent(){
        return sdao.GetStudent();
    }
    
    @RequestMapping("")
    public ModelAndView StudentView(){
        return  new ModelAndView("student/index");
    }
    
    //addstudent-code
    @RequestMapping(value="addstudent", method=RequestMethod.POST)
    public @ResponseBody Student AddStudent(@ModelAttribute("st") Student st){
//        System.out.println(st.getRno()+" "+st.getName());
        sdao.AddStudent(st);
        return st;
    }
    
    //update-code
    @RequestMapping(value = "updatestudent" , method = RequestMethod.POST)
    public @ResponseBody Student UpdateStudent(@ModelAttribute("st") Student st){
        sdao.UpdateStudent(st);
        return st;
    }
    
    @RequestMapping("fectchstudent/{id}")
    public @ResponseBody Student GetStudentByRollNo(@PathVariable("id")int id){
        return sdao.GetStudent(id);
    }
    
    //delete-code
    @RequestMapping("deletestudent/{id}")
    public @ResponseBody Student DeleteStudent(@PathVariable("id")int id){
        Student st = sdao.GetStudent(id);
        sdao.DeleteStudent(id);
        return st;
    }
    
}
