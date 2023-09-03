/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritancedemotwo;

/**
 *
 * @author Student
 */
public class Bicycle {
    
    public int gear;
    public int speed;
    
    public Bicycle (int  gear, int speed){
        this.gear = gear;
        this.speed = speed;
    }
    public void speedUp( int increment){
        
        this.speed = this.speed + increment;
    }
    public void speedDown( int decrement){
        
        this.speed = this.speed - decrement;
        if ((this .speed - decrement )>0){
            this.speed = this.speed - decrement;
        }
        
        
    }
    public String toString(){
         return    "No of geras are : " + this.gear;
        }
    
}
class MountainBike extends Bicycle{
    public int seatHeight;
    public MountainBike(int gear, int speed, int seatHeight){
        super(gear, speed);
        this.seatHeight = seatHeight;
       
    }

   
    public void setHeight(int newValue){
        seatHeight = newValue;
    }
    public String toString(){
        return super.toString()
        + "\nseat height is" + seatHeight;
    
    }
}