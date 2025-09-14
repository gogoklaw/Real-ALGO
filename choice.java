import java.util.Scanner;

public class choice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your number: ");
        double number = scanner.nextInt();
        System.out.println();
        if(number == 1){
            System.out.println("<-----Area of the triangle----->");
            System.out.print("Enter the base of the triangle: ");
            double base = scanner.nextDouble();
            System.out.print("Enter the height of the triangle: ");
            double height = scanner.nextDouble();
            double sum = (1.0/2)*base*height;
            System.out.println("Area of the triangle: "+sum+" square units");
        } 
        
        else{
            System.out.println("<-----BMI----->");
            System.out.print("Enter your weight in kilograms: ");
            double weight = scanner.nextDouble();
            System.out.print("Enter your height in maters: ");
            double height = scanner.nextDouble();
            double sum = weight/(height*height);
            System.out.println("your BMI for weight "+weight+" kg"+" and height = "+height+"meters is: "+sum+"bmi");
        
        }
    }
}
