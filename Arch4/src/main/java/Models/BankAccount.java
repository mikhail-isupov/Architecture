package Models;

/**
 * Модель банковского аккаунта
 */
public class BankAccount {

    private long card;
    private static long oldCard = 0;
    private int balance;


    public long getCard() {
        return card;
    }

    public BankAccount() {
        this.card = oldCard + 1;
        oldCard = this.card;
        balance = 1000;
    }

    @Override
    public String toString() {
        return "BankAccount {" +
                " card= " + (String.format("%016d", card)) +
                ", balance= " + balance +
                " }";
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }
}
