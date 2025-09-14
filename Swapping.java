
import java.util.Scanner;

public class Swapping{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number1 pls: ");
        int number1 = scanner.nextInt();
        System.out.print("Enter number2 pls: ");
        int number2 = scanner.nextInt();

        System.out.println("Current -> number1 = "+number1+"and number2 = "+number2);
        System.out.println("Swapping.........");
       
       //เอาไว้เก็บหาตอนสลับจะได้ไม่หายไปอันนี้ผลเขียนเองนะคับอาจารย์
        int box = number1;
        number1 = number2;
        number2 = box;
       
        System.out.println("Now -> number1 = "+number1+"and number2 = "+number2);




    }   
}   