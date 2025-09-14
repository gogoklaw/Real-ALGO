
import java.util.Scanner;

public class ShoppingCPQ {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Enter About Product

        System.out.println("-----Product 1-----");
        System.out.print("Enter a productName#1: ");
        String productName1 = scanner.nextLine();
        System.out.print("Enter a productPrice#1: ");
        double productPrice1 = scanner.nextDouble();
        System.out.print("Enter a prodectQuantity#1: ");
        double productQuantity1 = scanner.nextDouble();
        scanner.nextLine();

        System.out.println("-----Product 2-----");
        System.out.print("Enter a productName#2: ");
        String productName2 = scanner.nextLine();
        System.out.print("Enter a productPrice#2: ");
        double productPrice2 = scanner.nextDouble();
        System.out.print("Enter a prodectQuantity#2: ");
        double productQuantity2 = scanner.nextDouble();
        scanner.nextLine();

        System.out.println("-----Product 3-----");
        System.out.print("Enter a productName#3: ");
        String productName3 = scanner.nextLine();
        System.out.print("Enter a productPrice#3: ");
        double productPrice3 = scanner.nextDouble();
        System.out.print("Enter a prodectQuantity#3: ");
        double productQuantity3 = scanner.nextDouble();
        scanner.nextLine();
        System.out.print("Enter a Amount paid: ");
        double Amountpaid = scanner.nextDouble();
        scanner.nextLine();

        //END Enter About Product

        //CAL productTotalprice

        double productTotalprice1 = productPrice1*productQuantity1;
        double productTotalprice2 = productPrice2*productQuantity2;
        double productTotalprice3 = productPrice3*productQuantity3;

        //CAL Subtotal

        double Subtotal =productPrice1+productPrice2+productPrice3;

        //VAT7%

        double VAT = Subtotal*(0.07);

        //netPrice

        double netPrice  = Subtotal+VAT;

        //Change

        double Change = Amountpaid-netPrice;

        //Print Receipt

        System.out.println();
        System.out.println("----- Receipt -----");
        System.out.println(productName1+": "+productPrice1+" x "+productQuantity1+" = "+productTotalprice1+" Bath");
        System.out.println(productName2+": "+productPrice2+" x "+productQuantity2+" = "+productTotalprice2+" Bath");
        System.out.println(productName3+": "+productPrice3+" x "+productQuantity3+" = "+productTotalprice3+" Bath");
        System.out.println("Subtotal: "+Subtotal+" Bath");
        System.out.printf("VAT 7%%: %.2f Bath\n", VAT);
        System.out.println("Total including VAT: "+netPrice+" Bath");
        System.out.println("Amount paid: "+Amountpaid+ " Bath");
        System.out.println("Change: "+Change+" Bath");
        System.out.println();
        System.out.println("-------------------");
        System.out.println("     THANK YOU     ");
        
        //END Print Receipt

        scanner.close();

    }
}
