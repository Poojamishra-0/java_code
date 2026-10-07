class Book {
    String title;
    int price;
    
    void showdetails() {
        System.out.println("title: " + title);
        System.out.println("price: " + price);
    }
}                                          // ← Book class yahan KHATAM

public class mains {                       // ← mains class ALAG se, Book ke BAHAR
    public static void main(String[] args) {
        Book b1 = new Book();
        Book b2 = new Book();
        
        b1.title = "java basic";
        b1.price = 300;
        
        b2.title = "python guide";
        b2.price = 450;
        
        b1.showdetails();
        b2.showdetails();
    }
}