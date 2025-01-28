public class CurrentAccount extends BankAccount {
    public CurrentAccount(double initialBalance) {
        super(initialBalance);
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
}