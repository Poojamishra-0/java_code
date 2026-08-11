import java.util.Scanner;

public class condtion{
    public static void main(String[]  args){
        Scanner marks= new Scanner(System.in);
        // char grade;
        char grade = 'X';
        int student_marks= marks.nextInt();
        marks.nextLine();
        // if student_marks(0<=100)
        if (student_marks >= 0 && student_marks <= 100)
        {
        System.out.println("valid student marks "+ student_marks);
        }
        else 
        {
        System.out.println("invalid student marks ");
        }
        if (student_marks>=90 &&  student_marks<=100)
        {
            // System.out.println ("grade a");
            grade ='A';
        }
        else if(student_marks>=75 && student_marks<=89)
        {
            // System.out.println("grade b "); 
            grade ='B';

        }   
        else if(student_marks>=60 && student_marks<=74 )
        {
            // System.out.println("grade c");
            grade ='C';
        }   
         else if(student_marks>=40 && student_marks<=49 )
         {
            // System.out.println("grade d ");
            grade ='D';
         }
          else if(student_marks>=0 && student_marks<=39 )
        //   {
        //     System.out.println("grade f ");
        //   }
        {
            grade ='F';
        }

        switch(grade){
            case  'A':
                 System.out.println("excellent performence");
            break;
            case 'B':
                System.err.println("very good ");
                break;
            case 'C':
                   System.err.println("good but u can improve   ");  
                   break;
            case 'D':
                System.err.println("need improvement ");   
                break;    
            case 'F':
                System.err.println("failed  . tryagain ");
                break;
            default:
            
                System.err.println("invalid grade ");    
        }






//         switch(variable) {
//     case value1:
//         // code
//         break;
//     case value2:
//         // code
//         break;
//     default:
//         // agar koi case match na ho
// }


 


        







    }

}








// Ek grading system banao jo student ke marks ke basis pe uska grade batayega.

// Requirements:

// Ek variable banao marks (int type) — isme koi bhi value store karo (0 se 100 ke beech), jaise marks = 78;
// If-else use karke pehle check karo ki marks valid hain ya nahi:
// Agar marks 0 se kam ya 100 se zyada hain, to print karo "Invalid marks!"
// Warna aage ka process karo.
// Agar marks valid hain, to ek grade variable banao (jaise char type — 'A', 'B', etc.) jiski value tum niche diye gaye logic se decide karoge:
// 90-100 → Grade A
// 75-89 → Grade B
// 60-74 → Grade C
// 40-59 → Grade D
// 0-39 → Grade F
// Ab is grade variable ko ek switch statement mein use karo (har case mein break lagana mat bhoolna!) aur har grade ke hisaab se ek message print karo, jaise:
// A → "Excellent!"
// B → "Very Good!"
// C → "Good, but can improve!"
// D → "Needs improvement!"
// F → "Failed. Try again!"

// Hint (thoda sa): Grade decide karne ke liye tum if-else if ladder use kar sakti ho, aur uske baad switch statement mein grade ke basis pe message print karo.

// Try karo — jab ho jaye ya kahin atko, mujhe batana! 💪