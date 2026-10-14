class person{
    void work(){
        System.out.println("person doing hardwork");

    }

}
class teacher extends person{
    void work(){
        System.out.println("teacher study");
    }

}
class doctor extends person{
    void work(){
        System.out.println("doctor work ");
    }
}

public class over_riding{
    public static void main(String[] args) {
        person p = new teacher();
        p.work();

        p= new doctor();
        p.work();
      


        p = new person();
        p.work();
    }
}