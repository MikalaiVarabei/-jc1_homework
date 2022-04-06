package homework.four;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task26 {
    public static void main(String[] args) {
        System.out.println("Программа подсчитает общее количесво следующих знаков препинания:");
        System.out.println("точка (.), вопросительный знак (?), восклицательный знак (!), запятая (,), точка с запятой (;), двоеточие (:), тире (-)");
        System.out.println("Введите текст, по завершению нажмите ENTER");

        String txt = getDataState();

        int count = searchAndCountChars(txt);

        System.out.println("Всего знаков препинания в тексте: ");
        System.out.println("Первый способ: "+count);

        count = searchAndCountChars2(txt, "[^.?!,;:-]");
        System.out.println("Второй способ: "+count);
    }

    private static int searchAndCountChars(String txt) {
        int count=0;
        char symbol;
        for (int i=0; i<txt.length(); i++){
            symbol = txt.charAt(i);
            switch (symbol){
                case '.':
                case '?':
                case '!':
                case ',':
                case ';':
                case ':':
                case '-':
                    count++;
                    break;
            }
        }

        return count;
    }

    private static int searchAndCountChars2(String txt, String regex) {
        return txt.replaceAll(regex, "").length();
    }

    private static  String getDataState() {
        Scanner scanner = new Scanner(System.in);
        String data;
        data = scanner.nextLine();
        return data;
    }
}
