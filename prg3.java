
// Method References
// interface MyInterface{
//     void show(String msg);
// }

// public class prg3 {
//     public static void main(String[] args) {
//         MyInterface ref=String :: toUpperCase();
//         ref.show("java");
//     }
// }

interface first{
    int cal(String a);
}
// interface second{
//     void show2()
// }

public class prg3{
    public static void main(String[] args) {
        first f=String::length;
        System.out.println(f.cal("hello"));
    }
}