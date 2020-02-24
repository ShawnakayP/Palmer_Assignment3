package palmer_problem1;

import java.security.SecureRandom;
import java.util.Scanner;


public class CAI1 {
	
	public static void askQuestion(int randNum1 , int randNum2) {
		// asks the user a multiplication problem 
		
		
		System.out.println("How much is " + randNum1+ "times "+randNum2+ "?");
		
	}
	
	public static int readResponse() {
		// reads the user's response to the question 
		Scanner in = new Scanner(System.in);
		
		int userAnswer = in.nextInt();
		
		in.close();
		
		return userAnswer;
	}
	public static boolean isAnswerCorrect(int correctAnswer , int userAnswer) {
		//checks the user's answer 
	
	
	return correctAnswer == userAnswer;
		
	}
	
	
	public static void displayCorrectResponse() {
		//display the correct answer message 
		
		System.out.println("Very Good!");
			
	}
	
	public static void displayIncorrectResponse() {
		// display the wrong answer message
		
	    System.out.println(" No. Please try again");
	}
	
	public static void Quiz() {
		SecureRandom randNum = new SecureRandom();
		
		 
		 while(true) {
			 int randNum1 = randNum.nextInt(10);
			 int randNum2 = randNum.nextInt(10);
			 
			 int correctAnswer = randNum1 * randNum2; 
			 askQuestion(randNum1 , randNum2);
			int  userAnswer = readResponse();
			  
		 if(isAnswerCorrect(correctAnswer,userAnswer)) {
			 displayCorrectResponse(); 
			 break;
		 }
		 else {
			 displayIncorrectResponse();
			 
			  }
		 }
	}
  public static void main(String[] args) {
		
		 Quiz();
	}
	
	
	
}



