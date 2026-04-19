class cons16_1{
    {
    System.out.println("It is an example of default constructor");
    }
}
class cons16_2{
    cons16_2(){
        System.out.println("It is an example of no argument constructor");
    }
}
class cons16_3{
    private int x;

    cons16_3(int x){
        this.x=x;
        System.out.println("it is an example of argument constructor");
    }
    
}
class cons16_4{
    int x;
    cons16_4(int x){
        this.x=x;
    }
    cons16_4(cons16_4 ob){
        this.x=ob.x;
        System.out.println("this is an example of copy constructor");
        // System.out.println(x);
        System.out.println(this.x);
        

    }
}
public class prg16 {
    
    public static void main(String args[]){
        cons16_1 p1=new cons16_1();
        cons16_2 p2=new cons16_2();
        cons16_3 p3=new cons16_3(3);
        cons16_4 original=new cons16_4(3);
        cons16_4 copy=new cons16_4(original);

    }
}
