package JAVA.Telusko;

// can't extend enum with other class
// parent class is Enum
enum Status { // a class
    Running, Failed, Pending, Success; // constants 
} 

enum Laptop {
    Macbook( 2000), XPS, ThinkPad( 1500);

    private int price;

    private Laptop(){
        price = 500;
    }

    private Laptop(int price){ // constructor
        this.price = price;
    }

    public int getPrice() {
        return price;
    } 

    public void setPrice(int price){
        this.price = price;
    }
}

public class enums {
    public static void main(String[] args) {
        
        Status singleStatus = Status.Pending; 
        System.out.println(singleStatus);
        System.out.print(singleStatus.getClass().getSuperclass());

        Status[] statusArray = Status.values(); 
        for(Status s: statusArray){
            System.out.println(s);
        } 

        switch(singleStatus){
            case Running:
                System.out.println("All good");
                break;
            default:
                System.out.println("No response");
        }

        // ---------------- 
        Laptop lap = Laptop.Macbook;
        System.out.println(lap + " : "+ lap.getPrice());

        for(Laptop lap1: Laptop.values()){
            System.out.println(lap+": "+ lap1.getPrice());
        }
    }
}