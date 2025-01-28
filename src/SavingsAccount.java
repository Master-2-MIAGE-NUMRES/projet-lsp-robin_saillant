public class SavingsAccount extends BankAccount {
    public SavingsAccount(double initialBalance) {
        super(initialBalance);
    }
    @Override
    public void withdraw(double amount) {
        throw new UnsupportedOperationException("Les retraits ne sont pas autorisés sur un compte d'épargne.");
    }
}