import java.util.*;
public class prg37 {
    public static void main(String[] args) {
        List<Integer> list=List.of(1,2,3,4,4,4,5,6);
        int sumOfEven = list.stream().filter(x->x%2==0).reduce(0,(n1,n2)->n1+n2);
        System.out.println(sumOfEven);
    }
}
