public abstract class BankAccount {
    protected double balance;
    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }
    public double getBalance() {
        return balance;
    }
    public void deposit(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Le montant du dépôt doit être positif.");
        }
        balance += amount;
        System.out.println("Dépôt de " + amount + " effectué. Nouveau solde : " + balance);
    }
    public abstract void withdraw(double amount);
}