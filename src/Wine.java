import java.time.LocalDate;

public class Wine {
    private String name;
    private String brand;
    private String madeOfCountry;
    private LocalDate madeOfYear;

    public Wine(String name, String brand, String madeOfCountry, LocalDate madeOfYear) {
        this.name = name;
        this.brand = brand;
        this.madeOfCountry = madeOfCountry;
        this.madeOfYear = madeOfYear;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getMadeOfCountry() {
        return madeOfCountry;
    }

    public void setMadeOfCountry(String madeOfCountry) {
        this.madeOfCountry = madeOfCountry;
    }

    public LocalDate getMadeOfYear() {
        return madeOfYear;
    }

    public void setMadeOfYear(LocalDate madeOfYear) {
        this.madeOfYear = madeOfYear;
    }

    @Override
    public String toString() {
        return "Wine{" +
                "name='" + name + '\'' +
                ", brand='" + brand + '\'' +
                ", madeOfCountry='" + madeOfCountry + '\'' +
                ", madeOfYear=" + madeOfYear +
                '}';
    }

}
