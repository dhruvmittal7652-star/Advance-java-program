import java.util.*;
import java.util.stream.Collectors;
public class prg41 {
    public static void main(String args[]){
        List<Integer> list=List.of(1,2,3,4,5,6,4,-2,0,-1,7,2);
        // Stream<Integer> s=list.stream();

        int sum=list.stream().map((a)->a<0 ? 0:a).reduce(0,Integer::sum);
        System.out.println(sum);
        // List<Integer> list2=list.stream().reduce(0,(x,y)->x>0?x:0);
    }
}
