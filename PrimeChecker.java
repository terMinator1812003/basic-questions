import java.util.Scanner;

public class PrimeChecker {

    public static void main(String[] args) {

        // Get user input for the number to check for prime
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Initialize a flag variable to indicate if the number is prime or not
        boolean isPrime = true;

        // Check if the number is prime using a for loop
        for (int i = 2; i <= number / 2; i++) {
            if (number % i == 0) {
                isPrime = false;
                break;
            }
        }

        // Print whether the number is prime or not
        if (isPrime) {
            System.out.println(number + " is a prime number.");
        } else {
            System.out.println(number + " is not a prime number.");
        }

        scanner.close();
    }
}
