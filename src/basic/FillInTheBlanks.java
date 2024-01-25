package basic;

import java.util.Scanner;

public class FillInTheBlanks {
    public static void main(String[] args)
    {
        System.out.println("Fill in the blanks...");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Input the season.");
        String season = scanner.next();

        System.out.println("Input the adjective to describe it.");
        String adjective = scanner.next();

        System.out.println("Input an integer");
        int number = scanner.nextInt();

        scanner.close();

        System.out.println("On a " + adjective + " " + season + " day, I drink a minimum of " + number + " cups of coffee.");

    }
}
