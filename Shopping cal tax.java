
import java.util.Scanner;

public class JavaProgrammingExam {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a productName1: ");
        String productName1 = scanner.nextLine();
        System.out.print("Enter a productPrice1: ");
        float productPrice1 = scanner.nextFloat();
        scanner.nextLine();

        System.out.print("Enter a productName2: ");
        String productName2 = scanner.nextLine();
        System.out.print("Enter a productPrice2: ");
        float productPrice2 = scanner.nextFloat();
        scanner.nextLine();

        System.out.print("Enter a productName3: ");
        String productName3 = scanner.nextLine();
        System.out.print("Enter a productPrice3: ");
        float productPrice3 = scanner.nextFloat();
        scanner.nextLine();

        System.out.print("Enter a customer paid money: ");
        float customerpaidmoney = scanner.nextFloat();
        scanner.nextLine();

        System.out.println("Product name 1: " + productName1);
        System.out.println("Product price 1: " + productPrice1);

        System.out.println("Product name 2: " + productName2);
        System.out.println("Product price 2: " + productPrice2);

        System.out.println("Product name 3: " + productName3);
        System.out.println("Product price 3: " + productPrice3);
        System.out.println("customerpaidmoney: " + customerpaidmoney + "bath");
        System.out.println();

        //total is price before tax
        float total= productPrice1 + productPrice2 + productPrice3;
        System.out.println("Total price before tax: "+total+" bath");

        //Tax 7%
        float vat = total * 0.07f;
        System.out.println("Vat 7%: "+vat+" bath");

        //total after tax
        float netPrice = total + vat;
        System.out.println("Total price after tax: "+netPrice+" bath");
        
        //customer paid money
        System.out.println("Total paid: "+customerpaidmoney+" bath");
        
        //change
        float change = customerpaidmoney - netPrice;
        System.out.println("Change: "+change+" bath");
        
        //print receipt
        System.out.println("----- Receipt -----");
        System.out.println(productName1 + ": " + productPrice1 + " bath");
        System.out.println(productName2 + ": " + productPrice2 + " bath");
        System.out.println(productName3 + ": " + productPrice3 + " bath");
        System.out.println("Total price before tax: "+total+" bath");
        System.out.println("Vat: "+vat+" bath");
        System.out.println("Total price after tax: "+netPrice+" bath");
        System.out.println("Total paid: "+customerpaidmoney+" bath");      
        System.out.printf("Change: %.2f baht", change);
        System.out.println();

        //ENDING!!
        System.out.println("-------------------");
        System.out.println("Thank you for shopping kubeiei.");
        scanner.close();
        

    }
}
