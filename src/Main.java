public class Main {
    public static void main(String[] args) {
        // Création d'un compte courant
        WithdrawableAccount currentAccount = new CurrentAccount(1000);
        currentAccount.deposit(500);
        currentAccount.withdraw(300);
        System.out.println("Solde final du compte courant : " + currentAccount.getBalance());

        // Création d'un compte épargne
        BankAccount savingsAccount = new SavingsAccount(2000);
        savingsAccount.deposit(1000);
        System.out.println("Solde final du compte épargne : " + savingsAccount.getBalance());

        // Vérification du polymorphisme
        System.out.println("Polymorphisme respecté avec LSP !");
    }
}