package bank;

class CurrentAccount extends Account{
	private double limit = 0.0;
	
	//protected gibt an, dass der Konstruktor nur von Klassen des gleichen Packages und Subklassen aufgerufen werden kann.
	protected CurrentAccount(int num, double limit){
		super(num);
		if (limit > 0){
			System.out.println("Only negative limit is acceptable. Limit is set to 0.");
			return;
		}
		this.limit = limit;
	}
	
	 public void abheben(double amount) {
        if (amount < 0) {
            System.out.println("No negative value allowed for withdraw.");
            return;
        }
        if (balance - amount >= limit) {
            balance -= amount;
            System.out.println("Withdrawal successful from CurrentAccount.");
        } else {
            System.out.println("Withdrawal denied. Exceeds limit.");
        }
    }
}
