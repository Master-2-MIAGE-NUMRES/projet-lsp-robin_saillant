class SavingsAccount implements BankAccount {
    private double balance;

    public SavingsAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    @Override
    public void deposit(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Le montant du dépôt doit être positif.");
        }
        balance += amount;
        System.out.println("Dépôt de " + amount + " effectué. Nouveau solde : " + balance);
    }

    @Override
    public double getBalance() {
        return balance;
    }
}