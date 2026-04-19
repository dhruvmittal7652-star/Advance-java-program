// Default method in interface 
// it is use when we do not want implement this method by subclass
// it should be write in interface and also with implementation and access by sub classes

interface I8{
    // void show();

    default void f1(){
        System.out.println("Default method inside the interface");
    }
}



public class prg8 implements I8{

    public static void main(String[] args) {
        prg8 d=new prg8();
        d.f1();
    }
}
