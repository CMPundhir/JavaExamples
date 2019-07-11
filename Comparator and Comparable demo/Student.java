/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comparatorandcomparabaledemo;

/**
 *
 * @author cm
 */
public class Student implements Comparable<Student>{
    private int rn;
    private String name;
    private float marks;

    public Student() {
    }

    public Student(int rn, String name, float marks) {
        this.rn = rn;
        this.name = name;
        this.marks = marks;
    }

    
    
    public int getRn() {
        return rn;
    }

    public void setRn(int rn) {
        this.rn = rn;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getMarks() {
        return marks;
    }

    public void setMarks(float marks) {
        this.marks = marks;
    }

    @Override
    public String toString() {
        return "Student{" + "rn=" + rn + ", name=" + name + ", marks=" + marks + '}';
    }

    @Override
    public int compareTo(Student o) {
        int anotherRn = o.getRn();
        if(rn>anotherRn){
            return 1;
        }else if(anotherRn == rn){
            return 0;
        }else{
            return -1;
        }
    }
    
    
}
