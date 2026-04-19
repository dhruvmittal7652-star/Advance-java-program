import java.util.*;
public class prg27 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter two numbers");
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println("Enter the operation +,-,/,%,* which you want to calculate");
        char ch=sc.next().charAt(0);
        int calculation = switch(ch){
            case '+'->a+b;
            case '-'->a-b;
            case '/'->a/b;
            case '%'->a%b;
            case '*'->a*b;
            default -> 0;
        };
        System.out.println(calculation);

    }
}
