package homework.three.bank;

public class CashBox extends Banknote{
    private int quantity;

    public CashBox(int denomination, int quantity) {
        super(denomination);
        this.quantity = quantity;
    }

    public CashBox(int denomination, String country, int quantity) {
        super(denomination, country);
        this.quantity = quantity;
    }

    public int getQuantity() {
        return quantity;
    }

    public int changeQuantity(int quantity) {
        this.quantity += quantity;
        return this.quantity;
    }
}
