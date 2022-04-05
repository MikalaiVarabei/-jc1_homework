package homework.four;

import java.util.Scanner;

public class Task26 {
    public static void main(String[] args) {
        System.out.println("Введите текст со знаками перпинания, по завершению нажмите ENTER");
        System.out.println("Программа подсчитает общее количесво следующих знаков препинания:");
        System.out.println("точка (.), вопросительный знак (?), восклицательный знак (!), запятая (,), точка с запятой (;), двоеточие (:), тире (-)");
        String txt = getDataState();
        System.out.println("Введенный текст: "+txt);

        int count = searchAndCountChars(txt, "[.?!,;:-]");
        System.out.println("Всего знаков препинания в тексте: "+count);
    }

    private static int searchAndCountChars(String txt, String s) {
        int count=0;
        char symbol;
        for (int i=0; i<txt.length(); i++){
            symbol = txt.charAt(i);
            if(symbol == '.' ||
                symbol == '?' ||
                symbol == '!' ||
                symbol == ';' ||
                symbol == ':' ||
                symbol == '-' ||
                symbol == ','

            ){
                count++;
            }
        }

        return count;
    }

    private static  String getDataState() {
        Scanner scanner = new Scanner(System.in);
        String data;
        data = scanner.nextLine();
        return data;
    }
}
