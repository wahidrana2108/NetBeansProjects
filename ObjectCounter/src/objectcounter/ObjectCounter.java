package objectcounter;
class Circle{
   private double radious;
   static int numberofObject = 0;
   
   public Circle(){
       //this(10);
       numberofObject++;
       
       
       
   }
   {
       numberofObject++;
   }
   {
       System.out.println("hi");
   }
   {
       System.out.println("hi I am from block");
   }

    public Circle(double radious) {
        this.radious = radious;
        
       numberofObject++;
    }

    public double getRadious() {
        return radious;
    }

    public void setRadious(double radious) {
        this.radious = radious;
    }
    
    public String tostring(){
        return String.valueOf(numberofObject);
    }
    
}
public class ObjectCounter{
    public static void main(String [] args){
        
        Circle circle1 = new Circle (10);
        System.out.println(circle1.toString());
        Circle circle2 = new Circle ();
        System.out.println(circle2.toString());
        Circle circle3 = new Circle ();
        //circle2.setRadious(20);
        System.out.println(circle1.toString());
        System.out.println(circle2.toString());
        System.out.println(circle3.toString());
        //circle.radious = 10; 
        
        
    }
}
