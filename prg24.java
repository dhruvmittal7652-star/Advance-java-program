import java.util.*;
public class prg24 {
    public static void main(String args[]){
        ArrayList<String> list=new ArrayList<>();
        // use Arrays.asList in the list or in this form
        ArrayList<String> l=new ArrayList<>(Arrays.asList("Deepak","roshan"));
        List<String> l2=Arrays.asList("Deep","hello");

        

        list.add("deepak");
        list.add("roshan");
        list.forEach(n->System.out.println(n.toUpperCase()));
    }
}
