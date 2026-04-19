
interface in11{
    int operation(int a,int b);
}
interface in11nd{
    boolean operation(int a);
}
class Calculator{
    public static int add(int a,int b){
        return a+b;
    }
    public static int max(int a,int b){
        if(a>b){
            return a;
        }
        return b;
    }
    public static boolean isEven(int a){
        if(a%2==0){
            return true;
        }
        return false;
    }
}

public class practice11 {
    public static void main(String[] args) {
        in11 sum=Calculator::add;
        in11 max=Calculator::max;
        in11nd isEven=Calculator::isEven;
        System.out.println(sum.operation(3,4));
        System.out.println(max.operation(3,4));
        System.out.println(isEven.operation(4));
    }
}
