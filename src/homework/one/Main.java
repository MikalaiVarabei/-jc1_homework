package homework.one;

public class Main {
    public static void main(String[] args) {
        System.out.println("********** task3: **********");
        //обьявление переменных
        new One().task3();
        System.out.println(" ");

        System.out.println("********** task4: **********");
        //сумма, произведение
        System.out.println(new One().task4(2, 3));
        System.out.println(" ");

        System.out.println("********** task5: **********");
        //секунды
        new One().task5();
        System.out.println(" ");

        System.out.println("********** task6: **********");
        // выводим последнюю цифру
        System.out.println(new One().task6(1777771));
        System.out.println(" ");

        System.out.println("********** task7: **********");
        // длина, ширина, радиус
        new One().task7(3, 4, 4);
        System.out.println(" ");

        System.out.println("********** task8: **********");
        // рубли
        new One().task8(110013);
        System.out.println(" ");

        System.out.println("********** task9: **********");
        //день, месяц, год
        new One().task9(31, 12, 2020);
        System.out.println(" ");

        System.out.println("********** task10: **********");
        //дом-1, дом-2, участок
        new One().task10(3,4, 3,7, 4,10);
        System.out.println(" ");

        System.out.println("********** task11: **********");
        // дни недели 0..6
        new One().task11(5);
        System.out.println(" ");
    }
}
