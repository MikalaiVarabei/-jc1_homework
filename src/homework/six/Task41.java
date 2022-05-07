package homework.six;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

public class Task41 {

    static void addGradeRandom(List<Integer> list, int size){
        Random rand = new Random();
        for(int i=0; i<size; i++){
            list.add(i, rand.nextInt(10));//
        }
    }

    // Возвращаем максимальное чило
    // Если список пуст или все элементы null, возвращаем  null
    static Integer findMax(List<Integer> list){
        Iterator<Integer> iterator = list.iterator();
        Integer buff=null;
        Integer elem=0;
        while (iterator.hasNext()){
            elem = iterator.next();
            if(elem != null){
                if(buff == null) buff = elem;
                else if(elem > buff) buff =  elem;
            }

        }
        return buff;
    }

    public static void main(String[] args){
        List<Integer> grade = new ArrayList<>(30);
        addGradeRandom(grade, 30);
        System.out.println("Список оценок: "+grade);
        System.out.println("Максимальная оценка: " + findMax(grade));
    }
}
