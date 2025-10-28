public class Extra_Zero {
    public static int reverse(int n) {
        boolean isNegative = n < 0;
        n = Math.abs(n);
        int reversed = 0;

        while (n != 0) {
            int digit = n % 10;
            reversed = reversed * 10 + digit;
            n /= 10;
        }

        return isNegative ? -reversed : reversed;
    }

    public static void main(String[] args) {
        System.out.println(reverse(123));     
        System.out.println(reverse(-4500));   
        System.out.println(reverse(1000));    
    }
}
