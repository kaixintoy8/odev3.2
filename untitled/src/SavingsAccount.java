import java.util.Scanner;

public class SavingsAccount extends BankAccount {
    public SavingsAccount(String accountNumber, double balance) {
        super(accountNumber, balance);
    }
    @Override
    public void CalculateInterest() {
        double interest = getBalance() * 0.05;
        Scanner sc = new Scanner("Tasarruf hesabı faizi: "+ interest);
    }
}
