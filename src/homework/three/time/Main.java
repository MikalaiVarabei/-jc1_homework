package homework.three.time;

public class Main {

    public static void main(String[] args){
        System.out.println("********** task24: **********");
        IntervalTime intervalTime_1 = new IntervalTime(127695);             //в конструктор передаем интервал в секундах
        System.out.println(intervalTime_1.getStrTime());                                  //вывод данных
        IntervalTime intervalTime_2 = new IntervalTime(15,28,35);   //в конструктор передаем часы, минуты, секунды
        System.out.println(intervalTime_2.getStrTime());                                   //вывод данных
        System.out.println(intervalTime_2.getSecondsInterval());                           //вывод интервала
        System.out.println(intervalTime_1.compareTimeTo(intervalTime_2));                  //сравниваем

    }
}
