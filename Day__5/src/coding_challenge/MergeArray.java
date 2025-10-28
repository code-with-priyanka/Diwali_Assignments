// You are given two sorted arrays nums1 and nums2. Your task is to merge them
// into a single array sorted in non-decreasing order


package coding_challenge;

import java.util.Arrays;
import java.util.Scanner;


public class MergeArray {

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        // Input for first array
	        System.out.print("Enter size of first array: ");
	        int n1 = sc.nextInt();
	        int[] nums1 = new int[n1];
	        System.out.println("Enter elements of first sorted array:");
	        for (int i = 0; i < n1; i++) {
	            nums1[i] = sc.nextInt();
	        }

	        // Input for second array
	        System.out.print("Enter size of second array: ");
	        int n2 = sc.nextInt();
	        int[] nums2 = new int[n2];
	        System.out.println("Enter elements of second sorted array:");
	        for (int i = 0; i < n2; i++) {
	            nums2[i] = sc.nextInt();
	        }

	        // Merge both sorted arrays
	        int[] merged = mergeArray(nums1, nums2);

	        // Display result
	        System.out.println("Merged sorted array: " + Arrays.toString(merged));

	        sc.close();
	    }

	    // Function to merge two sorted arrays
	    public static int[] mergeArray(int[] nums1, int[] nums2) {
	        int n1 = nums1.length;
	        int n2 = nums2.length;
	        int[] merged = new int[n1 + n2];

	        int i = 0, j = 0, k = 0;

	        // Merge while both arrays have elements
	        while (i < n1 && j < n2) {
	            if (nums1[i] <= nums2[j]) {
	                merged[k] = nums1[i];
	                k++;
	                i++;
	            } else {
	                merged[k] = nums2[j];
	                j++;
	                k++;
	            }
	        }

	        // Copy remaining elements 
	        while (i < n1) {
	            merged[k] = nums1[i];
	            k++;
	            i++;
	        }

	        while (j < n2) {
	            merged[k] = nums2[j];
	            k++;
	            j++;
	        }

	        return merged;
	    }
	}


