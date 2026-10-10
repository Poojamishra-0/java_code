class person{
    String name ;
    void showname(){
        System.out.println("NAME "+ name);

    }
}
    class Student extends person{
        int roll_number;
        void showroll_number(){
            System.out.println("roll_number "+ roll_number);

        }

    
    }
    public class Inherit{
    public static void main(String[] args) {
        Student s1 =new Student();
        s1.name="rahul ";
        s1.roll_number=55;

         s1.showname();
         s1.showroll_number();

      
    } 
    }



