package otus.homeworkCollections;

import java.util.*;

public class homeworkCollections {
    public static void main(String[] args) {
        Bank b = new Bank();
        Client c1 = b.createClient("Петр Алексеев", 45);
        Client c2 = b.createClient("Денис Петров", 24);
        Account a1 = b.createClientAccount(c1);
        b.createClientAccount(c1);
        b.createClientAccount(c2);
        Map<Client, List<Account>> mp = b.getClientsList();
        System.out.println("Список клиентов и счетов:");
        mp.forEach((c, l) -> {
            System.out.print(c.getClientName() + " ");
            l.forEach((ll) -> System.out.print(ll.getAccountNumber() + " "));
            System.out.println();
        });


        System.out.println("\nПоиск всех счетов по клиенту Петр Алексеев через equals и hashCode:");
        Client testClient = new Client("Петр Алексеев", 45);
        mp.get(testClient).forEach((s) -> System.out.println(s.getAccountNumber() + " "));


        List<Account> accounts = mp.get(testClient);


        System.out.println("\nПоиск клиента по номеру счета:");


        System.out.printf("Счет %d принадлежит клиенту %s\n", a1.getAccountNumber(), b.findClientByAccount(a1));

    }
}


