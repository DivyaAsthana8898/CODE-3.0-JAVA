
import java.util.Scanner;

public class practice3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the age:");
        int age = sc .nextInt();
        if( age >= 18 && age<60){
            System.out.println("eligible to cast vote");
        }
         else if( age >= 60){  // ELSE IF K BICH //SPACEING RHEGI
            System.out.println("Congratulations you are eligibile for senior citizen scheme");

         }
         else{
            System.out.println("Invalid Input");
         }
         }
    }
    

