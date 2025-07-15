package JAVA.Telusko;

class A {
    public void calling(){
        System.out.println("This is the method of A");
    }

    class B{
        public void calling(){
            System.out.println("This is inner class of A");
        }
    } 
    
    // static can only be used for inner class 

    static class C{
        public void calling(){
            System.out.println("This is inner  static class of A");
        }
    }
}

public class innerClass {
    public static void main(String[] args) {
        A obj = new A();
        A.B obj1 = obj.new B(); // creating object of inner class B 
        obj1.calling();

        A.C obj2 = new A.C(); // creating object of inner static class C

        A obj3 = new A(){ // anonymous class
            public void calling(){
                System.out.println("This is inner class of A");
            }
        };
        obj3.calling();
    }
}
