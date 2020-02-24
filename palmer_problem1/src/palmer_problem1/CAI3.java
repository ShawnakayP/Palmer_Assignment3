package palmer_problem1;

import java.security.SecureRandom;
import java.util.Scanner;

public class CAI3 {

	public static void main(String[] args) {
		
		 Quiz();
	
	}
	
	public static void askQuestion(int randNum1 , int randNum2) {
		// asks the user a multiplication problem 
		
		
		System.out.println("How much is " + randNum1+ " times "+randNum2+ "?");
		
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
		SecureRandom number = new SecureRandom();

        int numberGen = number.nextInt(4)+1;
        
        switch(numberGen) {
        
        case 1:
		  System.out.println("Very Good!");
		  break;
		
        case 2:
		  System.out.println("Excellent!");
		  break;
        case 3:
		  System.out.println("Nice Work!");
		  break;
        case 4:
		  System.out.println("Keep up the good work!");
		  break;
        }
}

	public static void displayIncorrectResponse() {
		// display the wrong answer message
		
		SecureRandom number = new SecureRandom();

        int numberGen = number.nextInt(4)+1;
        
        switch(numberGen) {
        
        case 1:
		  System.out.println("No. Please try again.");
		  break;
        case 2:
		  System.out.println("Wrong. Try once more.");
		  break;
        case 3:
		  System.out.println("Don't give up!");
		  break;
        case 4:
		  System.out.println("No. Keep trying ");
		  break;
        }
	}
	
	
	public static void displayCompletionMessage(int correct) {
		double calculatePercentage = ((double)correct/10.0)*100.0;
		System.out.println("Percentage is:" + calculatePercentage);	
		
		if (calculatePercentage >= 75) {
			System.out.println("Congratulations, you are ready to go to the next level!");
		}
	    else {
		
		    System.out.println("Please ask your teacher for extra help.");
		}
	}
	public static void Quiz() {
		SecureRandom randNum = new SecureRandom();
		
		Scanner sc = new Scanner(System.in);

		 
		 int correct =0;
		 
		 for(int i=1;i<= 10;i++){
			 int randNum1 = randNum.nextInt(10);
			 int randNum2 = randNum.nextInt(10);
			 int correctAnswer = randNum1 * randNum2; 
			 askQuestion(randNum1 , randNum2);
			 int userAnswer = readResponse();
			  
		 if(isAnswerCorrect(correctAnswer,userAnswer)) {
			 displayCorrectResponse();
			  correct++;
			 }
		 else 
			 displayIncorrectResponse();
			  
		 }
		  displayCompletionMessage(correct);
		 
		   System.out.println("Do you want to solve another new problem(y/n)?");
	       char choice=sc.next().charAt(0);
	       if(choice=='y')
	           Quiz();       
	       else
	           System.exit(0);   
	       sc.close();
	}
  
}
