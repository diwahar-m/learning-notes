package JAVA.Telusko;

abstract class Computer {
    public abstract void code();
} 

class Laptop extends Computer {
    public void code(){
        System.out.println("code, compile , run");
    }
} 

class Desktop extends Computer {
    public void code(){
        System.out.println("code, compile , run: Faster");
    }
}

class Developer {
    public void devApp(Computer lap){
        lap.code();
    }
}

public class baseClass {
    public static void main(String[] args) {
        Computer lap = new Laptop(); // object based on design Computer
        Computer desk = new Desktop(); // object based on design Computer

        Developer john = new Developer();
        john.devApp(lap);
    }
}
