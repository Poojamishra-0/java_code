class Book{
    String  auther;
    String tittle ;
    int price;



}
public class book{
    public static void main(String args[] ){
        Book b1 = new Book();
        // Book books = new Book();
        b1.auther =  "james ss";
        b1.tittle = "old rode ";
        b1.price = 340;

        System.out.println("auther book name "+ b1.auther );
        System.out.println("tittle of book "+ b1.tittle);
        System.err.println("price of book "+ b1.price);

        
    }

    
}