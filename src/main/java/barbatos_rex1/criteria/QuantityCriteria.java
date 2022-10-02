package barbatos_rex1.criteria;

import barbatos_rex1.domain.Product;

import java.util.Comparator;

public class QuantityCriteria implements Comparator<Product> {
    @Override
    public int compare(Product o1, Product o2) {
        return -Integer.compare(o1.value().value(), o2.value().value());
    }
}
