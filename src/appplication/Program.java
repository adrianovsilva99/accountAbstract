package appplication;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        List<Account> accountList = new ArrayList<>();

        accountList.add(new SavingsAccount(1001, "Alex", 500.0, 0.01));
        accountList.add(new BusinessAccount(1002, "Maria", 1000.0, 400.0));
        accountList.add(new SavingsAccount(1003, "Bob", 300.0, 0.01));
        accountList.add(new BusinessAccount(1004, "Anna", 500.0, 500.0));

        double sum = 0.0;
        for (Account acc : accountList) {
            sum += acc.getBalance();
        }
        System.out.printf("Total balance: %.2f%n", sum);

        for (Account acc : accountList) {
            acc.deposit(10.0);
        }

        for (Account acc : accountList) {
            System.out.printf("Update balance for account number %d: %.2f%n", acc.getNumber(), acc.getBalance());
        }
    }
}
