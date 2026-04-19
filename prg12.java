
interface I12{
    static int mul(int x,int y){
        return x*y;
    }
}
interface I12nd{
    static int  mul(int x,int y,int z){
        return x*y*z;
    }
}

public class prg12{
    
    public static void main(String arg[]){
        prg12 d=new prg12();
        System.out.println(I12.mul(2,3));
        System.out.println(I12nd.mul(2,3,2));
        // System.out.println(d.mul(2,3,2));
    }
}
