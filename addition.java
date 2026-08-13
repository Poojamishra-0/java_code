//Challenging): User se ek number lo aur uske digits ka sum nikalo (jaise 123 diya to 1+2+3 = 6 
import java.util.*;
public class addition{
    public static void main(String[] args){
        Scanner number = new Scanner(System.in);
        System.out.println("enter a number ");
       
        int a = number.nextInt();
        int sum=0;
        while(a>0){
            int digit=a%10;
            sum=sum+digit;
            a=a/10;

        }
        System.out.println("sum of digit "+sum );
     


    }
}