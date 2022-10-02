package barbatos_rex1.domain;

import java.util.Objects;

public class Year {

    private int yearCode;

    private int year;

    public Year(int yearCode, int year) {
        this.yearCode = yearCode;
        this.year = year;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Year year1 = (Year) o;
        return yearCode == year1.yearCode && year == year1.year;
    }

    @Override
    public int hashCode() {
        return Objects.hash(yearCode, year);
    }

    public void setYearCode(int yearCode) {
        this.yearCode = yearCode;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int yearCode() {
        return yearCode;
    }

    public int year() {
        return year;
    }

    @Override
    public String toString() {
        return String.format("%d",year);
    }
}
