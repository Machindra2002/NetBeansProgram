package model;

public class Student {
    private int rno;
    private String name;
    private float english;
    private float maths;
    private float science;
    private int city;
    private String gender;
      
                   
                            
                   
                
//    private float per=(english+maths+science)/3;
    
    public Student() {
        
    }
   
    public Student(int rno, String name, float english, float maths, float science, int city, String gender) {
        this.rno = rno;
        this.name = name;
        this.english = english;
        this.maths = maths;
        this.science = science;
        this.city = city;
        this.gender = gender;
    }

    public int getCity() {
        return city;
    }

    public void setCity(int city) {
        this.city = city;
    }
     public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }


    public int getRno() {
        return rno;
    }

    public void setRno(int rno) {
        this.rno = rno;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getEnglish() {
        return english;
    }

    public void setEnglish(float english) {
        this.english = english;
    }

    public float getMaths() {
        return maths;
    }

    public void setMaths(float maths) {
        this.maths = maths;
    }

    public float getScience() {
        return science;
    }

    public void setScience(float science) {
        this.science = science;
    }
    
//    public float getTotal() {
//        return Total;
//    }
//
//    public void setTotal(float Total) {
//        this.Total = Total;
//    }

   
}
