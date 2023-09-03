

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstractdemo;
/**
 *
 * @author Student
 */
abstract class Animal{
        public abstract void sound();
        public void eat(){
            System.out.println("Food");
        }
}

class Lion extends Animal{

    @Override
    public void sound() {
        System.out.println("Roar!!");
    }
    
}


class Dog extends Animal{

    @Override
    public void sound() {
        System.out.println("Bark!!");
    }
    
}

interface MyInterface{
    int k = 1;
    
    void method1();
    void method2();
}
interface MyInterface2{
    int j = 1;
    
    void method3();
    void method4();
}


class Human extends Animal implements MyInterface, MyInterface2{

   
    public void method1() {
        
    }

    
    public void method2() {
        
    }

    public void method3() {
    
    }

    
    public void method4() {
    
    }

    
    public void sound() {
    }
    
}


public class AbstractDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Dog dog = new Dog();
        dog.eat();
        dog.sound();
        System.out.println(MyInterface.k);
        
        
    }
    
}
