package dao;
import model.Product;
import java.util.*;


public class ProductDao {
    
    List<Product> lstproduct = new ArrayList<>();
    
    public int NextPId(){
        return lstproduct.size()+1;
    }
    
    public int AddProduct(Product p){
        p.setPid(NextPId());
                               
        
        lstproduct.add(p);
        return lstproduct.size();
    }
    
    public List<Product>GetProduct(){
        return lstproduct;
    }
    
}
