package homework.six;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Task40 {
    static void addNumRandom(List<Integer> list, int size){
        Random rand = new Random();
        for(int i=0; i<size; i++){
            list.add(i, rand.nextInt(10));//
        }
    }

    static void removeRepNum(List<Integer> list){
        Integer buff;
        for(int i=0; i<list.size(); i++){
            buff = list.get(i);
            for (int j=(i+1); j<list.size(); j++){
                if(list.get(j) != buff) continue;
                list.remove(j);
                j--;
            }
        }
    }

    public static void main(String[] args){
        List<Integer> num = new ArrayList<>(100);
        addNumRandom(num, 100);
        System.out.println(num);
        removeRepNum(num);
        System.out.println(num);
    }
}
