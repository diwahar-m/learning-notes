package JAVA.Telusko;

@FunctionalInterface // annotations - FI
interface A {
    // FI has only one method
    void show(int i);
}

@FunctionalInterface // annotations - FI
interface B {
    // FI has only one method
    int add(int i, int j);
}
public class functionalInterfaces {
    public static void main(String[] args) {
        A obj = new A(){
            public void show(int i){
                System.out.println("In show");
            }
        };

        // ------ Lampda expression 
        // lampda expression only work with FI
        A obj1 = i ->  System.out.println("In show");
       
        obj1.show(5); 

        //-------

        B obj3 = (i,j) -> i+j;
        int result = obj3.add(5,4);
        System.out.println(result);
    }
}
