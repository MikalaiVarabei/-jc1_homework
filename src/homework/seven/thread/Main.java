package homework.seven.thread;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args){
        System.out.println("Задание 52.");
        for (int i=0; i<10; i++){
            AveragePrint average = new AveragePrint();
            average.run();
        }
        System.out.println("Задание 52. END");
    }
}

class AveragePrint implements Runnable{
    @Override
    public void run() {
        System.out.println(
                new AverageCounter()
                        .addNumRandom(100,10)
                        .average()
                        .getAverage()
        );
    }
}
