package model;

public class Product {
    
    private int pid;
    private String pname;
    private int rate;
    private int tax;
    private int stockq;

    public Product() {
    }

    public Product(int pid, String pname, int rate, int tax, int stockq) {
        this.pid = pid;
        this.pname = pname;
        this.rate = rate;
        this.tax = tax;
        this.stockq = stockq;
    }

    public int getPid() {
        return pid;
    }

    public void setPid(int pid) {
        this.pid = pid;
    }

    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname;
    }

    public int getRate() {
        return rate;
    }

    public void setRate(int rate) {
        this.rate = rate;
    }

    public int getTax() {
        return tax;
    }

    public void setTax(int tax) {
        this.tax = tax;
    }

    public int getStockq() {
        return stockq;
    }

    public void setStockq(int stockq) {
        this.stockq = stockq;
    }
}
