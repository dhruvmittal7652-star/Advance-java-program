


interface I9{
    default void f1(){
        System.out.println("Default method inside interdace1");
    }
}
interface I9nd{
    default void f1(){
        System.out.println("Default method inside interface2");
    }
}
public class prg9 implements I9,I9nd{
    
    public void f1(){
        I9.super.f1();
        I9nd.super.f1();
    }
   public static void main(String[] args) {
       prg9 d=new prg9();
        d.f1();
   } 
}


