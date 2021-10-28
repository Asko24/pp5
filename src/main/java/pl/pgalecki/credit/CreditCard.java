package pl.pgalecki.credit;

import java.math.BigDecimal;

public class CreditCard {
    public static final int CREDIT_LOW_LIMIT = 1000;
    private final String cardNumber;
    private BigDecimal limit;
    private BigDecimal balance;

    public CreditCard(String cardNumber) {

        this.cardNumber = cardNumber;
    }

    public void assignLimit(BigDecimal limit) {
        if (isBelowCreditLimit(limit)) {
            throw new CreditLimitBelowMinimumValueException();
        }
    }

    private boolean isBelowCreditLimit(BigDecimal limit) {
        return limit.compareTo(BigDecimal.valueOf(100)) < 0;
    }

    public BigDecimal getCurrentLimit() {
        return limit;
    }

    public void withdraw(BigDecimal money) {
        this.balance = balance.subtract(money);

        public BigDecimal getBalance () {
        }
    }
}
