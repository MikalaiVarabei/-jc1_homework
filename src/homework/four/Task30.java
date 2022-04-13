package homework.four;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task30 {
    public static void main(String[] args) {
        System.out.println("Задание 30");
        System.out.println("Введите текст, по завершению нажмите ENTER.");
        String txt = getInputData();
        //test();
        //System.out.println("Введенный текст: "+txt);

        txt = replaceTags(findTags(txt));
        System.out.println("Результат: "+txt);
    }

    private static String replaceTags(String txt){
        if(txt == null) return null;
        txt = txt.replaceAll("<[p](( +)[a-z]+=( +)?\"(.+)?\")>", "<p>");
        return txt;
    }

    private static String findTags(String txt){
        if(txt == null) return null;
        Pattern pattern = Pattern.compile("<[p](( +)[a-z]+( +)?=( +)?\"(.+)?\")?>(.+)?</[p]>");
        Matcher str = pattern.matcher(txt);
        String out="";
        while (str.find()) {
            out += getCarsOfRange(txt, str.start(), str.end());
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

    private static  String getInputData() {
        Scanner scanner = new Scanner(System.in);
        String data;
        data = scanner.nextLine();
        return data;
    }

    private static void test(){
        String txt="<p></p>";
        txt = findTags(txt);
        System.out.println("tags: "+txt);
        txt = replaceTags(txt);
        System.out.println("tags: "+txt);
        System.out.println("");

        txt="<p id=\"1\">j</p>";
        txt = findTags(txt);
        System.out.println("tags: "+txt);
        txt = replaceTags(txt);
        System.out.println("tags: "+txt);
        System.out.println("");

        txt="<p>jfff</p>";
        txt = findTags(txt);
        System.out.println("tags: "+txt);
        txt = replaceTags(txt);
        System.out.println("tags: "+txt);
        System.out.println("");
    }
}
