class Student{
  int marks;
  String name;
  int roll_number;


}
public class MAINS{
    public static void main(String[] args){
      Student s1=new Student();
      s1.name ="rahul ";
      s1.marks = 101;
      s1.roll_number=23445343;


      System.out.println("name "+ s1.name );
      System.out.println("roll number "+ s1.roll_number);
      System.out.println("marks "+ s1.marks);

        
    }
}