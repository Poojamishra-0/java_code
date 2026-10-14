class area{
    void area(int side){
        System.out.println("square" + side*side);
    }

    void area(int l ,int b){
        System.out.println("rectangle "+ l*b);

    }
    void area(double r){
        System.out.println("circle"+ 3.14*r*r);
    }
}
public class overloading{
    public static void main(String[] args) {
        area a = new area();
        a.area(5);
        a.area(4, 6);
        a.area(2.0);
    }
}
