import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your number: ");
        int number = input.nextInt();

        if (number % 2 == 0) {
            System.out.println("The number "+number+" is Even");
        } else {
            System.out.println("The number "+number+" is Odd");
        }
    }
}
