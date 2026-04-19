import java.util.*;
import java.util.stream.*;
class Student29{
    int id;
    String name;
    Student29(int id,String name){
        this.id=id;
        this.name=name;
    }
}
public class prg29 {
    public static void main(String[] args) {
        List<Student29> s = Arrays.asList(
            new Student29(1,"Deepak"),
            new Student29(2,"Roshan"),
            new Student29(3,"Himanshu")
        );


        List<String> studentNames = s.stream().map(x->x.name).collect(Collectors.toList());
        System.out.println(studentNames);
    }
}
