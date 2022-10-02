package barbatos_rex1.utils;

import barbatos_rex1.domain.Item;
import barbatos_rex1.domain.Year;

public class ProductionDifference {
    private Pair<Year, Year> years;
    private Item item;
    private int difference;

    private int lastQuantity;
    private Year lastYear;

    public ProductionDifference(Item item) {
        this.years = new Pair<>(new Year(-1, -1), new Year(0, 0));
        this.item = item;
        this.difference = 0;
        this.lastQuantity = 0;
        this.lastYear = null;
    }

    public void treatYear(Year year, int value) {
        if (lastYear == null) {
            lastYear = year;
            lastQuantity = value;
            return;
        } else if (Math.abs(difference) < Math.abs(value - lastQuantity)) {
            years = new Pair<>(lastYear, year);
            difference = value - lastQuantity;
        }
        lastYear = year;
        lastQuantity = value;
    }


    public Pair<Year, Year> years() {
        return years;
    }

    public Item item() {
        return item;
    }

    public int difference() {
        return difference;
    }

    @Override
    public String toString() {
        return String.format("[%d/%d, %s, %d]", years.first().year(), years.second().year(), item.item(), difference);
    }
}
