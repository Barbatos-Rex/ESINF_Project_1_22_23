package barbatos_rex1;

import barbatos_rex1.criteria.IntegerCompare;
import barbatos_rex1.criteria.QuantityCriteria;
import barbatos_rex1.domain.*;
import barbatos_rex1.utils.Pair;

import java.util.*;

public class EX3 {

    private final DataSheet sheet;

    public EX3(DataSheet sheet) {
        this.sheet = sheet;
    }

    public List<String> findMinNumberOfAreasThatTogetherSurpassIn(int quantity, Year year) {

        List<Product> products = sheet.yearMap().get(year);
        Collection<Pair<String, Integer>> productsCollection = accountEveryItem(products);
        TreeMap<Integer, String> map = new TreeMap<>(new IntegerCompare());
        productsCollection.forEach(p -> map.put(p.second(), p.first()));
        return findMinAreas(quantity, map);
    }

    private Collection<Pair<String, Integer>> accountEveryItem(List<Product> products) {
        HashMap<String, Pair<String, Integer>> countryMap = new HashMap<>();

        for (Product p : products) {
            if (!countryMap.containsKey(p.area().area())) {
                countryMap.put(p.area().area(), new Pair<>(p.area().area(), p.value().value()));
            } else {
                int val = countryMap.get(p.area().area()).second();
                countryMap.replace(p.area().area(), new Pair<>(p.area().area(), val + p.value().value()));
            }
        }
        return countryMap.values();
    }

    private static List<String> findMinAreas(int quantity, TreeMap<Integer, String> products) {

        int sum = 0;
        int counter = 0;
        List<String> countries = new ArrayList<>();
        Iterator<Integer> itr = products.keySet().iterator();
        try {
            while (sum < quantity) {
                sum += itr.next();
                counter++;
            }
        } catch (Exception e) {
            return countries;
        }
        Iterator<String> itr2 = products.values().iterator();
        for (int i = 0; i < counter; i++) {
            countries.add(itr2.next());
        }
        return countries;
    }


}
