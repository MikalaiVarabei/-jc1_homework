package homework.two;

import java.util.Random;

import static java.lang.Math.abs;

public class ArrayTask {
    private Integer size = 10;
    private Integer arr[] = new Integer[size];

    public void setArrRandom(){
        Random rand = new Random();
        for(int i=0; i<arr.length; i++){
            arr[i] = rand.nextInt(100);
        }
    }

    public void reverseArr(){
        int buff;
        int e = arr.length-1;
        for(int i=0; i < (arr.length/2); i++){
            buff = arr[i];
            arr[i] = arr[e];
            arr[e] = buff;
            e--;
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

    //возвращает индекс последнего максимального элемента
    public Integer getMaxIndexOfLastElement(){
        int buff = Integer.MIN_VALUE;
        //находим максимальный элемент
        for (int i=0; i<arr.length; i++) {
            if(buff < arr[i]) buff = arr[i];
        }
        Integer index = null;
        //находим последний индекс элемента
        for (int i=0; i<arr.length; i++) {
            if(buff == arr[i]) index = i;
        }
        return index;
    }
    //возвращает индекс первого максимального элемента
    public Integer getMaxIndexOfFirstElement(){
        int buff = Integer.MIN_VALUE;
        //находим максимальный элемент
        for (int i=0; i<arr.length; i++) {
            if(buff < arr[i]) buff = arr[i];
        }
        //находим последний индекс элемента
        for (int i=0; i<arr.length; i++) {
            if(buff == arr[i]) return i;
        }
        return null;
    }
    //возвращает индекс последнего минимального элемента
    public Integer getMinIndexOfLastElement(){
        int buff = Integer.MAX_VALUE;
        for (int i=0; i<arr.length; i++) {
            if(buff > arr[i]) buff = arr[i];
        }
        Integer index = null;
        for (int i=0; i<arr.length; i++) {
            if(buff == arr[i]) index = i;
        }
        return index;
    }
    //возвращает индекс первого минимального элемента
    public Integer getMinIndexOfFirstElement(){
        int buff = Integer.MAX_VALUE;
        for (int i=0; i<arr.length; i++) {
            if(buff > arr[i]) buff = arr[i];
        }
        for (int i=0; i<arr.length; i++) {
            if(buff == arr[i]) return i;
        }
        return null;
    }

    //возвращает сумму элементов из заданного диапазона
    public Integer getSumOfRangeElements(Integer a, Integer b){
        if((a == null)||(b == null)||(a < 0)||(b < 0)||(a >= arr.length)||(b >= arr.length)) return null;
        Integer sum = 0;
        if(b > a){
            for (int i = a; i <= b; i++){
                sum += arr[i];
            }
        }
        else {
            for (int i = b; i <= a; i++){
                sum += arr[i];
            }
        }
        return sum;
    }

    public Integer getSumOfRangeMinMaxElements(){
        Integer ind[][] = new Integer[2][2];
        ind[0][0] = getMinIndexOfFirstElement();   //первый минимальный
        ind[0][1] = getMinIndexOfLastElement();    //последний минимальный
        ind[1][0] = getMaxIndexOfFirstElement();   //первый максимальный
        ind[1][1] = getMaxIndexOfLastElement();    //последний максимальный

//        System.out.println(Arrays.toString(ind[0]));
//        System.out.println(Arrays.toString(ind[1]));

        Integer buff=0;
        Integer indBuff[] = new Integer[2];

        for (int i=0; i<2; i++){
            for(int j=0; j<2; j++){
                //определяем максимальную разницу между индексами
                if(buff < abs(ind[0][i] - ind[1][j])){
                    buff = abs(ind[0][i] - ind[1][j]);
                    //сохраняем индексы в массив
                    indBuff[0] = ind[0][i];
                    indBuff[1] = ind[1][j];
                }
            }
        }

        if ((indBuff[0] != null)&&(indBuff[1] != null)){
            return getSumOfRangeElements(indBuff[0], indBuff[1]);
        }
        return null;
    }

}
