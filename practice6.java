interface Demo{
    String display(String a);
}

public class practice6 {
    public static void main(String[] args) {
        Demo ref=(a)->{return a;};
        System.out.println(ref.display("hello my dear"));



    }
}
