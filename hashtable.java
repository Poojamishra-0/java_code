import java.util.Hashtable;
public class hashtable{
    public static void main(String[] args) {
        Hashtable <String,Integer> marks =new Hashtable<>();

        marks.put("raj",23);
        marks.put("riya",45);
        marks.put("priya",55);

        System.out.println("marks of raj "+ marks.get("raj"));
        System.out.println("size "+ marks.size());
        System.out.println("is here raj "+ marks.containsKey("raj"));
        System.out.println("90 (value)?" + marks.containsValue(90));
        System.out.println("marks of zara "+ marks.get("zara"));
           
           }
}
