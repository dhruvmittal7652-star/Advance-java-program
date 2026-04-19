// static methods are not override 
// static members are accessible from all around the class it can be change by class name . member varialble 
// 
class p17{
    static {
        System.out.println("Static block");

    }
    {
        System.out.println("hello this is instance block");
    }
    static int x;
    static void greet(){
        System.out.println("Hello Deepak");
    }
}

public class prg17 {
    public static void main(String[] args) {
        // p17 p=new p17();
        p17.greet();
        System.out.println(p17.x);
        p17.x=2;
        System.out.println(p17.x);
    }
}
