
import java.util.Scanner;

public class change {

    public static void main(String[] args) {
        Scanner sacanner = new Scanner(System.in);


        System.out.print("Enter amount to pay: ");
        int customerpay = sacanner.nextInt();

        if (customerpay <= 1000) {
        int change = 1000 - customerpay;
        System.err.println("change is: " + change + " bath");

        int five_hundred1 = change / 500;
        change = change % 500;
        System.out.println("Five-hundred note: " + five_hundred1 + " note(s)");

        int hundred_note1 = change / 100;
        change = change % 100;
        System.out.println("Hundred note: " + hundred_note1 + " note(s)");

        int fifty_note1 = change / 50;
        change = change % 50;
        System.out.println("Fifty note: " + fifty_note1 + " note(s)");

        int twenty_note1 = change / 20;
        change = change % 20;
        System.out.println("Twenty note: " + twenty_note1 + " note(s)");

        int ten_coin1 = change / 10;
        change = change % 10;
        System.out.println("Ten coin: " + ten_coin1 + " coin(s)");

        int five_coin1 = change / 5;
        change = change % 5;
        System.out.println("Five coin: " + five_coin1 + " coin(s)");

        int two_coin1 = change / 2;
        change = change % 2;
        System.out.println("Two coin: " + two_coin1 + " coin(s)");
        
        System.out.println("One coin: " + change + " coin(s)");
        }
        
        else {
            System.out.println("Not Enough Money!!");
        }

    }
}
