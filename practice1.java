
interface MathOperator{
    int MathOperation(int a);
}
public class practice1 {

    public static void main(String[] args) {
        MathOperator square=(a)->{return a*a;};
        System.out.println("Square of number is : "+square.MathOperation(4));

    }
}
