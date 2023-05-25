package org.homework6;
import java.time.LocalDate;
import java.time.Period;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

class Client {
    private String id;
    private String name;
    private LocalDate dateOfBirth;
    private Set<Integer> accountIds;

    public Client(String name, LocalDate dateOfBirth) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        LocalDate now = LocalDate.now();
        Period period = Period.between(dateOfBirth, now);
        return period.getYears();
    }

    public int hashCode() {
        return Objects.hash(name, dateOfBirth);
    }
}
