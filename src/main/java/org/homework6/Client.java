package org.homework6;
import java.time.LocalDate;
import java.time.Period;
import java.util.HashSet;
import java.util.Set;

class Client {
    private String id;
    private String name;
    private LocalDate dateOfBirth;
    private Set<Integer> accountIds;

    public Client(String id, String name, LocalDate dateOfBirth) {
        this.id = id;
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.accountIds = new HashSet<>();
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        LocalDate now = LocalDate.now();
        Period period = Period.between(dateOfBirth, now);
        return period.getYears();
    }

    public void addAccountId(int accountId) {
        accountIds.add(accountId);
    }

    public boolean containsAccountId(int accountId) {
        return accountIds.contains(accountId);
    }

    public void removeAccountId(int accountId) {
        accountIds.remove(accountId);
    }

    public Set<Integer> getAccountIds() {
        return accountIds;
    }
}
