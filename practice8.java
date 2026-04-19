import java.util.*;
import java.util.concurrent.ArrayBlockingQueue;

public class practice8 {
    public static void main(String arg[]){
        List<String> list=new ArrayList<>();
        list.add("hello");
        list.add("My");
        list.add("name");
        list.add("Deepak");
        list.forEach(i->System.out.println(i.toUpperCase()));
    }
}
