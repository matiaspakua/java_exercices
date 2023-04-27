package dataStructures;

import java.util.Arrays;

public class MaxIntInArray {

	public static void main(String[] args) {
		int[] array = { 10, 5, 15, 20, 8 };

		MaxIntInArray.findMax(array);

		MaxIntInArray.usingStream(array);

	}

	public static int findMax(int[] arr) {
		int max = arr[0]; // Initialize the maximum value to the first element of the array
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i]; // Update the maximum value if a larger value is found
			}
		}
		return max; // Return the maximum value
	}

	public static int usingStream(int[] arr) {

		int max = Arrays.stream(arr).max().getAsInt();
		System.out.println("Max value: " + max);
		return max;
	}
}
