import java.util.*;
public class prg35 {
    public static void main(String[] args) {
        List<Integer> list=List.of(1,2,2,4,5,6,4,2);
        int max=list.stream().reduce(0,(e1,e2)->e1>e2 ? e1:e2 );
        int max2=list.stream().reduce(0,Math::max);
        System.out.println(max);
        System.out.println(max2);
    }
}
