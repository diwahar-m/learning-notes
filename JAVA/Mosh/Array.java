package JAVA.Mosh;

import java.text.NumberFormat;
import java.util.Arrays;

public class Array {
    public static void main(String[] args) {
        int[][] numbers = new int[2][3];
        numbers[0][0] = 9;
        // converting 2D array to string
        System.out.print(Arrays.deepToString(numbers));

        // final makes identifier as unnmutable
        final int NUM = 0;

        NumberFormat percent = NumberFormat.getPercentInstance();
        // here ,NumberFormat is a abstract class.
        // so, we can't make an instance of it.
        String result = percent.format(0.1);
        System.out.println(result);

        // method chaining
        System.out.println(NumberFormat.getCurrencyInstance().format(12345));
    }

}
