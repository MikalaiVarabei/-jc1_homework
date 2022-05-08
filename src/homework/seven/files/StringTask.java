package homework.seven.files;

import java.util.Scanner;

public class StringTask {
    //методы из четвертого ДЗ

    //возвращает количесво знаков символов заданных regex, содержащихся в строке txt
    public static int searchAndCountChars(String txt, String regex) {
        return txt.replaceAll(regex, "").length();
    }

    //возвращает количесво слов в строке
    public static int searchAndCountWord(String txt) {
        if(txt == null) return 0;
        //заменяем все кроме букв пробелами, заменяем множесвенные пробелы пробелами, удаляем пробелы в начале и конце строки
        String str = txt.replaceAll("[^a-zA-Zа-яА-Я]", " ").replaceAll(" +", " ").trim();
        //System.out.println("["+str+"]");
        if(str.length()==0) return 0;
        //преобразуем строку в массив - разделитель пробел, возвращаем длину массива
        return str.split(" ").length;
    }

    public static  String getInputData() {
        Scanner scanner = new Scanner(System.in);
        String data;
        data = scanner.nextLine();
        return data;
    }
}
