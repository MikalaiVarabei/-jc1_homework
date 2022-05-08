package homework.seven.thread;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        task52();
        Thread.sleep(1000);
        task53();
        Thread.sleep(1000);
        task54();
    }

    private static void task52(){
        System.out.println("Задание 52.");
        AveragePrint average = new AveragePrint();
        for (int i=0; i<10; i++){
            new Thread(average).start();
        }
        System.out.println("Задание 52. END");
    }

    private static void task53(){
        System.out.println("Задание 53.");
        MaxNumPrint max = new MaxNumPrint();
        for (int i=0; i<10; i++){
            new Thread(max).start();
        }
        System.out.println("Задание 53. END");
    }

    private static void task54(){
        System.out.println("Задание 54.");
        SaveToFileNumPrint saveToFileNum = new SaveToFileNumPrint();
        for (int i=0; i<5; i++){
            new Thread(saveToFileNum).start();
        }
        System.out.println("Задание 54. END");
    }
}

class AveragePrint implements Runnable{
    @Override
    public void run() {
        System.out.println(
                new NumberCounter()
                        .addNumRandom(100,10)
                        .averageCounter()
                        .getAverageRes()
        );
    }
}

class MaxNumPrint implements Runnable{
    @Override
    public void run() {
        System.out.println(
                new NumberCounter()
                        .addNumRandom(100,10)
                        .maxCounter()
                        .getMaxRes()
        );
    }
}

class SaveToFileNumPrint implements Runnable{
    private static int count=0;
    private String fileName = "";

    public synchronized int getIncrementCount(){
        return count++;
    }

    public void saveToFile(String s) throws IOException {
        Files.newByteChannel(
                        Paths.get(fileName),

                        StandardOpenOption.CREATE,
                        StandardOpenOption.WRITE,
                        StandardOpenOption.TRUNCATE_EXISTING
                )
                .write(ByteBuffer.allocate(s.length()).put(s.getBytes()).position(0));
    }

    @Override
    public void run() {
        fileName = "task54_"+getIncrementCount()+".txt";
        try {
            saveToFile(
                    new NumberCounter()
                            .addNumRandom(100,10)
                            .maxCounter()
                            .getNumbers()
                            .toString());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

