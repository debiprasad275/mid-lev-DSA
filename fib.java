import java.util.Scanner;

public class fib{

   // private static int c;

    // A method to find the nth Fibonacci number using iteration
    public static int fib(int n) {
        // Initialize the first two Fibonacci numbers as 0 and 1
        int a = 0;
        int b = 1;

        // Loop from 0 to n-1
        for (int i = 0; i < n; i++) {
            // Update the next Fibonacci number as the sum of the previous two
            int c = a + b;
            // Update the previous two Fibonacci numbers as the current two
            a = b;
            b = c;
        }

        // Return the nth Fibonacci number
        return ;
        
    }

    public static void main(String[] args) {
        // Create a scanner object to read user input
        Scanner sc = new Scanner(System.in);

        // Prompt the user to enter a positive integer
        System.out.print("Enter a positive integer: ");

        // Read the user input as an integer
        int n = sc.nextInt();

        // Close the scanner object
        sc.close();

        // Call the fib method and print the result
        System.out.println("The " + n + "th Fibonacci number is: " + fib(n));
    }
}

