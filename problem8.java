 import java .util.Scanner;
    class problem8{
    static boolean Isprime( int n){
        if(n<=1)
            return false;
         for( int i = 2;i<=Math.sqrt(n);i++){
            if(n %i==0){
                return false;
            }
        }
            return true;

        }
         public static void main(String []args){
            Scanner sc = new Scanner (System.in);
            System.out.println("Enter the prime no to be checked");
            int N = sc.nextInt();
            System.out.println("THE PRIME UPTO N PROVIDED ARE  "+ N + "ARE");
            for(int i = 2;i<=N;i++){
                if(Isprime(i)){
                    System.out.println(i+" ");
                }
            }

         
        }
    }

    