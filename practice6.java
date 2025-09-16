 class practice6 {
    static void BinarySum( String  x ,String y){
        int num1 = Integer.parseInt(x,2);//The Integer.parse(Method ) coverts string to int primitive data type
        int num2 = Integer.parseInt(y,2);
        int sum = num1 + num2;
        String result = Integer.toBinaryString(sum);//convert int back to binary string
        System.out.println("The value is :" + result);
    }
     public static void main(String[] args) {
         
        String x ="011011";
        String y = "1010111";
        BinarySum(x, y);
     }

    }
    

