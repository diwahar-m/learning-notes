package JAVA.BroCode;

import java.util.Timer;
import java.util.TimerTask;

public class Schedules {
    public static void main(String[] args) {


        
        Timer time = new Timer(); // timer class to schedule the task
        TimerTask timerTask = new TimerTask() {
            int count = 3;
            @Override 
            public void run(){ // task need to be speicified within this method
                
                count --;
                System.out.println("It's running now"); 
                if(count <= 0){
                    System.out.println("Time up !!");
                    time.cancel();
                }
            }
        };

        time.schedule(timerTask, 2000, 1000);
        // used for notifications.
    }
}
