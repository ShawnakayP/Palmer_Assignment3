
public class SavingsAccountTest {

	public static void main(String[] args) {
		
		SavingsAccount saver1 = new SavingsAccount(2000.00);
		SavingsAccount saver2 = new SavingsAccount(3000.00);
		
		SavingsAccount.modifyInterestRate(.04);
		
		System.out.println("Month\t Saver 1 \tSaver 2 \n");
		for(int i = 1; i <= 13; i++) {
			
			saver1.calculateMonthlyInterest();
			saver2.calculateMonthlyInterest();
			
			System.out.format("%d\t %.2f \t%.2f\n", i ,saver1.getSavingsBalance(),saver2.getSavingsBalance() );

            if(i == 12){
            	System.out.println();
            	System.out.println("Interst rate increased to 5%");
            	System.out.println("Next Month's Balance\n");

                SavingsAccount.modifyInterestRate(0.05);
            }
		
		
		}
	}
}
