
import java.util.Scanner;

public class PRACTICE10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number for which u want to check the leap year:");
        int year = sc.nextInt();
        if (year %400==0 || (year %4==0 && year %100 != 0)){
            System.out.println("The Enterd year is a leap year " + year );
        }
        else{
            System.out.println("The enterd year is not  a leap year "+ year);
        }
    }
    
}
