package otus.homeworkCollections;


import java.util.*;

public class homeworkCollections {
    public static void main(String[] args) {

        Bank b = new Bank();
        b.addClient("Петир Паршенко", 54);
        b.addClient("Денис Петров", 21);
        List<Bank.Client> al = b.getClientList();
        Bank.Client Petir = al.get(0);
        Bank.Client Denis = al.get(1);
        Petir.createAccount();
        Petir.createAccount();
        Petir.createAccount();
        Denis.createAccount();
        Denis.createAccount();

        List<Bank.Account> petirList = b.getAllClientsAccounts(Petir);
        for (Bank.Account a : petirList) {
            System.out.println("Счет Петира Паршенко: " + a.getAccountNumber());
        }

        System.out.println("");

        List<Bank.Account> denisList = b.getAllClientsAccounts(Denis);
        for (Bank.Account a : denisList) {
            System.out.println("Счет Дениса Петрова: " + a.getAccountNumber());
        }
        System.out.println();

        try (Scanner sc = new Scanner(System.in)){
            System.out.println(b.findClient(sc.nextLong()));
        }


    }

}



