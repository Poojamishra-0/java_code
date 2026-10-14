class display{
    void show(int number){
        System.out.println("number "+ number);

    }
    void show(String name){
        System.out.println("name "+name);

        
    }
    void show(String name ,int age){
          System.out.println("Name "+ name +  "age " + age);
    }
}
public class overload{
    public static void main(String[] args) {
        display s =new display();
        s.show(1);
        s.show("puspa");
        s.show("puspa", 22);

    
    }
}