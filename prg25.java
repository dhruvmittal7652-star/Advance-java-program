import java.util.*;
interface I25{
    boolean isLie(int a);
}
public class prg25 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the range ");
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        System.out.println("enter the number");
        int num=sc.nextInt();
        I25 ref=(int a)->{
            if(a<=n2 && a>=n1){
                return true;
            }
            else {
                return false;
            }
        };
        System.out.println("number is lie : "+ref.isLie(num));
    }
}
