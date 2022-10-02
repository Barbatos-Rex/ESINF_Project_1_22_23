package barbatos_rex1.utils;

import barbatos_rex1.domain.Year;

import java.util.List;

public class ContinousYears {
    private final List<Year> years;

    public ContinousYears(List<Year> years) {
        this.years = years;
    }

    public Iterable<Year> years() {
        return years;
    }

    public int size() {
        return years.size();
    }

}
