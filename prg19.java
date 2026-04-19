
class A19{
    public int x=4;
    public void f1(){
        System.out.println("This is parent");
    }
    public A19(int c){
        this();
        System.out.println("this is parent constructor with parameter");
    }
    public A19(){
       System.out.println("parent constructor");
    }
}
class B19 extends A19{
    int y=2;
    void f2(){
        System.out.println(super.x);
        super.f1();
        System.out.println("Child class ");
    }
    public B19(){
        this(3);
        System.out.println("This is child constructor");
    }
    public B19(int x){
        super(8);
        System.out.println("this is second child constructor");
    }
}
public class prg19 {
    public static void main(String[] args) {
        B19 b=new B19();
        b.f2();
    }
}
