import java.util.*;

public class prg44 {
    public static void main(String args[]){
        List<Integer> list=List.of(1,2,3,4,55,33,44,77);
        int count=(int) list.stream().filter(x-> x<50).count();
        System.out.println(count);
    }
}
