package otus.homeworkCollections;

public class Account {
    private final Client owner;
    private final long accountNumber;

    int balance;

    Account(Client owner, long accountNumber) {
        this.owner = owner;
        this.accountNumber = accountNumber;
    }

    public long getAccountNumber() {
        return accountNumber;
    }
}
