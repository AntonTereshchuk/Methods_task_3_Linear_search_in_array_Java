package task;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int[] array = new int[] {-5, 1, 3, 6, 7, 8, 10, 11, 13, 14};
		int searchNumber;
		
		System.out.println("Please enter an integer number for search: ");
		searchNumber = sc.nextInt();
		
		System.out.println();
		System.out.println(Arrays.toString(array));
		System.out.println("Search result: " + linearSearchInArray(array, searchNumber));
		
		sc.close();
		
	}
	
	public static int linearSearchInArray(int[] arr, int searchNumber) {
		
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == searchNumber) {
				return i;
			}
		}
		
		return -1;
	}

}
