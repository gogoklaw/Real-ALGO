
import java.util.Scanner;

public class temperatureStatus{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter temperature in Celsius: ");
        float Celsius = sc.nextFloat();

        System.out.println("temperature: "+Celsius+"°C");
        
        if (Celsius < 20) {
            System.out.println("Status: Cold");
        }
        else if (Celsius >= 20 && Celsius == 35) {
            System.out.println("Status: Normal");
        }
        else if (Celsius > 35) {
            System.out.println("Status: Hot");
        }
    }   
}