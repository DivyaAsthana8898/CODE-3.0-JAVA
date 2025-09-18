
import java.util.Scanner;

 class problem12 {
     static int factorial( int n) {
         if( n==0 || n==1){
            return 1;
        }
        else{
            return  n * factorial (n-1);
        }
    }
         public static void main (String [] args){
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the number for which  u want factorial");
            int N = sc.nextInt();
            System.out.println("THE FACTORIAL IS " + N +" IS " + factorial(N));

         }

        
    }
    

