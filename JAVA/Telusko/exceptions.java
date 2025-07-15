package JAVA.Telusko;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

// creating our own exception 
class OurException extends Exception{
    public  OurException(String s){
        super(s);
    }
}

// Ex: Handling exception when accessing file 
class AccessFile{
    public void accessFile(){
        try{
            Class.forName("Human");
        }catch(ClassNotFoundException e){
            e.printStackTrace();
        }
    }
}

public class exceptions {
    public static void main(String[] args) {
        int i = 0;
        int j = 0;

        int[] arr1  = new int[5];

        try {
            j = 18/i; 
            if(i < 0) 
              throw new OurException("zero nat valid");
            if(i == 0)
                throw new ArithmeticException("zero nat valid"); // exception throwed here will be cached
            System.out.println(arr1[5]);
        } catch(OurException e){
            System.out.println("Negative Numbers "+ e);
        }  catch(ArithmeticException e){
            System.out.println("Please check number "+ e);
        } catch(ArrayIndexOutOfBoundsException e){
            System.out.print("Stay in your limit");
        } catch(Exception e){ 
            // Exception is the parent class of all exceptions
            System.out.println("Something went wrong"+ e);
        }

        System.out.println(j); 

        System.out.println("Bye");

         // getting inputs
         methodOne();
         methodTwo();

    } 


    public static void methodOne( ){

        InputStreamReader in = new InputStreamReader(System.in);
        BufferedReader bf  = new BufferedReader(in);

        try{
            int givenNum = Integer.parseInt(bf.readLine());
            System.out.println(givenNum);
        }catch(Exception e){
            System.out.println(e);
        }
       
    }

    public static void methodTwo(){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(num);
    }

    public static void learnFinally () throws IOException {
        
        BufferedReader bf = null;
        try{
            InputStreamReader in = new InputStreamReader(System.in);
             bf  = new BufferedReader(in);
            int givenNum = bf.read();
            System.out.println(givenNum);
        }finally{
            // finally is used to close connections;
            bf.close();
        }
    }

    public static void tryWithoutFinally() throws IOException {
        int num = 0;
        try(BufferedReader bf  = new BufferedReader(new InputStreamReader(System.in))){
             num = Integer.parseInt(bf.readLine());
            System.out.println(num);
        }
    }
}
