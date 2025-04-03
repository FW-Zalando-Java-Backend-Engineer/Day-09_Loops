import java.util.Scanner;


// Sum of first N numbers (user input)
public class SumExample {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to sum: ");
        int N = sc.nextInt();

        int sum = 0;
        int i = 1;
        System.out.println("Sum is initialized with value: "+sum);
        System.out.println("i: the iterator is initialized with value: "+i);
        while (i <= N) {
            sum += i; // sum = sum +i;
            System.out.println("value of sum is: "+sum+ " at iteration: "+i);
            i++; // increase i by 1: i = i + 1;
            System.out.println("next iteration is: "+i);
        }

        System.out.println("Sum is: "+sum +" There were no iterations: "+i);


    }
}
