// for each method

import java.util.*;


public class prg14 {
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>();
        list.add(34);
        list.add(32);
        list.add(31);
        list.add(7);
        

        // for each method 
        list.forEach(i->System.out.println(i));

        // method referencing
        list.forEach(System.out::println);


        list.forEach(i->{
            if(i%2==0){
                System.out.println(i);
            }
        });
    }
}
