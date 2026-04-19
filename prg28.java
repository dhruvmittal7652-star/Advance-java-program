
// Stream 

import java.util.*;
import java.util.stream.*;
public class prg28{
    public static void main(String args[]){
        int []arr={3,4,5,7,2,8};
        IntStream s=Arrays.stream(arr);
        // s.forEach(System.out::print);
        s.forEach(n->System.out.print(n+" "));
        System.out.println();

        // 2nd values
        Stream<Integer> s2=Stream.of(2,3,4,5);
        s2.forEach(x->System.out.print(x+" "));

        System.out.println();
        //3rd method
        List<Integer> l3=new ArrayList<>();
        l3.add(3);
        l3.add(6);
        l3.add(2);
        l3.add(5);
        l3.add(9);
        Stream<Integer> s3=l3.stream();

        s3.forEach(n->System.out.print(n+" "));

        System.out.println();
        ArrayList<Integer> evenList=new ArrayList<>();
        Stream<Integer> s4=l3.stream();
        // find even and add to even list
        s4.forEach(x->{
            if(x%2==0){
                evenList.add(x);
            }
        });
        System.out.println(evenList);

        Stream<Integer> s5=l3.stream();
        List<Integer> evenList2 = s5.filter(x->x%2==0).collect(Collectors.toList());
        // List<Integer> evenList2 = s5.filter(x->x%2==0).forEach(x->System.out.println(x));
        
        System.out.println(evenList2);

        // // Character.toUpperCase(str.charAt(i));
        // String str="deepak";
        // // String str2=String.toUpperCase(str);
        // String str3=str.toUpperCase();

        List<Integer> squareEven=l3.stream().filter(x->x%2==0).map(x->x*x).collect(Collectors.toList());
        List<Integer> squareList =l3.stream().map(x->x*x).collect(Collectors.toList());
        System.out.println(squareList);
        System.out.println(squareEven);
    }
}