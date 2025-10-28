import java.util.Scanner;

public class StringLength {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of strings: ");
        int n = sc.nextInt();
        sc.nextLine(); 

        String[] arr = new String[n];

        
        for (int i = 0; i < n; i++) {
            System.out.print("Enter string " + (i + 1) + ": ");
            arr[i] = sc.nextLine();
        }

        int maxLength = 0;

        // Find the length of the longest string
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].length() > maxLength) {
                maxLength = arr[i].length();
            }
        }

        System.out.println("Length of the longest string: " + maxLength);
    }
}
