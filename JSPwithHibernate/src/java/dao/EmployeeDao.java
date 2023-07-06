package dao;

import model.Employee;
import java.util.*;
import org.hibernate.cfg.*;
import org.hibernate.*;

public class EmployeeDao {

    Configuration cfg;
    SessionFactory factory;
    Session s;
    Transaction tr;

    public EmployeeDao() {
        cfg = new Configuration().configure("hibernate.cfg.xml");
        factory = cfg.buildSessionFactory();
    }
    
    public List<Employee>GetEmployee(){
        s = factory.openSession();
        List<Employee> lst = s.createQuery("from emp").list();
        s.close();
        return lst;
    }
    
    public Employee GetEmployee(int eid){
        s = factory.openSession();
        Employee e = (Employee)s.get(Employee.class, eid);
        return e;
    }
}
