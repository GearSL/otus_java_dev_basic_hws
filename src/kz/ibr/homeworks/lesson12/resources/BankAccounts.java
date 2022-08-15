package kz.ibr.homeworks.lesson12.resources;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;

public class BankAccounts {
    private static BankAccounts instance;
    private final Map<Clients, ArrayList<Accounts>> accounts = new LinkedHashMap<>();

    private BankAccounts(){}

    public static BankAccounts getInstance() {
        if(instance == null){
            instance = new BankAccounts();
        }
        return instance;
    }

    public void registerClient(Clients client, ArrayList<Accounts> accounts){
        this.accounts.put(client, accounts);
    }

    public ArrayList<Accounts> getClientAccounts(Clients client){
        return accounts.get(client);
    }

    public Clients findClientByAccount(ArrayList<Accounts> account){
        for (Map.Entry<Clients, ArrayList<Accounts>> entry : accounts.entrySet()) {
            if (entry.getValue().equals(account)) {
                return entry.getKey();
            }
        }
        return null;
    }

    public Map<Clients, ArrayList<Accounts>> getAccounts() {
        return accounts;
    }
}
