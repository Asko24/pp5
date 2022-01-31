package pl.pgalecki.stock.sales;

import pl.pgalecki.stock.productcatalog.Product;

public interface ProductDetailsProvider {
    ProductDetails getProductDetails(String productId);
}