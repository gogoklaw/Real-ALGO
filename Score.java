
import java.util.Scanner;

public class Score{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Student Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Score (0-100): ");
        int score = sc.nextInt();

        System.out.println("--- Result ---");
        System.out.println("Name :"+name);
        System.out.println("Score: "+score);
        
        if (score >= 80 && score == 100) {
            System.out.println("Grade : A");
        }
        else if (score >= 70 && score == 79) {
            System.out.println("Grade : B");
        }
        else if (score >= 60 && score == 69) {
            System.out.println("Grade : C");
        }
        else if (score >= 50 && score == 59) {
            System.out.println("Grade : D");
        }
        else if (score < 49 && score == 0) {
            System.out.println("Grade : E");
        }
        else {
            System.out.println("กรอกคะแนนดีๆ");
        }
    }
}