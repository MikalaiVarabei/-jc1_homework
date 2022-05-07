package homework.six;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collector;

public class Task42 {

    public static void main(String[] args) {

        System.out.println("Задание 42.");
        System.out.println("Введите слова через пробел.");
        //String str = "qwe asd zxc qwe ert fgh cvb ert";
        String str = getInputData();
        System.out.println("Map: "+strToMap(str, " "));
    }

    private static  String getInputData() {
        Scanner scanner = new Scanner(System.in);
        String data;
        data = scanner.nextLine();
        return data;
    }

    private static Map strToMap(String str, String regex){
        if((str == null)||(regex == null)) return null;
        Map<String, Integer> map = new HashMap<>();
        String[] arrStr = str.split(regex);
        Integer val=0;
        for (String element: arrStr){
            if(map.containsKey(element)){
                val = map.get(element).intValue();
                val = val!=null?val+1:val;
                map.put(element, val);
            }
            else{
                if(element.length()>0){
                    map.put(element, 1);
                }
            }
        }
        return map;
    }
}
