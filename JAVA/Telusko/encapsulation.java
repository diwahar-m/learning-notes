package JAVA.Telusko;


class Human{
    private int age ; // accessible within class only
    private String name ;

    public Human(){
        age =12;
        name = "John";
    }

    public Human(int a,String n){ // Paramterized constructor
        this.age =a;
        this.name = n;
    }

    public int getAge(){ // getters
        return age;
    }

    public void setName(String n){ // setters
        this.name = n;
    }
}


public class encapsulation {
    public static void main(String[] args) {
        
        Human obj1 = new Human();
        Human obj2 = new Human(18, "Jack");
        obj1.setName("Jack");
        System.out.println(obj1.getAge());
    }
}
