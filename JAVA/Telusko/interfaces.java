package JAVA.Telusko;


// class - class -> extends
// class - interface -> implements 
// iterface - interface -> extends


// interface is just for a design
interface A {  // abstract class

    // every variable is final & static
    int age = 44;
    String area = "Mumbai";

    // By default, every method inside interface is 'public abstract'
    void show();
    void config();
}

interface X {
    void run();
}

interface Y extends X {

}

class B implements A, Y {
    public void  show(){
        System.out.println("In show");
    }
    public void  config(){
        System.out.println("In config");
    } 
    public void  run(){
        System.out.println("It's running");
    }

}

public class interfaces {
    public static void main(String[] args) {


        System.out.println(A.age);

        A obj;
        obj = new B();
        obj.show();
        obj.config();

        X obj1 = new B();
        obj1.run();
    }
}
