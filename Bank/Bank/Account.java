package bank;

class Account{
	protected double balance;
	protected int accnum;
	
	protected Account(){
		accnum = 0;
		balance = 0.0;
	}
	
	protected Account(int num){
		accnum = num;
		balance = 0.0;
	}
	
	protected double getBalance(){
		return balance;
	}
	
	protected int getAccnum(){
		return accnum;
	}
	
	protected void deposit(double val){
		if (val < 0){
			System.out.println("No negative value allowed for deposit");
			return;
		}
		balance += val;
	}
	
	protected void withdraw(double val){
		if (val < 0){
			System.out.println("No negative value allowed for withdraw");
			return;
		}
		if (val - balance > -10e-15){
			System.out.println("Insufficient balance. Cannot withdraw");
			return;
		}
		balance -= val;
	}
}
