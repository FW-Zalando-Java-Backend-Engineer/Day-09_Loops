import java.util.Scanner;

public class GreetingsMenu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice = 0;

        while(choice != 4) {
            System.out.println("\n=== Greetings Menu ===");
            System.out.println("1. Say Hello");
            System.out.println("2. Say Good Morning");
            System.out.println("3. Say Good Night");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            switch(choice) {
                case 1:
                    System.out.println("👋 Hello!");
                    break;
                case 2:
                    System.out.println("🌅 Good Morning!");
                    break;
                case 3:
                    System.out.println("🌙 Good Night!");
                    break;
                case 4:
                    System.out.println("👋 Goodbye!");
                    break;
                default:
                    System.out.println("❌ Invalid choice. Please try again.");
            }
        }

        sc.close();
    }
}
