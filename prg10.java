// static method inside the interfaces

interface I10{
    static void greet(){
        System.out.println("Hello");
    }
}

public class prg10 {
    public static void main(String[] args) {
        I10.greet();
    }    
}
