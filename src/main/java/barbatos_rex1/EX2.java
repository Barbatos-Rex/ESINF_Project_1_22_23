package barbatos_rex1;

import barbatos_rex1.criteria.EX2Criteria;
import barbatos_rex1.criteria.QuantityCriteria;
import barbatos_rex1.domain.Area;
import barbatos_rex1.domain.DataSheet;
import barbatos_rex1.domain.Item;
import barbatos_rex1.domain.Product;

import java.util.*;

public class EX2 {

    private final DataSheet sheet;

    public EX2(DataSheet sheet) {
        this.sheet = sheet;
    }


    public List<String> listContriesThatProducedItemByQuantity(Item item, int quantity) {

        List<Product> items = sheet.itemMap().get(item);
        Set<Product> meetQuotas = meetQuotas(items, quantity);
        return convertToSingleCountryList(meetQuotas);

    }

    private List<String> convertToSingleCountryList(Set<Product> meetQuotas) {
        Set<Area> area = new HashSet<>();

        List<String> countries=new ArrayList<>();

        for (Product p : meetQuotas){
            if (!area.contains(p.area())){
                countries.add(p.area().area());
                area.add(p.area());
            }
        }
        return countries;
    }

    private Set<Product> meetQuotas(List<Product> items, int quantity) {
        Set<Product> quoted = new TreeSet<>(new EX2Criteria());
        items.forEach(p -> {
            if (p.value().value() >= quantity) {
                quoted.add(p);
            }
        });
        return quoted;
    }


}
