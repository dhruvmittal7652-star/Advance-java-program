
interface I11{
    static int add(int x,int y){
        return x+y;
    }
}
public class prg11 {
    public static void main(String[] args) {
        int sum=I11.add(3,5);
        System.out.println(sum);
    }    
}
