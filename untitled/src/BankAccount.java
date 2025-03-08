public abstract class BankAccount {

    private String accountHolder;
    private double balance;

    public BankAccount(String accountHolder, double balance) {
        this.accountHolder = accountHolder;
        this.balance = balance;
    }
    public String getAccountHolder() {
        return accountHolder;
    }
    public double getBalance() {
        return balance;
    }
    public abstract void CalculateInterest();
}
