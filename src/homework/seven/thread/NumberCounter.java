package homework.seven.thread;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

public class NumberCounter {

    private List<Integer> numbers = new ArrayList<>();
    private Double average;
    private Integer max;

    public NumberCounter() {
        average=null;
        max=null;
    }

    public NumberCounter addNumRandom(int bound, int size){
        Random rand = new Random();
        for(int i=0; i<size; i++){
            numbers.add(i, rand.nextInt(bound));//
        }
        return this;
    }

    public NumberCounter averageCounter(){
        if(numbers == null || numbers.isEmpty()){
            return this;
        }
        double sum=0;
        for (Integer number:numbers) {
            //assumption that we do not have max int values
            if(number == null){
                continue;
            }
            sum += number;
        }
        average = sum/numbers.size();
        return  this;
    }

    public NumberCounter maxCounter(){
        if(numbers == null || numbers.isEmpty()){
            return this;
        }

        Iterator<Integer> iterator = numbers.iterator();
        Integer buff=null;
        Integer elem=0;
        while (iterator.hasNext()){
            elem = iterator.next();
            if(elem != null){
                if(buff == null) buff = elem;
                else if(elem > buff) buff =  elem;
            }

        }
        max=buff;
        return  this;
    }

    public List<Integer> getNumbers() {
        return numbers;
    }

    public String getAverageRes(){
        return numbers+", average: "+average;
    }

    public String getMaxRes() {
        return numbers+", maximum: "+max;
    }
}
