package pl.pgalecki.stock.sales;

import pl.pgalecki.stock.sales.ordering.CustomerDetails;
import pl.pgalecki.stock.sales.ordering.PaymentDetails;

import java.math.BigDecimal;
import java.util.UUID;

public class DummyPaymentGateway implements PaymentGateway {

    public static final String DUMMY_PAYMENT_URL = "http://my_payment-url";

    @Override
    public PaymentDetails register(String reservationId, BigDecimal total, CustomerDetails customerDetails) {
        return new PaymentDetails(reservationId, UUID.randomUUID().toString(), DUMMY_PAYMENT_URL);
    }
}