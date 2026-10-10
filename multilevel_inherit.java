class vehicle{
    int speed;
    void showspeed(){
        System.out.println("speed "+speed);


    }
}
class car extends vehicle{
    int seat;
    void showseat(){
        System.out.println("seat"+seat);

    }

}
class electric_car extends car {
    int battery;
    void showbattery(){
        System.out.println("battery "+battery );

    }
}
public class multilevel_inherit{
    public static void main(String[] args) {
        electric_car s1= new electric_car();
        s1.speed=120;
        s1.seat=8;
        s1.battery= 80;
   
        s1.showspeed();
        s1.showseat();
        s1.showbattery();
    }
}
