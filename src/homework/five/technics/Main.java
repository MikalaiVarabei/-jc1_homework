package homework.five.technics;

public class Main {
    public static void main(String[] ars){
        InformationPanel videoWall = new InformationPanel(1024,768, "vertical");
        videoWall.connectToPower();

        VacuumCleaner vacuumCleaner = new VacuumCleaner("Red", 1800);
        vacuumCleaner.connectToPower();
    }
}
