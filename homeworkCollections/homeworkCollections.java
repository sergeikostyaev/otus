package otus.homeworkCollections;

import java.util.*;

public class homeworkCollections {
    public static void main(String[] args) {
        Bank b = new Bank();
        b.createClient("Петр Алексеев", 45);
        b.createClient("Денис Петров", 24);
        List<Client> l = b.getClientsList();
        b.createClientAccount(l.get(0));
        b.createClientAccount(l.get(0));
        b.createClientAccount(l.get(1));
        System.out.println("Список клиентов и счетов:");
        for (Client c : l) {
            for (Account a : c.getClientAccountList()) {
                System.out.println(a.getAccountNumber() + " принадлежит клиенту - " + c.getClientName());
            }
        }

        System.out.println("\nПоиск клиента по номеру счета. Введите номер:");
        try (Scanner sc = new Scanner(System.in)) {
            long acc = sc.nextLong();
            System.out.printf("Счет %d принадлежит клиенту %s\n", acc, b.findClientByAccount(acc));
        }

        System.out.println("\nПоиск всех счетов по клиенту Петр Алексеев через equals и hashCode:");
        Client testClient = new Client("Петр Алексеев", 45);

        for (Client c : l) {
            if (c.equals(testClient) && c.hashCode() == testClient.hashCode()) {
                for (Account a : c.getClientAccountList()) {
                    System.out.println(a.getAccountNumber());
                }
            }
        }
    }
}


