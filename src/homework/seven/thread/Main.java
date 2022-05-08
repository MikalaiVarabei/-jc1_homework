package homework.seven.thread;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args){
        System.out.println("Задание 52.");
        AveragePrint average = new AveragePrint();
        for (int i=0; i<10; i++){
            new Thread(average).start();
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
