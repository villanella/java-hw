package org.homework6;
import java.time.LocalDate;
import java.util.List;
import java.lang.String;
import java.time.LocalDate;

public class MainDemo {
    public static void main(String[] args) {
        // Create bank instance
        Bank bank = new Bank();

        // Create clients
        Client ivanov = new Client("Ivan Ivanov", LocalDate.of(1990, 5, 15));
        Client petrov = new Client("Petr Petrov", LocalDate.of(1980, 7, 25));

        // Add clients to the bank
        bank.addClient(ivanov);
        bank.addClient(petrov);

        // Create accounts
        Account account1 = new Account(1, 1000);
        Account account2 = new Account(2, 500);
        Account account3 = new Account(3, 1500);

        // Add accounts to clients
        bank.addAccount(ivanov, account1);
        bank.addAccount(petrov, account2);
        bank.addAccount(petrov, account3);

        // Retrieve accounts for a client
        List<Account> petrovAccounts = bank.getAccounts(petrov);
        System.out.println("Petrov accounts:");
        for (Account account : petrovAccounts) {
            System.out.println("Account ID: " + account.getId() + ", Amount: " + account.getAmount() + " coins.");
        }

        // Find client by account
        Client foundClient = bank.findClient(account1);
        if (foundClient != null) {
            System.out.println("Client found for account 1: " + foundClient.getName());
        } else {
            System.out.println("Client not found for account 1.");
        }

        boolean allowOperation = bank.isBankOperationAllowed(petrov);
        System.out.println("Operations allowed: " + allowOperation);
    }
}
