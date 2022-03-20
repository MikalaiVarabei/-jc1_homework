package homework.two;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        System.out.println("********** task12: **********");
        Factorial factorial = new Factorial();
        System.out.println(factorial.calculateFromCicle(10));

        System.out.println("********** task13: **********");
        Multiply ml = new Multiply();
        System.out.println(ml.rangeMultiply(1,25));

        System.out.println("********** task14: **********");
        Digits sm = new Digits();
        System.out.println(sm.calcSumOfDigit(7_893_823_445L));

        System.out.println("********** task15: **********");
        Range num = new Range();
        num.setRange(50, 70);
        System.out.println(num.getPrimeNumber(2));

        System.out.println("********** task16: **********");
        num.setRange(1, 100);
        System.out.println(num.getListDiv(7));

        System.out.println("********** task17: **********");
        System.out.println(sm.separationDigits(-11222333444555L));

        System.out.println("********** task18: **********");
        ArrayTask arr = new ArrayTask();
        arr.setArrRandom();
        System.out.println(Arrays.toString(arr.getArr()));
        System.out.println(arr.getLastElement());

        System.out.println("********** task19: **********");
        arr.setArrRandom();
        System.out.println(Arrays.toString(arr.getArr()));
        System.out.println(Arrays.toString(arr.getElementsOfEvenPosition()));

        System.out.println("********** task20: **********");
        arr.setArrRandom();
        System.out.println(Arrays.toString(arr.getArr()));
        System.out.println(arr.getMaxIndexOfFirstElement());
        System.out.println(arr.getMaxIndexOfLastElement());

        System.out.println("********** task21: **********");
        arr.setArrRandom();
        System.out.println(Arrays.toString(arr.getArr()));
        System.out.println(arr.getSumOfRangeMinMaxElements());

        System.out.println("********** task22: **********");
        arr.setArrRandom();
        System.out.println(Arrays.toString(arr.getArr()));
        arr.reverseArr();
        System.out.println(Arrays.toString(arr.getArr()));

    }

}
