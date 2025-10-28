// Check if a string contains only alphanumeric characters

package coding_challenge;
import java.util.Scanner;

public class AlphaNumericString {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter a string: ");
	        String str = sc.nextLine();

	        boolean isAlphanumeric = true;

	        for (char ch : str.toCharArray()) {
	            if (!Character.isLetterOrDigit(ch)) {
	                isAlphanumeric = false;
	                break;
	            }
	        }

	        if (isAlphanumeric) {
	            System.out.println("String contains only alphanumeric characters.");
	        } else {
	            System.out.println("String contains non-alphanumeric characters.");
	        }

	        sc.close();
	    }
}
