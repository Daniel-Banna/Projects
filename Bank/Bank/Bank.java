package bank;

public class Bank{
	final private Account[] accounts = new Account[30];
	
	//optional
	private int idCounter;
	private int accCounter;
	
	public Bank(){
		idCounter = 0;
	}
	
	//Eröffnet ein Account und gibt die Accountnummer zurück, falls erfolgreich.
	public int open(boolean saving){
		if (accCounter == 30){
			System.out.println("Bank already holds 30 accounts. Cannot create new Account.");
			return -1;
		}
		int freePos = 0;
		for (Account acc : accounts){
			if (acc == null){
				break;
			}
			++freePos;
		} 
		idCounter += 1;
		accCounter += 1;
		if (saving){
			//Erstelle ein Sparkonto. Wir gehen davon aus, dass immer 3% Zinsen gegeben werden.
			accounts[freePos] = new SavingsAccount(idCounter, 3.0);
		}else{
			//Annahme: Konto darf maximal 1000 Eur. im Minus sein.
			accounts[freePos] = new CurrentAccount(idCounter, -1000.0);
		}
			
		return idCounter;
	}
	
	//Schließt einen Account unter der angegebenen Nummer, falls vorhanden.
	public boolean close(int accnum){
		for (int i = 0; i < accounts.length; ++i){
			if (accounts[i] != null && accounts[i].getAccnum() == accnum){
				System.out.println("Closing Account " + accounts[i].getAccnum() +"...");
				System.out.println("Remaining balance is " + round(accounts[i].getBalance()) + " Euro.");
				accounts[i] = null;
				accCounter -= 1;
				return true;
			}
		}
		System.out.println("Could not close Account...");
		System.out.println("No Account with account number " + accnum + " found.");
		return false;
	}
	
	public void update(){
		for (Account acc : accounts) {
			if (acc != null) {
				if (acc instanceof SavingsAccount) {
					// apply interest
					((SavingsAccount) acc).interest();
				} else if (acc instanceof CurrentAccount) {
					
				}
			}
		}
	}
	
	
	//Versucht unter der angegebenen Accountnummer den gewünschten Betrag einzuzahlen.
	public void deposit(double val, int accnum){
		Account acc = getAccount(accnum);
		if (acc != null){
			acc.deposit(val);
			return;
		}
		System.out.println("No Account with account number " + accnum + " found.");
	}
	
	//Versucht unter der angegebenen Accountnummer den gewünschten Betrag abzuheben.
	public void withdraw(double val, int accnum){
		Account acc = getAccount(accnum);
		if (acc != null){
			acc.withdraw(val);
			return;
		}
		System.out.println("No Account with account number " + accnum + " found.");
	}
	
	//Hilfsmethode, um einen Account zu einer Nummer zu finden. Existiert es nicht, wird null zurückgegeben.
	private Account getAccount(int accnum){
		for (Account acc : accounts){
			if (acc != null && acc.getAccnum() == accnum){
				return acc;
			}
		}
		return null;
	}
	
	
	public String toString(){
		String str = "";
		for (Account acc : accounts){
			if (acc != null){ 
				str += "Account with ID " + acc.getAccnum() + " currently holds " + round(acc.getBalance()) + " Euro.\n";
			}
		}
		return str;
	}
	
	//Optional: Rundet auf zwei Nachkommastellen
	private double round(double val){
		return ((long) (val * 100))/100.0;
	}
}
