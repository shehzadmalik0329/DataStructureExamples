package com.java.datastructure.sortalgorithm;

public class BubbleSort {
	
	public static void main(String[] args){
		int[] intArray = {23, 7, 35, -22, 51, 1, -15};
		
		for(int lastUnsortedIndex = intArray.length-1; lastUnsortedIndex > 0; lastUnsortedIndex--){
			for(int j = 0; j < lastUnsortedIndex; j++){
				if(intArray[j] > intArray[j+1])
					swap(intArray, j, j+1);
			}
		}
		
		for(int i=0; i<intArray.length; i++)
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
