
interface I13{
    private void checkBalance(){
        System.out.println("Check balance");
    }
    default void deposit(){
        System.out.println("Money deposited");
        checkBalance();
    }
}

public class prg13 implements I13{
    public static void main(String[] args) {
        prg13 ob = new prg13();
        ob.deposit();
    }
}
