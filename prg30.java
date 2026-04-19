import java.util.stream.*;
import java.util.*;

class Emp30{
    String name;
    double salary;
    Emp30(String name,double salary){
        this.name=name;
        this.salary=salary;
    }
}

public class prg30 {
    public static void main(String[] args) {
        List<Emp30> e = Arrays.asList(new Emp30("Deepak",50000),new Emp30("Deepak2",60000),new Emp30("Deepak3",650000),new Emp30("Deepak4",70000),new Emp30("Deepak5",100000),new Emp30("Deepak6",40000));
        
        List<String> empNames = e.stream().filter(x-> x.salary>=60000).map(x->x.name).collect(Collectors.toList());
        System.out.println(empNames);
    }
}
