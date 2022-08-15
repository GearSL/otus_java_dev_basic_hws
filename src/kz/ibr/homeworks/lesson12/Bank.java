package kz.ibr.homeworks.lesson12;

import kz.ibr.homeworks.lesson12.resources.Accounts;
import kz.ibr.homeworks.lesson12.resources.BankAccounts;
import kz.ibr.homeworks.lesson12.resources.Clients;

import java.util.*;

public class Bank {
    public static void main(String[] args) {
        BankAccounts bank = BankAccounts.getInstance();

        Clients petr = new Clients(19, "Petr");
        ArrayList<Accounts> petrAccounts = new ArrayList<>();
        petrAccounts.add(new Accounts(101, 1));
        petrAccounts.add(new Accounts(102, 1));
        bank.registerClient(petr, petrAccounts);

        Clients sergey = new Clients(21, "Sergey");
        ArrayList<Accounts> sergeyAccounts = new ArrayList<>();
        sergeyAccounts.add(new Accounts(201, 2));
        sergeyAccounts.add(new Accounts(202, 2));
        bank.registerClient(sergey, sergeyAccounts);

        Clients vladimir = new Clients(31, "Vladimir");
        ArrayList<Accounts> vladimirAccounts = new ArrayList<>();
        vladimirAccounts.add(new Accounts(301, 3));
        vladimirAccounts.add(new Accounts(302, 3));

        System.out.println("Petr accounts: " + bank.getClientAccounts(petr));
        System.out.println("Sergey accounts: " + bank.getClientAccounts(sergey));
        System.out.println("Vladimir accounts: " + bank.getClientAccounts(vladimir));

        System.out.println(bank.findClientByAccount(petrAccounts));
        System.out.println(bank.findClientByAccount(sergeyAccounts));
        System.out.println(bank.findClientByAccount(vladimirAccounts));
    }
}
