// You are given an integer array nums and an integer k. Rotate the array to the
// right by k steps, where k is non-negative.


package coding_challenge;
import java.util.Scanner;

public class RotateArray {
	

	
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        System.out.print("Enter size of array: ");
	        int n = sc.nextInt();
	        int[] nums = new int[n];

	        System.out.println("Enter array elements: ");
	        for (int i = 0; i < n; i++) {
	            nums[i] = sc.nextInt();
	        }

	        System.out.print("Enter value of k: ");
	        int k = sc.nextInt();

	        // Rotate array by k steps
	        for (int i = 0; i < k; i++) {
	            rotateOnce(nums);
	        }

	        System.out.println("Array after rotation:");
	        for (int i = 0; i < n; i++) {
	            System.out.print(nums[i] + " ");
	        }
	    }

	    // Function to rotate array by one step to the right
	    public static void rotateOnce(int[] arr) {
	        int last = arr[arr.length - 1]; // store last element
	        for (int i = arr.length - 1; i > 0; i--) {
	            arr[i] = arr[i - 1]; // shift elements right
	        }
	        arr[0] = last; // move last element to first position
	    }
	}



