public class Abstract{
    public static void main(String[] args){
        car c1 = new car();
        c1.start();
        c1.stop();
        bike c2 =new bike();
        c2.start();
        c2.stop();

    
    }
}
abstract class vehicle{
    abstract void start();
             void stop(){
                System.out.println("vehcile stop");

             }
}
class car extends vehicle{
      void start(){
        System.out.println("car start from the key ");
      }
}
class bike extends vehicle{
    void start(){
        System.out.println("bike start from kick");
    }

}