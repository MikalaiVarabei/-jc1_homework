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

        System.out.println("********** task15: **********");
        Range num = new Range();
        num.setRange(50, 70);
        System.out.println(num.getPrimeNumber(2));

        System.out.println("********** task16: **********");
        num.setRange(1, 100);
        System.out.println(num.getListDiv(7));

        System.out.println("********** task17: **********");
        System.out.println(sm.separationDigits(-11222333444555L));
    }

}
