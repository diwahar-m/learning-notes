package JAVA.Telusko;



class Calc{
    public int add(int n1, int n2){
        return n1 + n2;
    }
}

// AdvCalc IS A Calc
// Single Level Inheritance
class AdvCalc extends Calc{ 
    public int sub(int n1, int n2){
        return n1 - n2;
    }
}

// Single Level Inheritance
class VeryAdvCalc extends AdvCalc{ 
    public int mul(int n1, int n2){
        return n1 * n2;
    }
}

// Multi Level Inheritance not supported in Java
class C extends A, B {} // Not allowed in Java 

class A{
    public void show(){
        System.out.println("In A show");
    }
}

class B{
    public void show(){ // method over riding occurs here
        System.out.println("In B show");
    }
}


public class inheritance {
    public static void main(String[] args) {

        
        
    }
}