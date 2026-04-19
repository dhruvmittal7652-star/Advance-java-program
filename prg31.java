import java.util.*;
public class prg31 {
    public static void main(String args[]){
        List<Integer> list=List.of(10,20,10,44,24,63,24);
        // distint method is use to reduce duplicacy in list
        // remove duplicate element from the list
        list.stream().distinct().forEach(System.out::println);

        // skip skip the elemet 
        List<Integer> list2=list.stream().distinct().skip(1).toList();
        System.out.println(list2);

        // limit is use to define how much we do it
        // take a input as max limit size
        List<Integer> list3=list.stream().distinct().skip(1).limit(4).toList();

        // count is cout the elements available in stream and return counter
        long size=list.stream().count();
        System.out.println("size of list is : "+size);

        long size2=list.stream().distinct().skip(1).limit(4).count();
        System.out.println(size2);

        list.stream().distinct().filter(x->x%2==0).limit(3).forEach(System.out::println);
    }
}
