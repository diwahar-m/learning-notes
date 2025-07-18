package JAVA.BroCode;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

public class FileWriters {
    public static void main(String[] args) {
        // Writing file using Java

        // multi line string
        String textContent= """
                check 123
                check 456 
                check 789
                """;

        
        try(FileWriter writer =  new FileWriter("sample.txt")){

            writer.write(textContent);

        }catch(FileNotFoundException e){
            System.out.println("Error: "+ e);
        } catch(IOException e){
            System.out.println("Error: "+ e);
        }

        playAudioFile();
    }

    static void playAudioFile(){
        String audioFilePath = "BAK.wav";
        
        File file = new File(audioFilePath);

        try( AudioInputStream audioStream = AudioSystem.getAudioInputStream(file)){

            Clip clip = AudioSystem.getClip();
            clip.open(audioStream);

            String response ="";
            Scanner scanner = null;

            while(response != "Q"){

                 scanner = new Scanner(System.in);

                System.out.println("P - Play"); 
                System.out.println("S - Stop");
                System.out.println("R - Reset");
                System.out.println("Q - Quit");

                System.out.print("Enter your response: ");
                response = scanner.nextLine().toUpperCase(); 

                switch(response){
                    case "P" -> clip.start(); 
                    case "S" -> clip.stop();
                    case "R" -> clip.setMicrosecondPosition(0);
                    case "Q" -> clip.close();
                    default -> System.out.println("Invalid response");

                }

            }
            scanner.close();
        } catch(LineUnavailableException e){
            System.out.println("Unable to access audio resource");
        }catch(UnsupportedAudioFileException e){
            System.out.println("Unsupported audio file: "+ e);
        }catch(IOException e){
            System.out.println("Unsupported audio file+ e");
        } 
    }
}
