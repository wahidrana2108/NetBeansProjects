
package icecreamdemo;

class Icecream {

    String icecreamType;
    String icecreameCompany;
    double icecreamPrice;

    void printIcecream() {
        System.out.println(icecreamType);
        System.out.println(icecreameCompany);
        System.out.println(icecreamPrice);

    }

}

public class IcecreamDemo {

    public static void main(String[] args) {

        Icecream icecream1 = new Icecream();
        icecream1.printIcecream();
        icecream1.icecreamType = "Chocolate Ice Cream";
        icecream1.icecreameCompany = "Igloo";
        icecream1.icecreamPrice = 25;
        icecream1.printIcecream();
        
     Icecream icecream2 = new Icecream();
     icecream2.icecreamType = "Strawberry Ice Cream";
     icecream2.icecreameCompany = "Kwality";
     icecream2.icecreamPrice = 35;
     icecream2.printIcecream();
     icecream1 = icecream2;
     icecream1.printIcecream();
     icecream2.printIcecream();
     icecream1.icecreamType = " Orange Ice Cream";
     icecream1.printIcecream();
     icecream2.printIcecream();
       
       
        

    }

}