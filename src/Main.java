public class Main {
    public static void main(String[] args) {
        BankAccount currentAccount = new CurrentAccount(1000);
        currentAccount.deposit(500);
        currentAccount.withdraw(300);
        System.out.println("Solde final du compte courant : " + currentAccount.getBalance());
        BankAccount savingsAccount = new SavingsAccount(2000);
        savingsAccount.deposit(1000);
        try {
            savingsAccount.withdraw(500);
        } catch (UnsupportedOperationException e) {
            System.out.println("Erreur : " + e.getMessage());
        }
        System.out.println("Solde final du compte d'épargne : " + savingsAccount.getBalance());
    }
}