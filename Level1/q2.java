import java.util.Scanner;

public class q3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Take user inputs
        System.out.print("Enter number1: ");
        double number1 = input.nextDouble();
        
        System.out.print("Enter number2: ");
        double number2 = input.nextDouble();
        
        System.out.print("Enter number3: ");
        double number3 = input.nextDouble();

        // Evaluate the largest for each
        boolean firstIsLargest = (number1 >= number2) && (number1 >= number3);
        boolean secondIsLargest = (number2 >= number1) && (number2 >= number3);
        boolean thirdIsLargest = (number3 >= number1) && (number3 >= number2);

        // Print the output
        System.out.println("Is the first number the largest? " + firstIsLargest);
        System.out.println("Is the second number the largest? " + secondIsLargest);
        System.out.println("Is the third number the largest? " + thirdIsLargest);

        input.close();
    }
}
