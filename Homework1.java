import java.util.Scanner;
public class Homework1 {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter price of one dress : ");
        float price=scanner.nextFloat();
        System.out.print("Enter number of dress to buy : ");
        float piece=scanner.nextFloat();
        System.out.print("Enter discount rate : ");
        float dis=scanner.nextFloat();
        float total=price*piece;
        float disAmount=total*dis/100;
        float netPay=total-disAmount;
        System.out.println("--------------------------------");
        System.out.println("Total cost =  "+total+" baht");
        System.out.println("discountAmount =  "+disAmount+" baht");
        System.out.println("Net Pay =  "+netPay+" baht");
    }
}