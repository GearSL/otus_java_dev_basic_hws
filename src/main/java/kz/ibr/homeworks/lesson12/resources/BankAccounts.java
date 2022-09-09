package kz.ibr.homeworks.lesson12.resources;

import java.util.*;

public class BankAccounts {
    private static BankAccounts instance;
    private final Map<Client, HashSet<Account>> accounts = new HashMap<>();

    private BankAccounts(){}

    public static BankAccounts getInstance() {
        if(instance == null){
            instance = new BankAccounts();
        }
        return instance;
    }

    public void registerClient(Client client, HashSet<Account> accounts){
        this.accounts.put(client, accounts);
    }

    public HashSet<Account> getClientAccounts(Client client){
        return accounts.get(client);
    }

    public Client findClientByAccount(Account account){
        for (Map.Entry<Client, HashSet<Account>> entry : accounts.entrySet()) {
            for (int i = 0; i < entry.getValue().size(); i++){
                if(entry.getValue().contains(account)){
                    return entry.getKey();
                }
            }
        }
        return null;
    }
}
