package variables;

import java.util.Scanner;

public class GrossPayCalculator {
    public static void main(String[] args){
        System.out.println("How man hours did you work??");
        Scanner scanner = new Scanner(System.in); // To get input, we use scanner class
        int hours = scanner.nextInt();

        System.out.println("What is your pay rate?");
        double payRate = scanner.nextDouble();
        double grossPay = hours * payRate;

        System.out.println("Gross Pay : " + grossPay);
    }
}
