package pl.pgalecki;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

public class BlaTest {

    @Test
    public void itHandleMultipleCardWithdraws() {
        //A
        String card1 = thereIsCardWithLimit(1000);
        String card2 = thereIsCardWithLimit(2000);

        CardApi cardApi = thereIsCardApi();
        //Act
        cardApi.handleWithdraw(card1, BigDecimal.valueOf(500));
        cardApi.handleWithdraw(card2, BigDecimal.valueOf(1000));
        //A
        cardBallanceEquals(card1, 500);
        cardBallanceEquals(card2, 1000);
    }
}
