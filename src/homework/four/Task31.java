package homework.four;

import java.util.Scanner;

public class Task31 {
    public static void main(String[] args) {
        System.out.println("Задание 31");

        long time1 = System.currentTimeMillis();
        concatString("aaabbbccc", 1_000_000);
        time1 = System.currentTimeMillis() - time1;
        System.out.println("Время выполнения конкатенации, мс: " + time1);

        long time2 = System.currentTimeMillis();
        appStringBuilder("aaabbbccc", 1_000_000);
        time2 = System.currentTimeMillis() - time2;
        System.out.println("Время выполнения append(), мс: " + time2);

        System.out.println("Время выполнения отличается в "+compare(time1, time2)+" раз.");
    }

    private static double compare(long a, long b){
            double x = a>b?a:b;
            double y = a>b?b:a;
            if(y == 0) return x;
            return x/y;
    }

    private static  String  concatString (String txt, int count){
        String str="";
        for (int i = 0; i<count; i++){
            str += txt;
        }
        return str;
    }

    private static  String  appStringBuilder (String txt, int count){
        StringBuilder str = new StringBuilder("");
        for (int i = 0; i<count; i++){
            str.append(txt);
        }
        return str.toString();
    }


    private static  String getInputData() {
        Scanner scanner = new Scanner(System.in);
        String data;
        data = scanner.nextLine();
        return data;
    }
}
