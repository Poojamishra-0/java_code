// Q. Simple Login System
// User se username aur password lo (String),
//  aur agar dono match kare ek fixed value se (jaise username = "admin", password = "1234") to "Login Successful" print karo, warna "Login Failed".

import java.util.*;
public class input{
    public static void main(String[] args){
        Scanner login = new Scanner(System.in);
        String name = login.nextLine();
        String password = login.nextLine();

        // if (name == "admin" && password == "1234"){

          if (name.equals("admin") && password.equals("1234")) 
        {

            System.err.println("login sucessfully ");

        }
        else 
        {
            System.err.println("login failed ");
        }




    }
}