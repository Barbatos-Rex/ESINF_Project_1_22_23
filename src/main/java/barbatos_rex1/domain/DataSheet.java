package barbatos_rex1.domain;

import java.util.*;

public class DataSheet {

    private Map<Item, List<Product>> itemMap;
    private Map<Area, List<Product>> areaMap;
    private Map<Year, List<Product>> yearMap;


    public DataSheet() {
        itemMap = new HashMap<>();
        areaMap = new HashMap<>();
        yearMap = new HashMap<>();
    }

    public void addProduct(Product p) {
        if (!itemMap.containsKey(p.item())) {
            itemMap.put(p.item(), new ArrayList<>());
        }
        if (!areaMap.containsKey(p.area())) {
            areaMap.put(p.area(), new ArrayList<>());
        }

        if (!yearMap.containsKey(p.year())) {
            yearMap.put(p.year(), new ArrayList<>());
        }
        itemMap.get(p.item()).add(p);
        areaMap.get(p.area()).add(p);
        yearMap.get(p.year()).add(p);
    }

    public Map<Item, List<Product>> itemMap() {
        return itemMap;
    }

    public Map<Area, List<Product>> areaMap() {
        return areaMap;
    }

    public Map<Year, List<Product>> yearMap() {
        return yearMap;
    }
}
