import java.util.Scanner;

public class DoWhileCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do{
            System.out.println("\n===== Calculator Menu =====");
            System.out.println("1. Add");
            System.out.println("2. Subtract");
            System.out.println("3. Multiply");
            System.out.println("4. Divide");
            System.out.println("5. Exit");
            System.out.print("Choose an operation: ");
            choice = scanner.nextInt();

            if (choice >= 1 && choice <= 4) {
                System.out.print("Enter first number: ");
                double num1 = scanner.nextDouble();
                System.out.print("Enter second number: ");
                double num2 = scanner.nextDouble();

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
                            System.out.println("⚠️ Error: Cannot divide by zero.");
                        } else {
                            System.out.println("Result: " + (num1 / num2));
                        }
                        break;
                }
            } else if (choice == 5) {
                System.out.println("👋 Exiting calculator. Goodbye!");
            } else {
                System.out.println("❌ Invalid choice. Please try again.");
            }




        }while (choice != 5);
        System.out.println("Program ended");

        scanner.close();


    }
}
