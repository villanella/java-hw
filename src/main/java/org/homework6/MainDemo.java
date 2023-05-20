package org.homework6;
import java.time.LocalDate;
import java.util.List;

public class MainDemo {
    public static void main(String[] args) {
        // Create bank instance
        Bank bank = new Bank();

        // Create clients
        Client client1 = new Client("C1", "John Doe", LocalDate.of(1990, 5, 10));
        Client client2 = new Client("C2", "Jane Smith", LocalDate.of(1985, 8, 22));

        // Add clients to the bank
        bank.addClient(client1);
        bank.addClient(client2);

        // Create accounts
        Account account1 = new Account(1, 1000);
        Account account2 = new Account(2, 500);

        // Add accounts to clients
        bank.addAccount(client1, account1);
        bank.addAccount(client1, account2);

        // Retrieve accounts for a client
        List<Account> client1Accounts = bank.getAccounts(client1);
        System.out.println("Client 1 accounts:");
        for (Account account : client1Accounts) {
            System.out.println("Account ID: " + account.getId() + ", Amount: " + account.getAmount());
        }

        // Find client by account
        Client foundClient = bank.findClient(account2);
        if (foundClient != null) {
            System.out.println("Client found for account 2: " + foundClient.getName());
        } else {
            System.out.println("Client not found for account 2.");
        }
    }
}
