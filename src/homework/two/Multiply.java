package homework.two;

import java.math.BigDecimal;
import java.math.BigInteger;

public class Multiply {

    public BigInteger rangeMultiply(Integer a, Integer b){
        if((a == null)||(b == null)||(a >= b)){
            System.out.println("введено некорректное число");
            return null;
        }

        int n = a;
        BigInteger buff;
        BigInteger res = BigInteger.valueOf(n);

        while(n < b) {
            n++;
            buff = BigInteger.valueOf(n);
            res = res.multiply(buff);
        }
        return res;
    }
}
