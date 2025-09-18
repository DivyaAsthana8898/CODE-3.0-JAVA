public class problem14 {
    static int perimeter( int n,int g){
        int result = 2*(n+g);
        return result;
    }
    public static void main(String[] args) {
        int l = 5;
        int b =8;
        System.out.println("The value of perimeter is for length" + l + "for breadth "+ b + " IS :" +  perimeter(l,b));
    }
    
}
