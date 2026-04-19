interface in10{
    int operation(int a,int b);
}
class Calculator{
    public static int sum(int a,int b){
        return a+b;
    }
    public static int mult(int a,int b){
        return a*b;
    }
    public static float division(int a,int b){
        return a/b;
    }
}
public class practice10 {
    public static void main(String a[]){
        
        in10 add=Calculator::sum;
        in10 mul=Calculator::mult;
        System.out.println(add.operation(3,2));
        System.out.println(mul.operation(3,2));
    }
}
