package lab1.problem2;

public class BankAccount {
	private static int totalAccounts = 0;
	public static final String BANK_NAME = "Kaspi";
	private final int accountNumber;
	private double balance;
	private AccountType type;
	
	{
		++totalAccounts;
	}
	
	public BankAccount(int accountNumber, AccountType type) {
		this.accountNumber = accountNumber;
        this.type = type;
        this.balance = 0.0;
	}
	
	 public BankAccount(int accountNumber, AccountType type, double initialBalance) {
	    this(accountNumber, type);          
	    this.balance = initialBalance;
	 }
	 
	 public void deposit(double amount) {
		 if (amount > 0) {
			 balance += amount;
		 }
	 }
	 
	 public void deposit(double amount, double fee) {
		 if (amount > 0 && fee >= 0) {
			 balance += (amount - fee);
		 }
	 }
	 
	 public int getAccountNumber() {
		 return accountNumber;
	 }

	 public double getBalance() {
	     return balance;
	 }

	 public AccountType getType() {
	     return type;
	 }

	 public static int getTotalAccounts() {
	     return totalAccounts;
	 }

}
