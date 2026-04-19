import java.util.*;
interface I26{
    ArrayList<Integer> sort(ArrayList<Integer> list);
}
public class prg26 {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(4);
        list.add(3);
        list.add(7);
        list.add(1);
        list.add(2);
        I26 re=(l)->{
             Collections.sort(l,Collections.reverseOrder());
             return l;
        };
        
        // Collections.sort(list,Collections.reverseOrder());
        re.sort(list).forEach(n->System.out.print(n+" "));
    }
}
