package controller;
import model.Student;
import dao.StudentDao;
import java.util.*;
import citymodel.City;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;


@Controller
public class StudentController {
    
    @RequestMapping("student")
    public ModelAndView StudView() {
        ModelAndView m = new ModelAndView("student/index");
        List<Student> lst = sdao.GetStudent();
        m.addObject("students", lst);
        return m;
    }
    
    @Autowired
    StudentDao sdao;
    
    @RequestMapping("add")
    public ModelAndView AddStudent() {
        int rno = sdao.NextRollNo();
        Student s = new Student(rno, "", 0, 0, 0,0,"");
        List<City>cities=sdao.GetCities();
        ModelAndView m = new ModelAndView("student/addstudent", "command", s);
        m.addObject("cities",cities);
        return m;
    }
    
    @RequestMapping("Edit/{id}")
    public ModelAndView EditStudent(@PathVariable("id")int rno){
        Student st = sdao.GetStudent(rno);
        ModelAndView v = new ModelAndView("student/updatestudent","command",st);
        return v;
    }
    
    @RequestMapping(value = "update", method = RequestMethod.POST )
    public RedirectView UpdateStudent(@ModelAttribute("e")Student st){
        sdao.UpdateStudent(st);
        RedirectView r = new RedirectView("/Model_Data_Connection/student");
        return r;
    }
    
    @RequestMapping(value = "Delete/{id}", method = RequestMethod.GET)
    public RedirectView Save(@PathVariable("id")int id){
        sdao.DeleteStudent(id);
        RedirectView r = new RedirectView("/Model_Data_Connection/student");
        return r;
    }
            
    @RequestMapping(value = "save", method = RequestMethod.POST)
    public RedirectView Save(@ModelAttribute("s") Student s) {
        sdao.AddStudent(s);
        RedirectView r = new RedirectView("/Model_Data_Connection/student");
        return r;
    }
    
    
}
