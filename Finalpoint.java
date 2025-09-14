
import java.util.Scanner;

public class Finalpoint{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // input
        System.out.print("Enter your midterm score: ");
        int Mindtermscore = scanner.nextInt();
        System.out.print("Enter your final score: ");
        int FinalScore = scanner.nextInt();
        int Score = Mindtermscore+FinalScore;
       
        // score มากกว่าหรือเท่ากับ 50 เท่ากับผ่าน
        if(Score >= 50){
            System.out.println("Your Total Score is: "+Score+". The result is Pass!!");
        }
        
        // score น้อยกว่า 50 เท่ากับตก
        else if(Score < 50){
            System.out.println("Your Total Score is: "+Score+". The result is Fail!!");
        }

    }
}   