public class Main {
    public static void main(String[] args) {



        BankAccount[] accounts = new BankAccount[2];
        accounts[0] = new SavingsAccount("John Doe", 5000);
        accounts[1] = new CheckingAccount("Jane Doe", 5000);

        for (BankAccount account : accounts) {
            account.CalculateInterest();
        }
    }
}