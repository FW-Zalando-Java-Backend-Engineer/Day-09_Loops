
import java.util.Scanner;

public class MenuCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int choice = 0;


        while (choice != 5) { // exit condition choice is equal to 5
            System.out.println("\n===== Calculator Menu =====");
            System.out.println("1. Add");
            System.out.println("2. Subtract");
            System.out.println("3. Multiply");
            System.out.println("4. Divide");
            System.out.println("5. Exit");
            System.out.print("Choose an operation: ");
            choice = sc.nextInt(); // Read the user’s choice

            // Only ask for numbers if the choice is between 1 and 4.
            if (choice >= 1 && choice <= 4) {
                System.out.print("Enter first number: ");
                 double num1 = sc.nextDouble();

                System.out.print("Enter second number: ");
                 double num2 = sc.nextDouble();

                // Use switch to process the choice
                switch (choice) {
                    case 1:
                        System.out.println("Result: " + (num1 + num2));
                        break;
                    case 2:
                        System.out.println("Result: " + (num1 - num2));
                        break;
                    case 3:
                        System.out.println("Result: " + (num1 * num2));
                        break;
                    case 4:
                        if (num2 == 0) {
                            System.out.println("⚠️ Error: Cannot divide by zero."); // validation
                        } else {
                            System.out.println("Result: " + (num1 / num2));
                        }
                        break;
                }

            }else if (choice == 5) {
                System.out.println("👋 Exiting calculator. Goodbye!");
            }else {
                System.out.println("❌ Invalid choice. Please try again.");
            }





        }

        sc.close();


    }
}
