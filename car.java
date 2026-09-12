//. Ek Car class banao jisme brand, model, aur year ho. Ek object banao aur uski details print karo.
class cars{
    String brand ;
    String model ;
    int price;

}
public class car{
    public static void main(String args[]){
        cars c1 = new cars();
        c1.brand = "TOYOTO";
        c1.model = "CAMRY";
        c1.price  =  50000000;

       
        System.out.println("brand of car "+ c1.brand);
        System.out.println("model  of car "+ c1.model);
        System.out.println("price  of car "+ c1.price );

    }

}