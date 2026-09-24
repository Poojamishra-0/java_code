//Write a Java program to print the Fibonacci series up to n terms.
import java.util.Scanner;
public class series{
    public static void main(String[] args) {
        int a=0 , b=1;
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER THE NUMBER OF TERM ");
        int n= sc.nextInt();
        for (int i=1;i<=n;i++){
            System.out.println(a);

            int add = a+b;
            a=b;
            b=add;
             
        }



        
    }

}