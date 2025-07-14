package JAVA.Telusko;

// every class in Java extends Object class
class A {
    public A(){
        System.out.println("Default A");
    }
     public A(int n){
        System.out.println("Pram A"+ n);
    }
}

class B extends A{
    public B(){
        super();
        // by default, every constructor has super 
        System.out.println("Default B");
    }

     public B(int n){
         this(); // executes constructor of curret class
        //super(n); // excutes constructor of super class 
        
        System.out.println("Pram B"+ n);
    }
}



public class constructors {
    public static void main(String[] args) 
    {
        B obj = new B();
        // constructor function calls parent constructor also
        new B(); // anonymous obect without reference
        
    }
}
