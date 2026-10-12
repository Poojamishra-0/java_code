class account{
    int balance;
    void showbalance(){
        System.out.println("balance "+ balance );

    }
}
    class Saving_account extends account{
        int intrestrate;
        void add_intrest(){
            balance=balance+(balance* intrestrate/100);
            }
            {


            System.out.println("intrestrate "+ intrestrate);
        }
    }
     public class single_inherit{
        public static void main(String[] args) {
            Saving_account s1 = new Saving_account();

            

            s1.balance=50000;
            s1.intrestrate=10;

            s1.showbalance();
            s1.add_intrest();
            s1.showbalance();  

            

        }
     }
    

    
    
