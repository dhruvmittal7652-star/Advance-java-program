
// import com.sun.jdi.PathSearchingVirtualMachine;


// reduce method 



import java.util.*;
public class prg33 {
    public static void main(String[] args) {
        List<Integer> l1=List.of(10,20,30,40,50,60,70,80);
        Optional x=l1.stream().reduce((e1,e2)->e1+e2);
        //Optional return a list 
        System.out.println(x);

        l1.stream().reduce((e1,e2)->e1+e2).ifPresent(System.out::println);

        // 2nd method
        int sum=l1.stream().reduce(0,((e1,e2)->e1+e2));
        System.out.println(sum);
    }
}
