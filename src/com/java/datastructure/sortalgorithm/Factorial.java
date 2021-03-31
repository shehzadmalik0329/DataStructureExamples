package com.java.datastructure.sortalgorithm;

public class Factorial {

	public static void main(String[] args) {
		int fact = factorial(4);
		System.out.println(fact);
		
		int recursiveFact = recursiveFactorial(4);
		System.out.println(recursiveFact);
		
		int result = multiply(50);
		System.out.println(result);
	}
	
	private static int factorial(int number){
		if(number == 0)
			return 1;
		int fact = 1;
		for(int i = number; i > 0; i--){
			fact *= i;
		}
		return fact;
	}
	//1! = 1 * (1-1)! = 1 * 0!
	//2! = 2 * (2-1)! = 2 * 1!
	//3! = 3 * (3-1)! = 3 * 2!
	private static int recursiveFactorial(int number){
		if(number == 0)
			return 1;
		return number * recursiveFactorial(number - 1);
	}

	private static int multiply(int number){
		int result = 0;
		for(int i = 1; i <= number; i++){
			result += (i*i);
		}
		return result;
	}
}
