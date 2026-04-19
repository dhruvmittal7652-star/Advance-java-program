
// it is use at a place of getter and setter
// use record keyword in the place of class 
// it create a constructor , gettor ,settor

// it is use to acess private members of class prg21Data

record prg21Data(int id,String name){

}
public class prg21 {
    public static void main(String[] args) {
        prg21Data s1=new prg21Data(3, "Deepak");
        System.out.println(s1.id()+"  "+s1.name());
    }
}
