package otus.homeworkCollections;

import java.util.ArrayList;
import java.util.List;

public class Client {
    private String name;
    private int age;

    private final List<Account> clientAccountList = new ArrayList<>();

    Client(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public List<Account> getClientAccountList() {
        return clientAccountList;
    }

    public void addToClientAccountList(Account a) {
        clientAccountList.add(a);
    }

    public String getClientName() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Client client = (Client) o;
        return age == client.age && name.equals(client.name);
    }

    @Override
    public int hashCode() {
        return name.hashCode() + age;
    }
}
