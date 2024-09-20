package AdhyaanExamQ2;
import java.util.Scanner;
public class Question2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        printFactors(number);

        scanner.close();
    }

    public static void printFactors(int num) {
        boolean hasFactors = false;

        System.out.print("Factors of " + num + " (excluding 1 and " + num + "): ");

        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                System.out.print(i + " ");
                hasFactors = true;
            }
        }

        if (!hasFactors) {
            System.out.println("none, the number is prime or has factors only 1 and itself.");
        } else {
            System.out.println();
        }
    }
}
