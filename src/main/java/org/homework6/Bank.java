package org.homework6;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class Bank {
    private Map<Client, List<Account>> clientAccounts;

    public Bank() {
        clientAccounts = new HashMap<>();
    }

    public void addClient(Client client) {
        clientAccounts.put(client, new ArrayList<>());
    }

    public void addAccount(Client client, Account account) {
        if (clientAccounts.containsKey(client)) {
            List<Account> accounts = clientAccounts.get(client);
            accounts.add(account);
        }
    }

    public List<Account> getAccounts(Client client) {
        return clientAccounts.getOrDefault(client, new ArrayList<>());
    }

    public Client findClient(Account account) {
        for (Map.Entry<Client, List<Account>> entry : clientAccounts.entrySet()) {
            List<Account> accounts = entry.getValue();
            for (Account acc : accounts) {
                if (acc.getId() == account.getId()) {
                    return entry.getKey();
                }
            }
        }
        return null;
    }

    public boolean isBankOperationAllowed(Client client) {
        int age = client.getAge();
        return age >= 18 && age <= 70;
    }
}
