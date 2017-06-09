package algo;

public class JumbledNumber{
    
    private static boolean isJumbledNumber(int number) {
        while(number % 10 != 0){
            int digit1 = number % 10;
            System.out.println(digit1);
            int digit2 = (number/10) % 10;
            System.out.println(digit2);
            if(Math.abs(digit2-digit1) > 1 && digit2 != 0)
                return false;
            number /= 10;
        }
        return true;
    }
 
    public static void main(String[] args) {
        int n1 = -1234;
        int n2 = 287;
        System.out.println("Is " + n1 + " jumbled number? : "
                + isJumbledNumber(n1));
        System.out.println("Is " + n2 + " jumbled number? : "
                + isJumbledNumber(n2));
    }
}
