package edu.pitt.lab10;

public class Recursion {
	
	public static int sumOfDigits(int x){
		if (x == 0) {
			return  0;
		}
		else {
			int lastDigit = x % 10;
			int restOfDigits = x / 10;
			return lastDigit + sumOfDigits(restOfDigits);
		}
	}

	public static void printArrayElements(int a[], int index) {
		if (index == -1) {
return	;		
		}
		else {
			System.out.println(a[index]);
			printArrayElements( a,  index-1);		
			}
	}
	
	public static void printCombos(int[] a, String out, int startIndex, int k) {
		
	}
	
	public static void main(String[] args) {
		int[] a = {10, 20, 30, 40};
		System.out.println("Sum of Digits: "+sumOfDigits(612345));
		System.out.print("Array: ");printArrayElements(a, a.length-1);
		
		
	}
}
