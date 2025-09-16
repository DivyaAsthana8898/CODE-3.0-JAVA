class problem5 {
    static void swappingTheNumber(int m, int n){
        int temp = n;
        n = m;
        m = temp ;
        System.out.println("THE SWAPPED NUMBER IS " + m + "and the second number is" + n );
    }
    public static void main(String[] args) {
        
        int m = 7;
        int n = 9;
        swappingTheNumber(m, n);
    }

    }
