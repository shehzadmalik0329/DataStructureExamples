package com.java.datastructure.sortalgorithm.game;

import java.util.LinkedList;
import java.util.List;

public class DartGame {
	
//	Dart Scoring
//	Write a scoring function for the darts game 301.
//
//	Game Rules
//	The player's score starts at 301.
//	Darts are thrown in rounds of three.
//	Each round's score is removed from the player's total until it is exactly zero.
//
//	 Players must "double-in" and "double-out":
//	any darts thrown before a double is scored are ignored,
//	and only a double can bring the total to zero.
//
//	 If the total arrives at 1, a negative number, or zero but not via a double, the player is bust and
//	the total from the previous round is maintained.
//	(Any superfluous throws in a bust round will be recorded as zeroes.)
//
//	Instructions
//	You are provided an array of dart throws.
//	Write a function to return the current score as a number from 
//
//	301(a scoreless game) 
//	to 0 (a winning condition)
//	or any number in between (a game in progress).
//
//	You may assume that the input is well-formed and valid.
//
//	 Dart throws are represented as the following strings:
//
//	 Singles: "1"-"20" (worth 1-20), "SB" (worth 25)
//	Doubles: "D1"-"D20" (worth 2-40), "DB" (worth 50)
//	Triples: "T1"-"T20" (worth 3-60)
//
//
//	Input:
//	["D10", "T2", "18", "17", "D19", "5", "SB"]

	public static void main(String[] args) {
//		String[] input = {"D10", "T2", "18", "17", "D19", "5", "SB"};
//		String[] input = 20+6+18+17+38+5+25
		
//		String[] input = {"DB", "DB", "DB", "DB" ,"DB", "1", "DB"};	//winning
		
//		String[] input = {"DB", "DB", "DB", "DB" ,"DB", "1", "20", "5", "SB"};	//score gets zero but last throw is not double
		
//		String[] input = {"12", "T3", "SB", "T6" ,"DB", "1", "T7", "5", "SB"};
		
		String[] input = {"D10", "T2", "18", "17", "D19", "5"}; //20+3
		
//		String[] input = {"D20", "T20", "T20", "T20", "T10", "1", "T17", "0" , "0"};
		
//		String[] input = {"D20", "T20", "T20", "T20", "T10", "1", "T17", "0" , "0", "11", "0", "0"};
		
//		String[] input = {"D20", "T20", "T20", "T20", "T10", "1", "20", "15", "0", "T5"};
		
//		String[] input = {"D20", "T20", "T20", "T20", "T10", "1", "20", "15", "0" , "T5", "15"};
		
//		String[] input = {"D20", "T20", "T20", "T20", "T10", "1", "20", "5", "0", "SB"};
		
//		String[] input = {"D20", "T20", "T20", "T20", "T10", "1", "T10", "D10"};
		
//		String[] input = {"17", "T2", "17", "18", "17", "D19", "5"};
		
//		String[] input = {"D20", "T20", "T20", "T20", "T10", "1", "DB"};
		
		List<String> validInput = new LinkedList<>();
		int startIndex = 0;
		//if input does not start with Double
		for(int i=0; i<input.length; i++){
			if(input[i].startsWith("D")){
				startIndex = i;
				break;
			}
		}
		//filter out valid thorws
		for(int i=startIndex; i<input.length; i++){
			validInput.add(input[i]);
		}
		
		calculateScore(validInput);
		
	}
	
	static void calculateScore(List<String> validInput){
		int startScore = 301;
//		int previousRoundScore = 0;
		int previousRoundScore = startScore;
		int throwCount = 0;
//		for(String input: validInput){
//			int score = getScore(input);
//			startScore -= score;
//		}
		int inputSize = validInput.size();
		for(int i=0; i<validInput.size(); i++){
			previousRoundScore = startScore;
			throwCount++;
			int score = getScore(validInput.get(i));
			startScore -= score;
			//round completed
			if(i+1%3 == 0){
				throwCount = 0;
			}
		}
		
		//winning condition score=0 & last throw is double
		if(startScore == 0 && validInput.get(inputSize-1).startsWith("D")){
			System.out.println("a winning condition"+startScore);
		} else {
			if(previousRoundScore == 301){
				System.out.println("a scoreless game"+previousRoundScore);
			}
			if(previousRoundScore != 301 && previousRoundScore != 0){
				System.out.println("a game in progress"+previousRoundScore);
			}
		}
		
	}
	
	static int getScore(String input){
		
		if(input.equals("SB")){
			return 25;
		} else if(input.equals("DB")){
			return 50;
		} else if(input.startsWith("D")){
			return Integer.parseInt(input.substring(1)) * 2;
		} else if(input.startsWith("T")) {
			return Integer.parseInt(input.substring(1)) * 3;
		} else {
			return Integer.parseInt(input);
		}
	}

}
