package homework.five.card;

public class DataCard {
    private final String data;
    protected DataCard(String data) {
        this.data = data;
    }
    public String readData(){
        return data;
    }
}
