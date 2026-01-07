import bank.Bank;

public class Main {
    public static void main(String[] args) {
        Bank bank = new Bank();

        
        int savingsAcc1 = bank.open(true);
        int currentAcc1 = bank.open(false);

        
        bank.deposit(700, savingsAcc1);
        bank.deposit(200, currentAcc1);

        
        bank.withdraw(100, savingsAcc1);
        bank.withdraw(650, savingsAcc1);

        bank.withdraw(350, currentAcc1);
        bank.withdraw(2000, currentAcc1);

        
        System.out.println("\nBefore update:");
        System.out.println(bank);
        bank.update();
        System.out.println("\nAfter update:");
        System.out.println(bank);

        
        bank.close(savingsAcc1);
    }
}
