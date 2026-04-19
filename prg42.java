import java.util.*;
import javax.sound.sampled.SourceDataLine;
public class prg42 {
    public static void main(String[] args) {
        List<String> list=List.of("hello","deepak","hell");
        String s=list.stream().reduce("",(x,y)->x.length()>y.length() ? x:y);
        System.out.println(s);
    }
}
