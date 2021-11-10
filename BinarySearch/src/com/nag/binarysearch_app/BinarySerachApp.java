package com.nag.binarysearch_app;

import java.util.Arrays;
import java.util.Scanner;

import com.nag.binarysearch.BinarySearch;


public class BinarySerachApp {
	private static Scanner sc;
	public static void main(String[] args) {
		sc = new Scanner(System.in);
		int[] arrayToBeSearched = takeArrayInput();
		//TODO: print the array
		System.out.println("Enter the element to be searched");
		int element = sc.nextInt();
		BinarySearch binarySerachRef = new BinarySearch();
		
		//Uncomment the below to go for iterative approach
//		int position = binarySerachRef.binarySearch(arrayToBeSearched, element);
		//Uncomment the below line for recurssive approach
		int position = binarySerachRef.recurssiveBinarySearch(arrayToBeSearched,0,arrayToBeSearched.length-1, element);
		if(position >-1) {
			System.out.println(element+" is present in the position "+(position+1));
			
		}else {
			System.out.println(element+" is not found");
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
		Arrays.sort(enteredArray);
		return enteredArray;
	}
}
