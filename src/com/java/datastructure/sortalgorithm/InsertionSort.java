package com.java.datastructure.sortalgorithm;

public class InsertionSort {

	public static void main(String[] args) {
//		int[] intArray = {20, 35, -15, 7, 55, 1, -22};
		int[] intArray = {-22, 35, -15, 7, 55, 1, 20};
		
		for(int firstUnsortedIndex = 1; firstUnsortedIndex < intArray.length; firstUnsortedIndex++){
			for(int i = firstUnsortedIndex; i > 0; i--){
				if(intArray[i-1] > intArray[i])
					swap(intArray, i-1, i);
			}
		}
		System.out.println("Insertion Sort");
		for(int i = 0; i < intArray.length; i++)
			System.out.println(intArray[i]);
	}
	
	public static void swap(int[] array, int i, int j){
		if(i == j)
			return;
		
		int temp = array[i];
		array[i] = array[j];
		array[j] = temp;
	}

}
