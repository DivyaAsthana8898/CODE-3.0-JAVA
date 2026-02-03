
import java.util.Scanner;

public class ConversionOfKilometersToMiles {
    public static void main(String[] args) {
        System.out.println("Enter the value in kilometers");
        Scanner sc = new Scanner(System.in);// input field
        double value = sc.nextInt();// input field
        double conversion = value/ 1.609;// calculation field
        System.out.println("The value in Miles is"+conversion);


    }


    
}
  