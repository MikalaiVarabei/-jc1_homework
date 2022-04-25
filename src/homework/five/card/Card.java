package homework.five.card;

public class Card extends DataCard implements MagneticStripe, Rfid, Chip{

    protected Card(String data) {
        super(data);
    }

    @Override
    public String getDataMagnetic() {
        return readData();
    }

    @Override
    public String getDataRf() {
        return readData();
    }

    @Override
    public String getDataChip() {
        return readData();
    }
}
