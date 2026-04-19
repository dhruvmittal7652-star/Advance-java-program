import java.util.*;
public class prg36 {
    public static void main(String[] args) {
        List<Integer> list=List.of(1,2,2,3,4,5,5,5,6);
        int total=list.stream().reduce(0,(x,y)->x+1);
        System.out.println(total);
    }
}
