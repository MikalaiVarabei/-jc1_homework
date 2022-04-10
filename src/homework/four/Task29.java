package homework.four;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task29 {
    public static void main(String[] args) {
        System.out.println("Задание 29");
        System.out.println("Разделите слова, числа пробелом или знаком препинания.");
        System.out.println("Введите текст, по завершению нажмите ENTER.");
        String txt = getInputData();
        System.out.println("Введенный текст: "+txt);

        txt = findHexCode(txt);
        System.out.println("HEX: "+txt);
    }

    private static String findHexCode(String txt){
        if(txt == null) return null;
        //заменяем все кроме букв и цифр пробелами
        txt = " "+txt.replaceAll("[^0-9a-zA-Zа-яА-Я]", "  ")+" ";
        //в начале пробел, 0x1fa21L, в конце пробел, L может не быть
        Pattern pattern = Pattern.compile("\\s[0][x][0-9a-fA-F]+L?\\s");
        Matcher str = pattern.matcher(txt);
        String out="";
        while (str.find()) {
//            System.out.println(txt);
//            System.out.println(getPointerString(str.start()));
            out += getCarsOfRange(txt, str.start()+1, str.end()-1); //1 для исключения пробела
            out += " ";
        }
        return out;
    }

    private static String getCarsOfRange(String inStr, int a, int b){
        String outStr="";
        for (int i=a; i<b; i++){
            outStr += inStr.charAt(i);
        }
        return outStr;
    }

    private static String getPointerString(int j){
        String ps="";
        for (int i=0; i<j; i++){
            ps += " ";
        }
        return ps += "^";
    }

    private static  String getInputData() {
        Scanner scanner = new Scanner(System.in);
        String data;
        data = scanner.nextLine();
        return data;
    }
}
