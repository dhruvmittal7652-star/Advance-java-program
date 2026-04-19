
import java.util.Scanner;

interface Check{
    boolean greaterThenTen(int n);
}

public class practice5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int n=sc.nextInt();
        Check ref=(a)->{
            if(a>10){
                return true;
            }
            return false;
        };

        System.out.println(ref.greaterThenTen(n));


    }
}
