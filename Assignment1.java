import java.util.Scanner;
import java.util.Random;

public class Assignement1 {
    public static void main(String[] args) {
        double temp;
        double celsius;
        String result = "";
        Scanner scan = new Scanner(System.in);

        // Question 1
        System.out.println("  SS    RRR");
        System.out.println(" S      R  R");
        System.out.println("   S    RRR");
        System.out.println("    S   R  R");
        System.out.println("  SS    R   R");

        // Question 2
        System.out.println("Please enter a number in Fahrenheit: ");
        temp = scan.nextDouble();
        celsius = ((temp - 32) * 5 / 9);
        System.out.println("The temperature in Celsius is: " + celsius);
        scan.nextLine();

        // Question 3
        System.out.println("Please enter 5 letters: ");
        String fiveletter = scan.nextLine();
        if (fiveletter.length() == 5) {
            result = "" + fiveletter.charAt(4)+ fiveletter.charAt(3) + fiveletter.charAt(2);
            System.out.println("Reversed 3rd, 4th, and 5th letters: " + result);
        } else {
            System.out.println("Invalid input, please enter exactly 5 letters.");
        }

        // Question 4
        System.out.println("Generating random number...");
        Random generator = new Random();
        int randomNum = generator.nextInt(Integer.MAX_VALUE);
        System.out.println("Random number: " + randomNum);

        scan.close();
    }
}
