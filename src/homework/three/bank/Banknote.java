package homework.three.bank;

public class Banknote {
    private final int denomination;
    private final String country;

    public Banknote(int denomination, String country) {
        this.denomination = denomination;
        this.country = country;
    }

    public Banknote(int denomination) {
        this.denomination = denomination;
        country = "byn";
    }

    public int getDenomination() {
        return denomination;
    }

    public String getCountry() {
        return country;
    }
}
