package JAVA.Telusko;

class A {
    public void show1(){
        System.out.println("In A show");
    }
} 

class B extends A {
    public void show2(){
        System.out.println("In B show");
    }
}

public class casting {


    public static void main(String[] args) {
        A obj = (A) new B(); // Upcasting
        obj.show1();

        B obj1 = (B) obj; // Downcasting
        obj1.show2();
    }
}
