package lab1.problem2;

public class Bank {
	public static void main(String[] args) {
		BankAccount a1 = new BankAccount(1001, AccountType.SAVINGS);
        BankAccount a2 = new BankAccount(1002, AccountType.CHECKING, 500);

        a1.deposit(200);
        a2.deposit(300, 10);

        System.out.println(BankAccount.BANK_NAME);
        System.out.println("Account 1 balance: " + a1.getBalance());
        System.out.println("Account 2 balance: " + a2.getBalance());
        System.out.println("Total accounts: " + BankAccount.getTotalAccounts());
	}
}
