package barbatos_rex1.domain;

import java.util.Objects;

public class Item {

    private int elementCode;

    private String element;

    private int itemCode;

    private String item;

    public Item(int elementCode, String element, int itemCode, String item) {
        this.elementCode = elementCode;
        this.element = element;
        this.itemCode = itemCode;
        this.item = item;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Item item1 = (Item) o;
        return elementCode == item1.elementCode && itemCode == item1.itemCode && Objects.equals(element, item1.element) && Objects.equals(item, item1.item);
    }

    @Override
    public int hashCode() {
        return Objects.hash(elementCode, element, itemCode, item);
    }

    public int elementCode() {
        return elementCode;
    }

    public void setElementCode(int elementCode) {
        this.elementCode = elementCode;
    }

    public String element() {
        return element;
    }

    public void setElement(String element) {
        this.element = element;
    }

    public String item() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public int itemCode() {
        return itemCode;
    }

    public void setItemCode(int itemCode) {
        this.itemCode = itemCode;
    }


    public String toString(){
        return item;
    }
}
