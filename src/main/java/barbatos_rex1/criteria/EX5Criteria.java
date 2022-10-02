package barbatos_rex1.criteria;

import barbatos_rex1.utils.ProductionDifference;

import java.util.Comparator;

public class EX5Criteria implements Comparator<ProductionDifference> {
    @Override
    public int compare(ProductionDifference o1, ProductionDifference o2) {
        return -Integer.compare(o1.difference(), o2.difference());
    }
}
