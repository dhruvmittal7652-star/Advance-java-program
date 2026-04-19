
class p18_1{
    public void f1(){
        System.out.println("This is one ");
    }
}

// extends p18_1 Here is single inheritance
class p18_2 extends p18_1{
    public void f2(){
        System.out.println("this is two");
    }
}

// p18_1 extends by p18_2 and it is inherit by p18_3 
// so here is multilevel inheritance
class p18_3 extends p18_2{
    public void f3(){
        System.out.println("This is third");
    }
}

   // A ->  B
   // A ->  D
   // so here is hierachical inheritance
   []

class p18_4 extends p18_1{
    public void f4(){
        System.out.println("this is fourth");
    }
}

public class prg18 {
    public static void main(String[] args) {
        p18_2 p1=new p18_2();
        p1.f1();
        p1.f2();
        p18_4 p2=new p18_4();
        p2.f1();
        // p2.f3();
        p2.f4();
        p18_3 p3=new p18_3();
        p3.f1();
        p3.f2();
        p3.f3();
    }
}
