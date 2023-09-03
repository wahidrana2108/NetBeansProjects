
package bookdemo;
class Book
{
    private final int isbN, pageofNumber, counT;
    private final String titleofBook;
    
    Book (int a, String b, int c, int d)
    {
        this.isbN = a;
        this.titleofBook = b;
        this.pageofNumber = c;
        this.counT = d;
      
    }

    private Book() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    }
    

public class BookDemo {

    
    public static void main(String[] args) {
        
        System.out.println("Why  I am here...?");
    }
    
}
