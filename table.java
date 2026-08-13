// Q3 (Medium): User se ek number lo aur us number tak ka table (multiplication table) print karo (jaise agar user 5 de to 5x1=5, 5x2=10... 5x10=50).
import java.util.*;
public class table{
    public static void main(String[] args){
         Scanner tab =new Scanner(System.in);
       
          int a= tab.nextInt();
        
        System.out.println("table start " + a);
         
       
        for(int i = 1; i <= 10; i++){
            System.out.println( a + " x " + i + " = " + (a*i));


        }




    }
}