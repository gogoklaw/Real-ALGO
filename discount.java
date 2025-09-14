
import java.util.Scanner;

public class discount {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the price of the product (per unit): ");
        double priceperunit = sc.nextDouble();  
        System.out.print("Enter the quantity of the product: ");
        double quantityofproduct = sc.nextDouble();
        double totalprice = priceperunit * quantityofproduct;

        if (quantityofproduct > 10) {
            
            double discountprice = totalprice * 0.1;
            double netPay = totalprice - discountprice;
            System.out.println("You get a 10% discount!");
            System.out.println("Total price: " + netPay + " bath");

        } else {

            System.out.print("Total price: " + totalprice + " bath");

        }

    }
}
