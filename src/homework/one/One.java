package homework.one;

import java.util.Calendar;
import java.util.GregorianCalendar;

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
        //без проверок на переполнение!
        System.out.println("(a+b)+(a*b)=");
        int sum = a+b;
        int mul = a*b;
        return sum+mul;
    }

    public void task5(){
        long timeSec = 1_000_000;
        double timeMin = (double)(timeSec)/60;
        double timeHour = (double)(timeSec)/(60*60);
        double timeDay = (double)(timeSec)/(60*60*24);
        double timeWeek = (double)(timeSec)/(60*60*24*7);

        System.out.println("в "+timeSec+" секунд(ах)");
        System.out.println(timeMin + " минут, или");
        System.out.println(timeHour + " часов, или");
        System.out.println(timeDay + " дней, или");
        System.out.println(timeWeek + " недель");
    }

    public boolean task6(int i){
        int ld = i%10;
        System.out.println(i+", последняя цыфра: "+ld);
        return (ld == 7);
    }

    public void task7(int a, int b, int r){
        //радиус описанной окружности для четырехугольника R = SQRT(a^2 + b^2)/2
        double rc = Math.sqrt((double)(a*a) + (double)(b*b))/2;
        System.out.println("задан радиус окружности: " + r + ", радиус описанной окружности: " + rc);

        if(r >= rc) {
            System.out.println("круг перекрывает четырехугольник");
            return;
        }

        System.out.println("круг не перекрывает четырехугольник");
    }

    public void task8(int n){
        int lastDigit = n%10;           //последний разряд
        int penLastDigit = (n%100)/10;  //предпоследний разряд (для определения от 10 до 19)
        //System.out.println(penLastDigit);

        if(penLastDigit == 1)                                           // оканчивается на 10..19
            System.out.println(n+" рублей");
        else if(lastDigit == 1)                                         // оканчивается на 1
            System.out.println(n+" рубль");
        else if ((lastDigit == 2)||(lastDigit == 3)||(lastDigit == 4))  // оканчивается на 2..4
            System.out.println(n+" рубля");
        else if ((lastDigit == 0)||(lastDigit >= 5))                    // оканчивается на 0, 5..9
            System.out.println(n+" рублей");
    }

    public void task9(int day, int month, int year){
        int upDay = 1;//0..28!!!

        Calendar calendar = new GregorianCalendar(year, (month-1), day);
        int maxDay = calendar.getActualMaximum(Calendar.DAY_OF_MONTH);  //количесво дней в заданном месяце

        System.out.println("введена дата " + day + "." + month + "." + year);
        System.out.println(maxDay + " дней в заданном месяце");
        System.out.println(upDay + " дней прибавили");

        int nextDay = day+upDay;
        int nextMont = month;
        int nextYear = year;

        if(nextDay > maxDay) {
            nextDay -= maxDay;
            nextMont += 1;
            if(nextMont > 12) {
                nextMont -= 12;
                nextYear++;
            }
        }

        System.out.println("грядущая дата " + nextDay + "." + nextMont + "." + nextYear);
    }

    public void task10(int a, int b, int c, int d, int e, int f){
        System.out.println("дом-1: "+a+"x"+b);
        System.out.println("дом-2: "+c+"x"+d);
        System.out.println("участок: "+e+"x"+f);

        int count=0;
        // размещаем дома вплотную
        // поворачиваем по одному,
        // проверяем вписываются ли размеры в периметр участка
        // есть 4 способа разместить дома

        //    A         C
        //  +----+   +------+
        // B|  1 |  D|  2   |
        //  +----+   +------+
        if((a+c)<=e) {          // сравниваем с длиной участка
            if((b <= f)&&(d <= f)){
                count++;
                System.out.println("способ-1 позволяет разместить");
            }
        }
        //"поворачиваем" участок на 90 град.
        else if((a+c)<=f) {     //сравниваем с шириной участка
            if((b <= e)&&(d <= e)){
                count++;
                System.out.println("способ-1.1 позволяет разместить");
            }
        }

        //    B         C
        //  +----+   +------+
        // A|  1 |  D|  2   |
        //  +----+   +------+
        if((b+c)<=e) {          // сравниваем с длиной участка
            if((a <= f)&&(d <= f)){
                count++;
                System.out.println("способ-2 позволяет разместить");
            }
        }
        //"поворачиваем" участок на 90 град.
        else if((b+c)<=f) {     //сравниваем с шириной участка
            if((a <= e)&&(d <= e)){
                count++;
                System.out.println("способ-2.1 позволяет разместить");
            }
        }

        //    A         D
        //  +----+   +------+
        // B|  1 |  C|  2   |
        //  +----+   +------+
        if((a+d)<=e) {          // сравниваем с длиной участка
            if((b <= f)&&(c <= f)){
                count++;
                System.out.println("способ-3 позволяет разместить");
            }
        }
        //"поворачиваем" участок на 90 град.
        else if((a+d)<=f) {     //сравниваем с шириной участка
            if((b <= e)&&(c <= e)){
                count++;
                System.out.println("способ-3.1 позволяет разместить");
            }
        }

        //    B         D
        //  +----+   +------+
        // A|  1 |  C|  2   |
        //  +----+   +------+
        if((b+d)<=e) {          // сравниваем с длиной участка
            if((a <= f)&&(c <= f)){
                count++;
                System.out.println("способ-4 позволяет разместить");
            }
        }
        //"поворачиваем" участок на 90 град.
        else if((b+d)<=f) {     //сравниваем с шириной участка
            if((a <= e)&&(c <= e)){
                count++;
                System.out.println("способ-4.1 позволяет разместить");
            }
        }

        if(count > 0)
            System.out.println("есть "+count+" способ(а) разместить дома на учаске");
        else
            System.out.println("дома нельзя разместить на данном участке");
    }

    public void task11(int n){
        switch (n){
            case 1:
                System.out.println("Понедельник");
                System.out.println("работа-дом");
                break;

            case 2:
                System.out.println("Вторник");
                System.out.println("работа-учеба-дом");
                break;

            case 3:
                System.out.println("Среда");
                System.out.println("работа-дом");
                break;

            case 4:
                System.out.println("Четверг");
                System.out.println("работа-учеба-дом");
                break;

            case 5:
                System.out.println("Пятница");
                System.out.println("работа-дом");
                break;

            case 6:
                System.out.println("Суббота");
                System.out.println("уроки, кинотеатр");
                break;

            case 0:
                System.out.println("Воскресенье");
                System.out.println("ничегонеделание");
                break;

            default:
                System.out.println("Ведено неверное число");
                break;
        }
    }
}
