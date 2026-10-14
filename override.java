class vehicle{
    void start(){
        System.out.println("vehicle start");

    }

}
class car extends vehicle{
    void start(){
        System.out.println("car start from the key ");
    }
}
class bike extends vehicle{
    void start(){
        System.out.println("bike start from the key ");
    }
}
public class override{
    public static void main(String[] args) {
        vehicle v= new vehicle();
        v.start();
        v= new car();
        v.start();
        v= new bike();
        v.start();
    }
}