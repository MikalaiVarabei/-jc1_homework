package homework.three.bank;

public class Banknote {
    private final int nominal;
    private final String country;
    private final String name;

    public Banknote(int nominal, String country, String name) {
        this.nominal = nominal;
        this.country = country;
        this.name = name;
    }

    public Banknote(int nominal) {
        this.nominal = nominal;
        country = "BYN";
        name = "руб.";
    }

    public int getNominal() {
        return nominal;
    }

    public String getCountry() {
        return country;
    }

    public String getName() {
        return name;
    }
}
