package homework.six;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Task39 {

    static void addGradeRandom(List<Integer> list, int size){
        Random rand = new Random();
        for(int i=0; i<size; i++){
            list.add(i, rand.nextInt(10));//
        }
    }

    static void removeGrade(List<Integer> list, int lim){
        for(int i=0; i<list.size(); i++){
            if ((list.get(i) == null)||(list.get(i) > lim)) continue;
            list.remove(i);
            i--;
        }
    }

    public static void main(String[] args){
        List<Integer> grade = new ArrayList<>(30);
        addGradeRandom(grade, 30);
        System.out.println(grade);
        removeGrade(grade, 3);//от 3 и ниже удаляем
        System.out.println(grade);
    }

}
