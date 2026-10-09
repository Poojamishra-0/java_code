class Employe{


    String name;
    int salary;
    Employe(String name , int salary){
        this.name=name;
        this.salary=salary;
        

    }
    void showdetails() {
        System.out.println(name+"-"+ salary);
        
    }
    void givebonus(int bonus ){
       salary = salary+bonus;

    }


    
    }
    public class constructor{
        public static void main(String[] args) {
            Employe e1 = new Employe("aman" ,50000);
            Employe e2 = new Employe("sanju " ,50000);


            // e1.showdetails();
            // e2.showdetails();

            // e1.givebonus(500);   
            
            // e2.givebonus(400);
        System.out.println("Bonus se pehle:");
        e1.showdetails();
        e2.showdetails();

        e1.givebonus(500);              

        System.out.println("Bonus ke baad:");
        e1.showdetails();
        e2.showdetails();

            
        }
    }
    


    
