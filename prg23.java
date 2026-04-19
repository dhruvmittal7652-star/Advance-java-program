
interface I23 {

    int max(int a, int b);
}

public class prg23 {

    public static void main(String args[]) {
        I23 ref = (int a, int b)
                -> {
            if (a > b) {
                return a;
            } else {
                return b;
            }
        };
        I23 ref2=(int a,int b)->{return a>b ? a:b;};
        System.out.println("max is "+ref.max(3,4));
        System.out.println("max is "+ref2.max(3,4));

    }
}
