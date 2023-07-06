package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import model.Student;
import java.util.*;
import dao.StudentDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class StudentController {

    /*
    @RequestMapping("student")
    public ModelAndView StudView() {
        ModelAndView m = new ModelAndView("student/index");
        List<Student> lst = sdao.GetStudent();
        m.addObject("students", lst);
        return m;
    }

//    public List<Student> GetStudent(){
//        List<Student>lst = new ArrayList<>();
//        lst.add(new Student(1,"Machindra",67,78,89));
//        lst.add(new Student(2,"Mandar",77,88,99));
//        lst.add(new Student(3,"Kanhiaya",76,66,33));
//        lst.add(new Student(4,"Ranjit",45,45,56));
//        lst.add(new Student(5,"Mayur",89,77,99));
//        lst.add(new Student(1,"Suraj",58,78,59));
//        return lst;
//    }
    @Autowired
    StudentDao sdao;

    @RequestMapping("add")
    public ModelAndView AddStudent() {
        Student s = new Student();
        ModelAndView m = new ModelAndView("student/addstudent", "command", s);
        return m;
    }

    @RequestMapping(value = "save", method = RequestMethod.POST)
    public RedirectView Save(@ModelAttribute("s") Student s) {
        sdao.AddStudent(s);
        RedirectView r = new RedirectView("student");
        return r;
    }
     */
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
        int rno = sdao.NextRollNO();
        Student s = new Student(rno,"",0,0,0);
        ModelAndView m = new ModelAndView("student/addstudent", "command", s);
        return m;
    }

    @RequestMapping(value = "save" , method = RequestMethod.POST )
    public RedirectView Save(@ModelAttribute("s")Student s){
        sdao.AddStudent(s);
        RedirectView r = new RedirectView("student");
        return r;
    }
    
   
}
