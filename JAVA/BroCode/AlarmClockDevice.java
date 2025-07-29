package JAVA.BroCode;

import java.io.File;
import java.io.IOException;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

class AlarmClock implements Runnable {

    private final LocalTime alarmTime; 
    private final Scanner scanner;

    AlarmClock(LocalTime alarm, Scanner scanner){
        this.alarmTime = alarm;
        this.scanner = scanner;
    }

    @Override 
    public void run(){

        while(LocalTime.now().isBefore(alarmTime)){
            try{
                Thread.sleep(1000);

                LocalTime now = LocalTime.now();
                System.out.println(now);
                int hours = now.getHour();
                int minutes = now.getMinute();
                double seconds =now.getSecond();

                System.out.printf("\r %02d: %02d:%.2f", hours, minutes, seconds);

            } catch(InterruptedException e){
                System.out.println("Error faced with the thread");
            }
        }

        System.out.println("Alarm Rings");
        
        try(AudioInputStream audioStream = AudioSystem.getAudioInputStream(new File("BAK.wav"))){
            
            Clip clip = AudioSystem.getClip();
            clip.open(audioStream);
            clip.start();
            System.out.println("Stop Alarm by pressing any key");
            scanner.nextLine();
            clip.stop();
            scanner.close();


        } catch(UnsupportedAudioFileException e){
            System.out.println("Unsupppoted File");
        } catch(IOException e){
            System.out.println("Unsupppoted Input");
        }catch(LineUnavailableException e){
            System.out.println("Unsupppoted File");

        }
    }
}

public class AlarmClockDevice {
    public static void main(String[] args) {
        

        Scanner scanner = new Scanner(System.in);
        LocalTime alarmTime = null;

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
        while (alarmTime == null){
            System.out.println("Enter Alarm Time: ");
            String localTime = scanner.nextLine();
             alarmTime = LocalTime.parse(localTime, formatter );

        } 

        AlarmClock alarm_1 = new AlarmClock(alarmTime, scanner);
        Thread thread_1 = new Thread(alarm_1);
        thread_1.start();
    }
}
