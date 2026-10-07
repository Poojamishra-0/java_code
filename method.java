class mobile{
    String brand;
    int price;

    void showdetails()
    {

    System.out.println("brand "+ brand );
    System.out.println("price  "+  price  );
    }
    void applydiscount(int discount){
        price =price-discount;
        }

        


    }

    public class method{
        public static void main(String[] arg){
            mobile m1 = new mobile();
            mobile m2 = new mobile();
            m1.brand = "samsung";
            m1.price = 1500;
            m2.brand = "phone ";
            m2.price  = 80000;
            

            m1.showdetails();
            m2.showdetails();

             m1.applydiscount(2000);
             m2.applydiscount(5000);

            
        }
    }

