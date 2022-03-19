package homework.two;

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


    }

}
