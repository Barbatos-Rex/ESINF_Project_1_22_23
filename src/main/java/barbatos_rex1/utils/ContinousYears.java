package barbatos_rex1.utils;

import barbatos_rex1.domain.Year;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ContinousYears {
    private final List<Year> years;
    private final List<Year> tmpYears;

    private int currentQuantity = -1;

    public ContinousYears() {
        this.years = new ArrayList<>();
        this.tmpYears = new LinkedList<>();
    }

    public void treatYear(Year y, int quantity) {
        if (currentQuantity < quantity) {
            tmpYears.add(y);
            currentQuantity = quantity;
        }else{
            merge();
        }
    }

    public void merge() {
        if (tmpYears.size() > years.size()) {
            years.clear();
            years.addAll(tmpYears);
            tmpYears.clear();
            currentQuantity = -1;
        }
    }

    public Iterable<Year> years() {
        return years;
    }

    public int size() {
        return years.size();
    }

    @Override
    public String toString() {
        return "" + size();
    }
}
