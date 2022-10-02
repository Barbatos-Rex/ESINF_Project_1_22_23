package barbatos_rex1.criteria;

import barbatos_rex1.domain.Area;
import barbatos_rex1.domain.Product;

import java.util.Comparator;

public class EX2Criteria implements Comparator<Product> {
    private final QuantityCriteria quantityCriteria = new QuantityCriteria();

    @Override
    public int compare(Product o1, Product o2) {
        if (o1.year().year()==o2.year().year()){
            return quantityCriteria.compare(o1,o2);
        }
        return Integer.compare(o1.year().year(),o2.year().year());
    }
}
