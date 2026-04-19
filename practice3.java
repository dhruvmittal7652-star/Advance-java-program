// Use a lamda to join two string

interface ConcateString{
    String concate(String a,String b);
}
public class practice3 {
    public static void main(String[] args) {
        ConcateString add=(a,b)->{return a+b;};
        ConcateString add2=(a,b)->{return a.concat(b);};
        System.out.println("First string is :"+add.concate("hello ","My dear"));
        System.out.println("Second string is :"+add2.concate("How ","are you"));
    }
}
