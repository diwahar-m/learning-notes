package JAVA.Mosh;

import java.text.NumberFormat;
import java.util.Scanner;

public class MortgageCal {
    public static void main(String[] args) {
        final byte MONTHS_IN_YEAR = 12;
        final byte PERCENT = 100;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Principal: ");
        int principal = scanner.nextInt();

        System.out.print("Annual Interest: ");
        int annualInterest = scanner.nextInt();
        float monthlyInterest = annualInterest/ PERCENT /MONTHS_IN_YEAR ;

        System.out.print("Number of Years: ");
        byte years = scanner.nextByte();
        int numberOfYears = years * MONTHS_IN_YEAR;

        double interestPow = Math.pow(1+monthlyInterest, numberOfYears);

        double mortgage = principal * (( monthlyInterest * interestPow)/ (interestPow -1)); 

        System.out.print("Mortgage: "+ NumberFormat.getCurrencyInstance().format(mortgage));
    }
}
