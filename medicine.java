
import java.util.Scanner;

public class medicine{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Put your Age: ");
        int age = sc.nextInt();

        if(age > 10){
            System.out.println("Take 2 teaspoons naja.");
        }

        else if (age > 3){
            System.out.println("Take 1 teaspoons.");
        }
        else if (age >= 1){
            System.out.println("Take 1/2 teaspoons.");    
        }
        else {
            System.out.println("Do not take medicine");
        }
      
        
        
    }
}