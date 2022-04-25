package homework.five.technics;

public class VacuumCleaner implements PowerCord {
    private final String color;
    private final int power;

    public VacuumCleaner(String color, int power) {
        this.color = color;
        this.power = power;
    }

    @Override
    public void connectToPower() {
        System.out.println("пылесос подключен к питающей сети");
    }
}
