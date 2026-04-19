import java.util.*;
public class prg32{
    public static void main(String[] args) {
        List<Integer> l1=List.of(10,20,30,40,50,60,70,80,90);
        List<Integer> l2=l1.stream().skip(1).limit(4).toList();
        System.out.println(l2);

        long c2=l1.stream().skip(1).limit(4).count();
        System.out.println(c2);

        long c=l1.stream().count();
        System.out.println(c);

        Object ar[]=l1.stream().toArray();
        System.out.println(Arrays.toString(ar));
        
    }
}