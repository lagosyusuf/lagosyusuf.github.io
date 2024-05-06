import java.util.ArrayList;
import java.util.List;

public class Lists {
    public static void main(String[] args) {

        List fruits = new ArrayList();
        
        fruits.add("apple");
        fruits.add("orange");
        fruits.add("grape");
        fruits.set(2, "lemon");
        fruits.add("strawberry");

        fruits.forEach(System.out::println);
        fruits.forEach(f -> System.out.println(f));

       // System.out.println (fruits);
       // System.out.println("This is: " + fruits.get(2));
    }

}
