package homework.one;

import java.util.Date;

public class One {
    public void task3(){
        byte b = 0x55;
        short s = 0x55FF;
        int i = 1_000_000;
        long l = 0xFFFFFFFFL;
        char c = 'a';
        float f = .25F;
        double d = .00001234;
        boolean bool = true;

        System.out.println("b = "+b);
        System.out.println("s = "+s);
        System.out.println("i = "+i);
        System.out.println("l = "+l);
        System.out.println("c = "+c);
        System.out.println("f = "+f);
        System.out.println("d = "+d);
        System.out.println("bool = "+bool);
    }

    public int task4(int a, int b){
        int sum = a+b;
        int mul = a*b;
        return sum+mul;
    }

    public void task5(){
        long timeSec = 1_000_000;
        double timeMin = timeSec/60D;
        double timeHour = timeSec/(60*60D);
        double timeDay = timeSec/(60*60*24D);
        double timeWeek = timeSec/(60*60*24*7D);

        System.out.println("a "+timeSec+" seconds is");
        System.out.println(timeMin + " minutes, or");
        System.out.println(timeHour + " hour, or");
        System.out.println(timeDay + " day, or");
        System.out.println(timeWeek + " week");
    }

    public void task6(){

    }

    public void task7(){

    }

    public void task8(){

    }

    public void task9(){

    }

    public void task10(){

    }

    public void task11(){

    }
}
