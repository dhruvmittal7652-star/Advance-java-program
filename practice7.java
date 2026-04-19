interface MyInterface7{
    boolean isPositive(int x);
}
public class practice7 {
    public static void main(String a[]){
        // MyInterface7 ref=(x)->{
        //     if(x<0){
        //         return false;
        //     }
        //     return true;
        // };
        MyInterface7 ref=(x)->(x<0) ? false : true;

        System.out.println(ref.isPositive(-5));
    }
}
