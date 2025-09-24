
import java.util.Scanner;

public class Memberleve{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter membership leve (Silver, Gold, Platinum): ");
        String member = sc.nextLine();

        System.out.print("Enter total purchase amoust: ");
        double price = sc.nextDouble();
        double percent = 0;

        if (member.equals("Sliver") ) {
            percent = 0.05;
        }
        else if (member.equals("Gold")) {
            percent = 0.1;
        }
        else if (member.equals("Platinum")) {
            percent = 0.15;
        }

        double discount = price * percent;
        double netPay = price - discount;

        System.out.println("-----Receipt-----");
        System.out.println("Member ship: "+member);
        System.out.println("Total purchase: "+price);
        System.out.println("Discount: "+discount);
        System.out.println("Final price :"+netPay);
    }
}