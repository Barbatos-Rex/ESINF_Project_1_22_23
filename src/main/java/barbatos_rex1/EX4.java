package barbatos_rex1;

import barbatos_rex1.criteria.EX4Criteria;
import barbatos_rex1.domain.*;
import barbatos_rex1.utils.ContinousYears;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EX4 {
    private final DataSheet sheet;

    public EX4(DataSheet sheet) {
        this.sheet = sheet;
    }



    public Map<String, ContinousYears> continousGrowthYearsOf(Item i){

        List<Product> productList = sheet.itemMap().get(i);

        productList.sort(new EX4Criteria());

        return generateMap(productList);












    }

    private Map<String, ContinousYears> generateMap(List<Product> productList) {
        Map<String,ContinousYears> result = new HashMap<>();
        ContinousYears cy = new ContinousYears();
        for (Product p: productList){

        }



    }


}
