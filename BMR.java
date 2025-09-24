
import java.util.Scanner;

public class BMR {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your sex (m/f): ");
        char sex = sc.next().charAt(0);

        if (sex == 'm') {
            System.out.println("-----Heyy Boyy-----");
            System.out.print("Enter your weight: ");
            float weight = sc.nextFloat();
            System.out.print("Enter your height: ");
            float height = sc.nextFloat();
            System.out.print("Enter your age: ");
            float age = sc.nextFloat();
            float BMR = 66+(13.7f*weight)+(5f*height)-(6.8f*age);
            System.out.println("Your Weight is "+weight+"kg and "+"Height is "+height+"cm Age is "+(int)age+"year old "+"BMR is "+(int)BMR+"kcal/day");

        } 
        
        else if (sex == 'f') {
            System.out.println("-----Heyy Girll-----");
            System.out.print("Enter your weight: ");
            float weight = sc.nextFloat();
            System.out.print("Enter your height: ");
            float height = sc.nextFloat();
            System.out.print("Enter your age: ");
            float age = sc.nextFloat();
            float BMR = 665+(9.6f*weight)+(1.8f*height)-(4.7f*age);
            System.out.println("Your Weight is "+weight+"kg and "+"Height is "+height+"cm Age is "+(int)age+"year old "+"BMR is "+(int)BMR+"kcal/day");

        } 
        
        else {
            System.out.println("!!!Enter Your Sex Pls!!!");
        }
                
    }
}
