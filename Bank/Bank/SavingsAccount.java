package bank;

//Ab hier soll die Klasse SavingsAccount implementiert werden.
class SavingsAccount extends Account{
	private double interestRate = 0.0;
	
	protected SavingsAccount(int num, double rate){
		super(num);
		if (rate < 0){
			System.out.println("No negative interest rate allowed. Setting rate to 0%.");
			return;
		}
		interestRate = rate;
	}

	//old + old*interest/100
	protected void interest(){
		balance *= (1+interestRate/100.0);
	}
	
	public void withdraw(double amount) {
        if (amount < 0) {
            System.out.println("No negative value allowed for withdraw.");
            return;
        }
        if (balance - amount >= 100.00) {
            balance -= amount;
            System.out.println("Withdrawal successful from SavingsAccount.");
        } else {
            System.out.println("Withdrawal denied. Must maintain minimum balance of 100.00.");
        }
    }
}
