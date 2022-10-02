package barbatos_rex1.domain;

import java.util.Objects;

public class Value {

    private String unit;

    private int value;

    private String flag;

    private String description;

    public Value(String unit, int value, String flag, String description) {
        this.unit = unit;
        this.value = value;
        this.flag = flag;
        this.description = description;
    }



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Value value1 = (Value) o;
        return value == value1.value && Objects.equals(unit, value1.unit) && Objects.equals(flag, value1.flag) && Objects.equals(description, value1.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(unit, value, flag, description);
    }

    public String unit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public int value() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public String flag() {
        return flag;
    }

    public void setFlag(String flag) {
        this.flag = flag;
    }

    public String description() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return String.format("%d %s",value,unit);
    }
}
