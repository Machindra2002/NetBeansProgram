package controller;
import java.util.*;
import model.Product; 
import dao.ProductDao;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;


@Controller
public class ProductController {
    
    @Autowired
    ProductDao pdao;
    
    @RequestMapping("Product")
    public ModelAndView ProductView(){
        ModelAndView m = new ModelAndView("Product/index");
        List<Product> lst = pdao.GetProduct();
        m.addObject("products", lst);
        return m;
    }
    
//    public List<Product> GetProduct(){
//        List<Product> lst = new ArrayList<>();
//        lst.add(new Product(1,"Laptop",30000,18,50));
//        return lst;
//    }
    
    @RequestMapping("pdt")
    public ModelAndView AddProduct(){
        Product p = new Product();
        ModelAndView m = new ModelAndView("Product/addproduct","command",p);
        return m;
    }
    
    @RequestMapping(value = "save", method = RequestMethod.POST)
   public RedirectView Save(@ModelAttribute("p")Product p){
       pdao.AddProduct(p);
       RedirectView r = new RedirectView("Product");
       return r;
   }
   
  
   
  
}
