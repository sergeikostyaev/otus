package otus.homeworkCollections;

import java.util.*;

public class Bank {

    public final Map<Long, Client> bankAccountsMap = new HashMap<>();

    private final List<Client> clientsList = new ArrayList<>();

    public void createClient(String name, int age) {
        clientsList.add(new Client(name, age));
    }

    public void createClientAccount(Client c) {
        Random r = new Random();
        do {
            Account a = new Account(c, r.nextLong(1000000000));
            if (!bankAccountsMap.containsKey(a.getAccountNumber())) {
                c.addToClientAccountList(a);
                bankAccountsMap.put(a.getAccountNumber(), c);
                break;
            }
        } while (true);
    }


    public String findClientByAccount(Long l) {
        return bankAccountsMap.get(l).getClientName();
    }

    public List<Client> getClientsList() {
        return clientsList;
    }
}
