import java.util.*;
public class prg40 {
    public static void main(String args[]){
        List<Integer> list=List.of(1,2,2,3,3,34,5,6,7);
        int mult=list.stream().filter(x->x%2!=0).reduce(1,(x,y)->x*y);
        System.out.println(mult);
    }
}
