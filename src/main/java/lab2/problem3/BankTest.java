package lab2.problem3;

public class BankTest {

    public static void main(String[] args) {

        Bank bank = new Bank();

        SavingsAccount s1 = new SavingsAccount(1001, 5.0);
        CheckingAccount c1 = new CheckingAccount(2001);
        CheckingAccount c2 = new CheckingAccount(2002);

        bank.openAccount(s1);
        bank.openAccount(c1);
        bank.openAccount(c2);

        s1.deposit(1000);
        c1.deposit(100);
        c1.withdraw(20);
        c1.deposit(50);
        c1.withdraw(10);

        c2.deposit(300);

        System.out.println("Before update:");
        bank.printAllAccounts();

        bank.update();

        System.out.println("\nAfter update:");
        bank.printAllAccounts();

        bank.closeAccount(2002);

        System.out.println("\nAfter closing account 2002:");
        bank.printAllAccounts();
    }
}