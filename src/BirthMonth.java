import java.util.Scanner;

public class BirthMonth {
    public static void main(String[] args) {

        // declare variables: birthMonth, invalidInput
        Scanner in = new Scanner(System.in);
        int birthMonth = 0;
        String invalidInput = "";

        // prompt user to enter birth month
        System.out.print("Enter your birth month (1-12): ");

        // if input is a valid int
        if (in.hasNextInt()) {
            // read the int, clear buffer
            birthMonth = in.nextInt();
            in.nextLine();

            // if birth month is in range 1-12, print birth month
            if (birthMonth >= 1 && birthMonth <= 12) {
                System.out.println("Your birth month is: " + birthMonth);
            } else {
                // else output error message with the invalid value
                System.out.println("You entered an invalid month value: " + birthMonth);
            }
        } else {
            // else read bad input as string, output error
            invalidInput = in.nextLine();
            System.out.println("Invalid input: " + invalidInput);
            System.out.println("Run this program again and enter a valid month number (1-12)!");
        }
    }
}