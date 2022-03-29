package guru.springframework;

public interface Expression {
    Money reduce (Bank bank, String to);
    Expression plus(Expression addend);
    public Expression times(int multiplier);
}
