package model;

public class Student {
    private int rno;
    private String name;
    private int english;       
    private int maths;
    private int science;

    public Student() {
    }

    public Student(int rno, String name, int english, int maths, int science) {
        this.rno = rno;
        this.name = name;
        this.english = english;
        this.maths = maths;
        this.science = science;
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

    public int getEnglish() {
        return english;
    }

    public void setEnglish(int english) {
        this.english = english;
    }

    public int getMaths() {
        return maths;
    }

    public void setMaths(int maths) {
        this.maths = maths;
    }

    public int getScience() {
        return science;
    }

    public void setScience(int science) {
        this.science = science;
    }
}
