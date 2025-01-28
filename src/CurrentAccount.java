class CurrentAccount implements WithdrawableAccount {
    private double balance;

    public CurrentAccount(double initialBalance) {
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
    public void withdraw(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Le montant du retrait doit être positif.");
        }
        if (amount > balance) {
            throw new IllegalArgumentException("Fonds insuffisants pour ce retrait.");
        }
        balance -= amount;
        System.out.println("Retrait de " + amount + " effectué. Nouveau solde : " + balance);
    }

    @Override
    public double getBalance() {
        return balance;
    }
}