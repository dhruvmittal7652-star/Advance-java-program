// check if a number is divisible by 3
import java.util.*;
interface DivBy3 {

    boolean div(int n);
}

public class practice4 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int n=sc.nextInt();
        DivBy3 ref = (a) -> {
            if (a % 3 == 0) {
                return true;
            }
            return false;
        };

        if (ref.div(n)) {
            System.out.print(n+" is Divisible by 3");
        }
        else{
            System.out.println(n+" is not divisible by 3");
        }
    }

}
