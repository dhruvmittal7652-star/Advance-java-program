import java.util.*;
public class prg39 {
    public static void main(String args[]){
        List<String> s=List.of("hello ","Deepak"," kya"," hall"," hai");
        String ans=s.stream().reduce("",(x,y)->x+y);
        System.out.println(ans);
    }
}
