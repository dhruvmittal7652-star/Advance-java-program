import java.util.*;

public class practice9 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Deepak");
        list.add("Dhruv mittal");
        list.add("Devansh Garg");
        list.add("Deepanshu Thakur");

        list.forEach(i->System.out.println("Hello "+i));
    }
}
