class shape{
    void draw() {
        System.out.println(" the shape is forming  ");

        
    }
}
class circle extends shape{
    int radius;
    void area(){
        System.out.println(3*radius*radius);
    }
}
class Rectangle extends shape{
    
    int length;
    int width;
    void area(){
        System.out.println(length*width);
    }
}
public class Hierarchical_inherit{
    public static void main(String[] args) {
        circle c1 =new circle();
        Rectangle c2 = new Rectangle();
      
        c1.radius = 5;                                // FIX 3
        c2.length = 4;
        c2.width = 6;

        c1.draw();                                    // FIX 4
        c1.area();
        c2.draw();                                    // FIX 5
        c2.area();

    }
}