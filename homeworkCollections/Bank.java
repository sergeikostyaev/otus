package otus.homeworkCollections;

import java.util.*;

public class Bank {

    private final Map<Account, Client> bankAccountsMap = new HashMap<>();

    private final Map<Client, List<Account>> clientsList = new HashMap<>();

    public Client createClient(String name, int age) {
        Client c = new Client(name, age);
        clientsList.put(c, new ArrayList<Account>());
        return c;
    }
    public Account createClientAccount(Client c) {
        Random r = new Random();

        do {
            final Account a = new Account(c, r.nextLong(1000000000));
            if (!bankAccountsMap.containsKey(a.getAccountNumber())) {
                c.addToClientAccountList(a);
                bankAccountsMap.put(a, c);
                clientsList.compute(c, (k,v) ->{
                   v.add(a);
                    return v;
                });
                return a;
            }
        } while (true);

    }


    public String findClientByAccount(Account l) {
        return bankAccountsMap.get(l).getClientName();
    }

    public Map<Client, List<Account>> getClientsList() {
        return clientsList;
    }
}
