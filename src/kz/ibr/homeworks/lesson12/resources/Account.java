package kz.ibr.homeworks.lesson12.resources;

import java.util.Objects;

public class Account {
    private final int accountId;
    private final int quantityCoins;

    public Account(int accountId, int quantityCoins){
        this.accountId = accountId;
        this.quantityCoins = quantityCoins;
    }

    @Override
    public String toString() {
        return "Accounts{" +
                "accountId=" + accountId +
                ", quantityCoins=" + quantityCoins +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Account account = (Account) o;
        return accountId == account.accountId && quantityCoins == account.quantityCoins;
    }

    @Override
    public int hashCode() {
        return Objects.hash(accountId, quantityCoins);
    }
}
