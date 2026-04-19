// fing the product of all element in a list using reduce()

import java.util.*;
public class prg34 {
    public static void main(String args[]){
        List<Integer> list=List.of(2,2,3,4,5);
        int prod=list.stream().reduce(1,((e1,e2)->e1*e2));
        System.out.println(prod);
    }
}
