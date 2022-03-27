package guru.springframework;

public class Money {
    protected int amount;

    public boolean equals(Object object) {
        Money money = (Money) object;
        return money.amount == amount && getClass().equals(object.getClass());
    }
}
