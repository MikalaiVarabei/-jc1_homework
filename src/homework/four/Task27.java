package homework.four;

import java.util.Scanner;

public class Task27 {
    public static void main(String[] args) {
        System.out.println("Программа подсчитает общее количесво слов");
        System.out.println("Слова могут разделяться любым символом отличным от букв");
        System.out.println("Введите текст, по завершению нажмите ENTER");
        String txt = getDataState();
        System.out.println("Введенный текст: "+txt);

        int count = searchAndCountWord(txt);
        System.out.println("Всего слов в тексте: "+count);

    }

    private static int searchAndCountWord(String txt) {
        if(txt == null) return 0;
        //заменяем все кроме букв пробелами, заменяем множесвенные пробелы пробелами, удаляем пробелы в начале и конце строки
        String str = txt.replaceAll("[^a-zA-Zа-яА-Я]", " ").replaceAll(" +", " ").trim();
        //System.out.println("["+str+"]");
        if(str.length()==0) return 0;
        //преобразуем строку в массив - разделитель пробел, возвращаем длину массива
        return str.split(" ").length;
    }


    private static  String getDataState() {
        Scanner scanner = new Scanner(System.in);
        String data;
        data = scanner.nextLine();
        return data;
    }
}
