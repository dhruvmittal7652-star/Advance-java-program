
// Method refrence injava

interface int1{
    void show();
}

class Demo{
    public static void display(){
        System.out.println("reference to static method");
    }
}
class Demo2{
    public void disp(){
        System.out.println("Hello my dear");
    }
}
public class prg2 {

    public static void main(String[] args) {

        //call display method of class Demo due to static method
        int1 i1=Demo::display;
        i1.show();


        // call non static method using object
        Demo2 ob=new Demo2();
        int1 i2=ob::disp;
        i2.show();
    }
}
