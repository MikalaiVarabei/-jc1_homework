package homework.two;

import java.util.Random;

public class ArrayTask {
    private Integer size = 10;
    private Integer arr[] = new Integer[size];

    public void setArrRandom(){
        Random rand = new Random();
        for(int i=0; i<arr.length; i++){
            arr[i] = rand.nextInt(100);
        }
    }

    public Integer[] getArr(){
        return arr;
    }

    public Integer getLastElement(){
        return arr[arr.length-1];
    }

    public Integer[] getElementsOfEvenPosition(){
        Integer pos[] = new Integer[size/2];
        int j=0;
        for (int i=0; i<arr.length; i++) {
            if(i%2 == 0) {
                if(j > pos.length) return null;
                pos[j++] = arr[i];
            }
        }
        return pos;
    }

    public Integer getMaxIndexElement(){
        int buff = 0;
        for (int i=0; i<arr.length; i++) {
            if(buff < arr[i]) buff = arr[i];
        }
        for (int i=0; i<arr.length; i++) {
            if(buff == arr[i]) return i;
        }
        return null;
    }


}
