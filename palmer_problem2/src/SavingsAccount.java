
public class SavingsAccount {
	
	
	private static double annualInterestRate;
	private double savingsBalance;
	
	
	public SavingsAccount(double savingsBalance) {
		 this.setSavingsBalance(savingsBalance);
	}
	
	public void calculateMonthlyInterest() {
		//calculates the monthly Interest 
		savingsBalance += savingsBalance*(annualInterestRate/12);
		
	}
	
	public static void modifyInterestRate(double newInterestRate) {
		//changes the interest rate 
		annualInterestRate = newInterestRate;
	}
	

	public double getSavingsBalance() {
		return savingsBalance;
	}

	public void setSavingsBalance(double savingsBalance) {
		this.savingsBalance = savingsBalance;
	}
}














