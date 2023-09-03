
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraylistdemo;

import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author Student
 */
public class ArrayListDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<ArrayList<Integer>> myList = new ArrayList<ArrayList<Integer>>();
        Scanner in = new Scanner(System.in);
        int arrayListNumber = in.nextInt();
        int ArrayListNumber;
        for(int  k = 0; k < arrayListNumber; k++){
            myList.add(new ArrayList<Integer>());
        }
        for(int k= 0; k< arrayListNumber; k++){
            int eachArrayListSize = in.nextInt();
            for(int i = 0; i< eachArrayListSize; i++){
                int currentValue= in.nextInt();
                myList.get(k).add(currentValue);
            }
        }
        for(int k = 0; k< arrayListNumber; k++){
            for(int  i =0; i< myList.get(k).size(); i++){
                System.out.println(myList.get(k).get(i)+" ");
            }
            System.out.println();
        }
        
        int testCase = in.nextInt();
        for( int j = 0; j < testCase; j++){
            int row = in.nextInt();
            int col = in.nextInt();
            if (myList.get(row-1).size() < col-1){
                System.out.println("Error!");
            }else{
                System.out.println(myList.get(row-1).get (col-1));
            }
        }
        
        
    }
    
}
