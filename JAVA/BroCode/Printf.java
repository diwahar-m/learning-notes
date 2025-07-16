package JAVA.BroCode;

public class Printf {
    public static void main(String[] args) {
        String name = "amigos";
        char  i = 'h';
        int j = 30;
        double num = 2423525; 


        // %[flags][width][.precision][specific-character]

        System.out.printf("\nChar is %c \n" , i);
        System.out.printf("Hello %s \n", name);
        // 
        System.out.printf("Number integer is %d \n" , j);
        System.out.printf("Double is % .2f \n", num);

    }
}
