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
public class InheritanceDemoTwo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        MountainBike mb = new MountainBike(3,100,25);
        System.out.println(mb.toString());
        
        mb.speedUp(10);
        System.out.println(mb.toString());
        
        
        
    }
    
}
