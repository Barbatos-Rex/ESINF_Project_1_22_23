package barbatos_rex1.domain;

import java.util.Objects;

public class Product {

    private Area area;
    private Item item;
    private Year year;

    private Value value;

    public Product(Area area, Item item, Year year, Value value) {
        this.area = area;
        this.item = item;
        this.year = year;
        this.value = value;
    }

    public Area area() {
        return area;
    }

    public Item item() {
        return item;
    }

    public Year year() {
        return year;
    }

    public Value value() {
        return value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return Objects.equals(area, product.area) && Objects.equals(item, product.item) && Objects.equals(year, product.year) && Objects.equals(value, product.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(area, item, year, value);
    }
}
