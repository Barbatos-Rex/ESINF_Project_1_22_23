package barbatos_rex1.domain;

import java.util.Objects;

public class Area {

    private String domainCode;

    private String domain;

    private int areaCode;

    private String area;

    public Area(String domainCode, String domain, int areaCode, String area) {
        this.domainCode = domainCode;
        this.domain = domain;
        this.areaCode = areaCode;
        this.area = area;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Area area1 = (Area) o;
        return areaCode == area1.areaCode && Objects.equals(domainCode, area1.domainCode) && Objects.equals(domain, area1.domain) && Objects.equals(area, area1.area);
    }

    @Override
    public int hashCode() {
        return Objects.hash(domainCode, domain, areaCode, area);
    }

    public String domainCode() {
        return domainCode;
    }

    public void setDomainCode(String domainCode) {
        this.domainCode = domainCode;
    }

    public String domain() {
        return domain;
    }

    public void setDomain(String domain) {
        this.domain = domain;
    }

    public int areaCode() {
        return areaCode;
    }

    public void setAreaCode(int areaCode) {
        this.areaCode = areaCode;
    }

    public String area() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    @Override
    public String toString() {
        return area;
    }
}
