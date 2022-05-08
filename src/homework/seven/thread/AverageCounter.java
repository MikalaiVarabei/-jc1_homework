package homework.seven.thread;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class AverageCounter {

    private List<Integer> numbers = new ArrayList<>();
    private Double average;

    public AverageCounter() {
        average=null;
    }

    public AverageCounter addNumRandom(int bound, int size){
        Random rand = new Random();
        for(int i=0; i<size; i++){
            numbers.add(i, rand.nextInt(bound));//
        }
        return this;
    }

    public AverageCounter average(){
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

    public Double getAverage(){
        return average;
    }
}
