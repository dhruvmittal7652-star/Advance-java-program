interface i22{
    Student get();
}
class Student{
    Student(){
        System.out.println("hello");
    }
}
public class prg22{
    public static void main(String args[]){
        i22 ref=Student::new;
        ref.get();
    }
}