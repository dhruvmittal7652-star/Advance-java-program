// sealed class 
// if the parent class is sealed then coder need to make child class as a  sealed/ non-sealed/ final
// if child class is make a sealed then you need to permit another sub class

sealed class Vehicle permits Car,Bike,Scooter{
    public void start(){
        System.out.println("Vehicle start");
    }
}
final class Car extends Vehicle {
    public void run(){
        System.out.println("Car is running");
    }
}
non-sealed class Bike extends Vehicle {
    public void run(){
        System.out.println("bike is running");
    }
}
sealed class Scooter extends Vehicle permits newScooter{
    public void run(){
        System.out.println("Super car is run");
    }
}
final class newScooter extends Scooter{
    public void run(){
        System.out.println("Scooter is run");
    }
}

public class prg15 {
    public static void main(String[] args) {
        Vehicle v=new Vehicle();
        v.start();
        Car c=new Car();
        c.run();
        Bike b=new Bike();
        b.run();
    }
}
