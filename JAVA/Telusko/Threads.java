package JAVA.Telusko;

class A extends Thread {
    public void run(){ // method name should be run to execute thread
        for(int i =0;i<100;i++){
            System.out.println("HI");
            try{

                Thread.sleep(10);
            }catch(InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}

class B extends Thread{
     public void run(){
        for(int i =0;i<100;i++){
        System.out.println("HEllo");
        
    }
}
}
// -------------------------- 

class C implements Runnable {
    public void run(){ // method name should be run to execute thread
        for(int i =0;i<5;i++){
            System.out.println("HI");
            try{

                Thread.sleep(10);
            }catch(InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}

class D implements Runnable{
     public void run(){
        for(int i =0;i<5;i++){
        System.out.println("HEllo");
        
    }
}
}


// ------------------------------

public class Threads{
    public static void main(String[] args) {
        // threads used to execute the events at parallel 
        A obj1 = new A();
        B obj2 = new B();
        obj2.setPriority(Thread.MAX_PRIORITY);
        obj1.start();
        obj2.start();

        secondWay();
    }


    public static void secondWay(){
        Runnable obj1 = new C();
        Runnable obj2 = new D();

        Thread A = new Thread(obj1);
        Thread B = new Thread(obj2); 
        A.start();
        B.start();


    } 

    public static void thirdWay(){
        Runnable obj1 = new Runnable(){ // we can also use lambda expression here as Runnable is FI
            public void run(){

                for(int i =0;i<5;i++){
                    System.out.println("HI");
            }
                try{

                    Thread.sleep(10);
                }catch(InterruptedException e){
                    e.printStackTrace();
                }
            }
        };  
        
        Runnable obj2 = () -> {
                for(int i =0;i<5;i++){
                    System.out.println("Hello");
            }
                try{

                    Thread.sleep(10);
                }catch(InterruptedException e){
                    e.printStackTrace();
                }
            };

        Thread A = new Thread(obj1);
        Thread B = new Thread(obj2); 
        A.start();
        B.start();
    }
}
