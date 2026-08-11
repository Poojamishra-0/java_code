// Q4. Largest of 3 Numbers
// User se 3 numbers lo aur if-else use karke batao sabse bada number kaunsa hai

import java.util.*;
public class number{
    public static void main(String[] args){
        Scanner number = new Scanner(System.in);
        int a = number.nextInt();
        // number.nextLine();
        int b = number.nextInt();
        // number.nextLine();
        int c = number.nextInt();
        // number.nextLine();
        // if (a>=b && b>=c )
        if (a >= b && a >= c) {
            System.err.println("a is greater  number ");
   
            }
        else if (b>=c && b>=a) {
            System.err.println(" b is greater number  ");
    


        }  
        else
        {
            System.err.println("c is greater ");
        }









    }
}
