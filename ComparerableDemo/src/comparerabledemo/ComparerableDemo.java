/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comparerabledemo;

import java.util.ArrayList;

/**
 *
 * @author Student
 */

class Student implements comparerable<Student>{
    
    
    int rollNO;
    String name;
    int age;
    double cgpa;

    public Student(int rollNO, String name, int ahe) {
        this.rollNO = rollNO;
        this.name = name;
        this.age = age;
        this.cgpa = cgpa;
    }

    public int getRollNO() {
        return rollNO;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getCgpa() {
        return cgpa;
    }
     

    public void setRollNO(int rollNO) {
        this.rollNO = rollNO;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setCgpa(double cgpa) {
        this.cgpa = cgpa;
    }
    
    public int compareTo(Student currentStudent){
        if( this.cgpa == currentStudent.cgpa)
            return 0;
        else if ( this.cgpa > currentStudent.cgpa)
            return 1;
        else
            return -1;
        
    }
   
    
}

public class ComparerableDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        ArrayList<Student> studentArray = new ArrayList<Student>();
        studentArray.add(new Student(1,"Karim", 23,2.9));
        studentArray.add(new Student(2,"Rahim", 23,3.9));
        studentArray.add(new Student(3,"Jabbar", 23,4));
        studentArray.add(new Student(4,"Ratul", 23,2.8));
        Collections.sort(studentArray);
        
        for(Student eachStudent:studentArray){
            System.out.println(eachStudent.rollNO+" ");
            System.out.println(eachStudent.name+" ");
            System.out.println(eachStudent.age+" ");
            System.out.println(eachStudent.cgpa+" ");
        
        }
    }
}