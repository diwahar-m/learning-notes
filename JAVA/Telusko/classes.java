package JAVA.Telusko;


class Shop{

    int num; // instance variable
    // lies within heap memory

    public String getCloth(int price){
        return "Cloth-A";
    }

    // Mwthod Overloading : 2 same methods with different params;
    public int add(int n1, int n2){
        return n1 + n2;
    }

    public double add(double n1, int n2){
        return n1+n2;
    }
}

class Mobile {
    static String name; 
    // making an identifier as common to all instances
    // static field belongs to the class, not an object
    String brand;

    // constructor function;
    // constructor don't have return type
    public Mobile( String brand){
        
        this.brand = brand;
    }

    // static method 
    public static void show1(Mobile obj){
        System.out.println("Static method name"+ name+ obj.brand); // using static variable
    }
}

public class classes {

   
    public static void main(String[] args) {
        creatingInstance();
    }

    public static void creatingInstance(){
        Shop shop = new Shop(); 
        // creating  instance of a class;
        // creates an object in heap memory
        // shop is a reference variable here
        // String are immutable;
        String result = shop.getCloth(10);
        System.out.println(result);

        int[] nums = {1,2,3};
        // enhanced for loop (or) for each loop
        for(int n: nums){
            System.out.print(n+" ");
        }

        String n1 = "Test";
        String n2 = "Test";
        // Immutable string
        // Both ref to same in heap memory
        System.out.println(n1 == n2); 
    }

    public static void StringBuffers(){
        StringBuffer text = new StringBuffer("Name");
        text.append("check");
        text.insert(0,"Hello ");
        // StringBuffer is mutable 
    }

    public static void mobileMethod(){
        Mobile m1 = new Mobile( "test-1");
        m1.name = "m1";
        Mobile m2 = new Mobile( "test-2");
        m1.name = "m2";
        Mobile.name = "m3"; 
        Mobile.show1(m1);
        // static identifier should be called with class, not an object
        System.out.println(Mobile.name);
        
    }

    public static void loadClass(){
        // dynamically load a class by name at runtime. 
        // loading class with static without creating instance
        try {
            Class.forName("JAVA.Telusko.Mobile");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }



}


