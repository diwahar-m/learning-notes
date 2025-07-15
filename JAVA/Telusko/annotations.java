package JAVA.Telusko;

class A {
    public void runMethod(){
        System.out.println("Running ...");
    }
}

class B extends A{
    @Override
    public void runMethod(){
        System.out.println("Running ...");
    }
}

public class annotations {
    public static void main(String[] args) {
        B obj = new B();
        obj.runMethod();
    }
}
