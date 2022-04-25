package homework.five.card;

public class BankCard extends Card{
    private final String bankName;

    public BankCard(String data, String bankName) {
        super(data);
        this.bankName = bankName;
    }

    public String getBankName() {
        return bankName;
    }
}
