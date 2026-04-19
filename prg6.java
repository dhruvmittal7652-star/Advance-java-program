
interface MyInterface{
    void show(String a);
}
class Demo6{
    public static  void display(String a){
        System.out.println(a);
    }
}

public class prg6 {
    public static void main(String a[]){
        MyInterface ref=Demo6::display;
        ref.show("hello");

    }
}
