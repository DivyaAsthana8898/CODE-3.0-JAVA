import java.util.Scanner;

public class problem11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER THE CHARACTER U WANT TO CHECK");
        char ch = sc.next().charAt(0);
        if( ch == 'A' || ch == 'E'|| ch == 'I'|| ch == 'O'|| ch == 'U'|| ch == 'a'|| ch == 'e'|| ch == 'i'|| ch == 'o'|| ch == 'u'){
            System.out.println("THE ENTERD CHARACTER IS A VOWEL " + ch);
        }
        else{
            System.out.println("THE ENTERD CHARACTER IS A CONSONANT " + ch);
        }

    }
    
}
