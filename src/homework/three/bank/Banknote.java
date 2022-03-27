package homework.three.bank;

public class Banknote {
    private final int denomination;
    private final String country;
    private final String name;

    public Banknote(int denomination, String country, String name) {
        this.denomination = denomination;
        this.country = country;
        this.name = name;
    }

    public Banknote(int denomination) {
        this.denomination = denomination;
        country = "BYN";
        name = "руб.";
    }

    public int getDenomination() {
        return denomination;
    }

    public String getCountry() {
        return country;
    }

    public String getName() {
        return name;
    }
}
