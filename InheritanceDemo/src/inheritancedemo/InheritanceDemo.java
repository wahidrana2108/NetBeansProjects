/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritancedemo;

/**
 *
 * @author Student
 */
class Animal{
    boolean breath = true; 
    void eat(){
        System.out.println("I can eat!");
    }
}


class Dog extends Animal{
    void bark(){
        System.out.println("Barking...");
    }
}


class Cat extends Animal{
    void muew(){
        System.out.println("Muewing...");
    }
}


class Human extends Animal{
    void dance(){
        System.out.println("Danching...");
    }
}


class Coucasoid extends Human{
    void whiteColor(){
        System.out.println("White people...");
    }
}
class Negroid extends Human{
    protected void blackColor(){
        System.out.println("Black people...");
    }
}


public class InheritanceDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Animal anim = new Animal();
        anim.eat();
        
        Cat cat1 = new Cat();
        cat1.eat();
        cat1.muew();
        
        
        Dog dog1 = new Dog();
        dog1.eat();
        dog1.bark();
        
        Negroid man1 = new Negroid();
        man1.dance();
        man1.eat();
        man1.blackColor();
        
        
    }
    
}
