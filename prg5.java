interface pr5{
    prFive get();
}
class prFive{
    prFive(){
     System.out.println("Creating student");   
    }
}

public class prg5 {
    public static void main(String[] args) {
        pr5 p1=prFive :: new;
        // System.out.println(p1.get());
        p1.get();
    }
}
