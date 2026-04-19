
interface MaxOfTwo{
    int maximum(int a,int b);
}
public class practice2 {
    public static void main(String[] args) {
        MaxOfTwo max=(a,b)->Math.max(a,b);
        System.out.println("Maximum of given two numbers is : "+max.maximum(3,5));
    }
}
