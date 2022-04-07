package homework.four;

import java.util.Scanner;

public class Task28 {
    public static void main(String[] args) {
        System.out.println("Задание 28");
        System.out.println("Введите текст, по завершению нажмите ENTER");
        String txt = getInputData();
        System.out.println("Введенный текст: "+txt);

        txt = newText(txt);
        System.out.println("Составленный текст: "+txt);

    }

    private static String newText(String txt) {
        if(txt == null) return null;
        //заменяем все кроме букв и цифр пробелами, заменяем множесвенные пробелы пробелами, удаляем пробелы в начале и конце строки
        String str = txt.replaceAll("[^0-9a-zA-Zа-яА-Я]", " ").replaceAll(" +", " ").trim();
        //System.out.println("["+str+"]");
        String[] arrStr = str.split(" ");
        //System.out.println(Arrays.toString(arrStr));
        str = "";
        int j;
        for (int i=0; i<arrStr.length; i++){
            j = arrStr[i].length()-1;
            if(j<0) return "";
            str += arrStr[i].charAt(j);
        }
        return str;
    }

    private static  String getInputData() {
        Scanner scanner = new Scanner(System.in);
        String data;
        data = scanner.nextLine();
        return data;
    }
}
