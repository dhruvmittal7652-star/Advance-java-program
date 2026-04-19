import java.util.stream.*;
import java.util.*;
public class prg43{
    public static void main(String[] args) {
        List<Integer> list=Arrays.asList(40,86,45,78,65);
        // ArrayList<Integer> list2=new ArrayList<>();

        List<Integer> list2=list.stream().filter(x->x>60).collect(Collectors.toList());
        System.out.println(list2);
    }
   
}
// fing out list og pass and fail student in given list those attendance is more thean 60%