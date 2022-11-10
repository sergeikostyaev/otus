package otus.homeworkCollections;

import java.util.*;

public class Bank {

    private final Map<Long, Client> bankAccountList = new HashMap<>();

    private final List<Client> clientList = new ArrayList<>();

    public void addClient(String name, int age) {
        clientList.add(new Client(name, age));
    }


    public List<Client> getClientList() {
        return clientList;
    }

    public List<Account> getAllClientsAccounts(Client c) {
        return c.clientAccountList;
    }

    public String findClient(Long l) {
        return bankAccountList.get(l).getName();
    }


    class Client {

        private String name;
        private int age;
        private final List<Account> clientAccountList = new ArrayList<>();

        Client(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public void createAccount() {
            Random r = new Random();
            do {
                Account a = new Account(this, r.nextLong(1000000000));
                if (!bankAccountList.containsKey(a.getAccountNumber())) {
                    clientAccountList.add(a);
                    bankAccountList.put(a.getAccountNumber(), this);
                    break;
                }
            } while (true);
        }

        public String getName() {
            return name;
        }
    }

    class Account {

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
}
