package palmer_problem1;
import java.security.SecureRandom;
import java.util.Scanner;

public class CAI5{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String choice;
		
		do {
			
		 Quiz(sc);
		 System.out.println("Do you want to solve another new problem?");
		 choice = sc.next();
		}
		 while(choice == "yes");
			 
			   
	       sc.close();
	}
	
	
	public static void askQuestion(int randNum1 , int randNum2,  int type) {
		switch(type)
		{
		case 1:
		System.out.println("How much is " + randNum1 + " + " + randNum2 + "?");
		break;
		case 2:
		System.out.println("How much is " + randNum1 + " * " + randNum2 + "?");
		break;
		case 3:
		System.out.println(" How much is " + randNum1 + " - " + randNum2 + "?");
		break;
		case 4:
		System.out.println(" How much is " + randNum1 + "  / " + randNum2 + "?");
		break;
		}
	}
	
	public static int readProblemType(SecureRandom randNum, Scanner sc) {
		System.out.print("Choose: 1.Addition, 2.Multiplication, 3.Subtraction, 4. Division, 5.Mixed: ");
		int type = sc.nextInt();

		if(type == 5)
			type = randNum.nextInt(4) + 1;
		  
		return type;
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
	public static int correctAnswer(int type, int randNum1, int randNum2){

		switch(type)
		{
		case 1:
		return randNum1 + randNum2;
		case 2:
		return randNum1 * randNum2;
		case 3:
		return randNum1 -randNum2;
		case 4:
		return randNum1/randNum2;
		}
		return 0;
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
	public static void Quiz(Scanner sc) {
		SecureRandom randNum = new SecureRandom();

		int correct = 0;
		int level = readDifficulty(sc);
		System.out.println();

		for (int i = 1; i <= 10; i++) {

		int randNum1 = generateQuestionArgument(randNum, level);
		int randNum2 = generateQuestionArgument(randNum, level);
		int problemType = readProblemType(randNum,sc);
		int correctAnswer = correctAnswer(problemType,randNum1,randNum2);

		askQuestion(randNum1, randNum2,problemType);

		int userAnswer = readResponse();

		if (isAnswerCorrect(correctAnswer, userAnswer)) {
		displayCorrectResponse();
		correct++;
		} else
		displayIncorrectResponse();
		}
		displayCompletionMessage(correct);
		}
	
	  public static int readDifficulty(Scanner sc) {
            
	       System.out.print("Choose your level of difficulty 1-4: ");

	       return sc.nextInt();

	   }
	  public static int generateQuestionArgument(SecureRandom randNum, int difficulty) {
	       int level = 0;
	      
	       if (difficulty == 1)
	           level = randNum.nextInt(10);
	       else if (difficulty == 2)
            level = randNum.nextInt(100);
	       else if (difficulty == 3)
	           level = randNum.nextInt(1000);
	       else
	           level = randNum.nextInt(10000);
	      
	       return level;
	   }
	  
  
}
