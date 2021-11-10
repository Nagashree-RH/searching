package com.nag.linearsearch_app;

import java.util.Scanner;

import com.nag.linearsearch.LinearSearch;

public class LinearSearchApp {

	private static Scanner sc;
	public static void main(String[] args) {
		sc = new Scanner(System.in);
		
		int[] arrayToBeSearched = takeArrayInput();
		
		//Print the array input
		printArray(arrayToBeSearched);
		
		System.out.println("Enter the element to be searched");
		int element = sc.nextInt();
		
		LinearSearch linearSearchRef = new LinearSearch();
		int position = linearSearchRef.linearSearch(arrayToBeSearched, element);
		
		if(position >-1) {
			System.out.println(element+" is present in the position "+(position+1));
		}else {
			System.out.println(element+"is not found");
		}
		sc.close();
	}

	private static int[] takeArrayInput() {
		System.out.println("Enter the size of the array");
		int count = sc.nextInt();
		int[] enteredArray = new int[count];
		System.out.println("Enter "+count+" elements of the array");
		for(int i =0; i<enteredArray.length;i++) {
			enteredArray[i] = sc.nextInt();
		}
		return enteredArray;
	}

	private static void printArray(int[] arr) {
		System.out.println("The given array is ");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
}
