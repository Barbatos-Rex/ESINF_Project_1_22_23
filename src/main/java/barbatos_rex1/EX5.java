package barbatos_rex1;

import barbatos_rex1.criteria.EX5Criteria;
import barbatos_rex1.criteria.QuantityCriteria;
import barbatos_rex1.criteria.YearCriteria;
import barbatos_rex1.domain.Area;
import barbatos_rex1.domain.DataSheet;
import barbatos_rex1.domain.Item;
import barbatos_rex1.domain.Product;
import barbatos_rex1.utils.ProductionDifference;

import java.util.*;

public class EX5 {

    private final DataSheet sheet;


    public EX5(DataSheet sheet) {
        this.sheet = sheet;
    }


    public ProductionDifference greatestDifferenceInProductionIn(Area area) {
        List<Product> products = sheet.areaMap().get(area);
        products.sort(new YearCriteria());
        HashMap<Item, ProductionDifference> diffs = itemProductionDifferenceHashMap(products);
        List<ProductionDifference> result = new ArrayList<>(diffs.values());
        result.sort(new EX5Criteria());
        return result.get(0);
    }

    private static HashMap<Item, ProductionDifference> itemProductionDifferenceHashMap(List<Product> products) {
        HashMap<Item, ProductionDifference> diffs = new HashMap<>();
        for (Product p : products) {
            if (!diffs.containsKey(p.item())) {
                diffs.put(p.item(), new ProductionDifference(p.item()));
            }
            diffs.get(p.item()).treatYear(p.year(), p.value().value());
        }
        return diffs;
    }


}
