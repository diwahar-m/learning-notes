package JAVA.Telusko;


abstract class Car { // an abstract class
    public abstract void drive(); 
    // declarinng method using abstract
    // sub class of Car must implement all the abstract method

    public void playMusic(){
        System.out.println("Car playing Music");
    }
}

class WagonR extends Car { //a concrete class
    public void drive(){ // inherited abstract method
        
            System.out.println("Driving ...");
        
    }
}

public class abstarct {
    public static void main(String[] args) {
        Car car1 = new Car(); // can't create object of abstract class;

        Car car2 = new WagonR();
        car2.drive();
    }
}
