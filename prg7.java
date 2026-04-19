interface Greeter{
    void sayHello(String s);
}
class Greet{
    public static void hello(String s){
        System.out.println("Hello sir "+s);
    }
}

public class prg7{
    public static void main(String[] args) {
        Greeter ref=Greet::hello;
        ref.sayHello("Deepak");
    }
}