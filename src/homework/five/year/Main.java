package homework.five.year;

import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        System.out.println("Задание 35. Константы сезона года.");
        System.out.println(SeasonsYear.SPRING.toString());
        System.out.println(SeasonsYear.SUMMER.toString());
        System.out.println(SeasonsYear.AUTUMN.toString());
        System.out.println(SeasonsYear.WINTER.toString());

        System.out.println("");
        System.out.println("Задание 36. Введите номер сезона:");
        System.out.println("1-"+SeasonsYear.SPRING.getDescription()+", \n"+
                "2-"+SeasonsYear.SUMMER.getDescription()+", \n"+
                "3-"+SeasonsYear.AUTUMN.getDescription()+", \n"+
                "4-"+SeasonsYear.WINTER.getDescription()+", \n"+
                "Q-для выхода");

        SeasonsYear str = getNextSeason(getDataInt());
        System.out.println("Следующий сезон: " + (str!=null?str.getDescription():"не определен"));

        System.out.println("");
        System.out.println("Задание 37. Введите номер сезона:");
        System.out.println("1-"+SeasonsYear.SPRING.getDescription()+", \n"+
                "2-"+SeasonsYear.SUMMER.getDescription()+", \n"+
                "3-"+SeasonsYear.AUTUMN.getDescription()+", \n"+
                "4-"+SeasonsYear.WINTER.getDescription()+", \n"+
                "Q-для выхода");
        Integer count = getDayOfSeason(getDataInt());
        System.out.println("Количесво дней в сезоне: " + (count!=null?count:"не определено"));
    }

    static SeasonsYear getNextSeason(int n){
        if(n<1 || n>4) return null;
        int length = SeasonsYear.values().length;
        n -= 1;//0..3
        if(n >= length) return null;
        n++;
        if(n >= length) n=0;
        return SeasonsYear.values()[n];
    }

    static Integer getDayOfSeason(Integer n){
        if(n<1 || n>4) return null;
        int length = SeasonsYear.values().length;
        n -= 1;//0..3
        if(n >= length) return null;
        return SeasonsYear.values()[n].getCountOfDays();
    }

    static int getDataInt() {
        Scanner scanner = new Scanner(System.in);
        String numberPattern = "[1-4]{1}";
        String exitPattern = "[qQ]";
        int data=-1;
        for (;;){
            if(scanner.hasNext(numberPattern)) {
                data = scanner.nextInt();
                break;
            }
            else if(scanner.hasNext(exitPattern)){
                data = -1;
                break;
            }
            scanner.nextLine();
        }
        return data;
    }
}
