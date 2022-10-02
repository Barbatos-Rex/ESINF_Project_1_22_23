package barbatos_rex1.criteria;

import java.util.Comparator;

public class IntegerCompare implements Comparator<Integer> {
    @Override
    public int compare(Integer o1, Integer o2) {
        return Integer.compare(o2,o1);
    }
}
