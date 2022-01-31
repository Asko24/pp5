package pl.pgalecki.stock.sales;

import pl.pgalecki.stock.sales.ordering.CustomerDetails;
import pl.pgalecki.stock.sales.ordering.PaymentDetails;

import java.math.BigDecimal;

public interface PaymentGateway {
    PaymentDetails register(String id, BigDecimal total, CustomerDetails customerDetails);
}