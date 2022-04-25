package homework.five.technics;

public class LedTv implements PowerCord {
    private final int resolutionH;
    private final int resolutionW;

    public LedTv(int resolutionH, int resolutionW) {
        this.resolutionH = resolutionH;
        this.resolutionW = resolutionW;
    }

    @Override
    public void connectToPower() {
        System.out.println("телевизор подключен к питающей сети");
    }
}
