package homework.seven.thread;

public class Main {
    public static void main(String[] args){
        task52();
        task53();

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


