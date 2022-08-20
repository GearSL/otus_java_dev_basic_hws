package kz.ibr.homeworks.lesson12;

import kz.ibr.homeworks.lesson12.resources.Account;
import kz.ibr.homeworks.lesson12.resources.BankAccounts;
import kz.ibr.homeworks.lesson12.resources.Client;

import java.util.*;

public class Bank {
    public static void main(String[] args) {
        BankAccounts bank = BankAccounts.getInstance();

        Client petr = new Client(19, "Petr");
        HashSet<Account> petrAccounts = new HashSet<>();
        Account account_101 = new Account(101, 1);
        petrAccounts.add(account_101);
        Account account_102 = new Account(101, 1);
        petrAccounts.add(account_102);
        bank.registerClient(petr, petrAccounts);

        Client sergey = new Client(21, "Sergey");
        HashSet<Account> sergeyAccounts = new HashSet<>();
        Account account_201 = new Account(201, 2);
        sergeyAccounts.add(account_201);
        Account account_202 = new Account(202, 2);
        sergeyAccounts.add(account_202);
        bank.registerClient(sergey, sergeyAccounts);

        Client vladimir = new Client(31, "Vladimir");
        HashSet<Account> vladimirAccounts = new HashSet<>();
        Account account_301 = new Account(301, 2);
        vladimirAccounts.add(account_301);
        Account account_302 = new Account(302, 2);
        vladimirAccounts.add(account_302);


        System.out.println("***** FIND CLIENTS *****");
        System.out.println("Petr accounts: " + bank.getClientAccounts(petr));
        System.out.println("Sergey accounts: " + bank.getClientAccounts(sergey));
        System.out.println("Vladimir accounts: " + bank.getClientAccounts(vladimir));
        System.out.println("***** FIND CLIENTS BY ACCOUNT *****");
        System.out.println("Find Petr by account: " + bank.findClientByAccount(account_102));
        System.out.println("Find Sergey by account: " + bank.findClientByAccount(account_201));
        System.out.println("Find Vladimir by account: " + bank.findClientByAccount(account_302));
    }
}
