package kz.ibr.homeworks.lesson12.resources;

public class Accounts {
    private final int accountId;
    private final int quantityCoins;

    public Accounts(int accountId, int quantityCoins){
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
}
