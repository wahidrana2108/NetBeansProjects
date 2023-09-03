/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

/**
 *
 * @author Student
 */
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        public class FibbnonRecursive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n1=1, n2=1, n3, i,count=9;
		
		System.out.println(n1+  " "+n2);
		
		for(i=1; i<count; ++i)
		{
			n3=n1+n2;
			System.out.println(""+n3);
			n1=n2;
			n2=n3;
		}
			

	}

}

    
   
