package barbatos_rex1.criteria;

import barbatos_rex1.domain.Product;

import java.util.Comparator;

public class EX4Criteria implements Comparator<Product> {
    @Override
    public int compare(Product o1, Product o2) {
        int comparison = o1.area().area().compareTo(o2.area().area());
        if (comparison == 0) {
            return Integer.compare(o1.year().year(), o1.year().year());
        }
        return comparison;
    }
}
