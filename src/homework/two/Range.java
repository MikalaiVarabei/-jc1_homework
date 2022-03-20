package homework.two;

import static java.lang.Math.sqrt;

public class Range {
    private Integer downLimit;
    private Integer upLimit;

    public void setRange(Integer dn, Integer up){
        if((dn == null)||(up == null)||(dn > up)) return;
        downLimit = dn;
        upLimit = up;
    }

    //возвращает простое число с заданным номером из диапазона
    public Integer getPrimeNumber(Integer i){
        if((i == null)||(i < 1)||(downLimit == null)||(upLimit == null)){
            System.out.println("введено некорректное число");
            return null;
        }

        int d = downLimit;
        int n = 1;
        Boolean b;

        while (true){
            b = isPrimeNumber(d);
            if(b == null) return null;
            if(b){       //если число простое
                if(n == i) return d;
                n++;
            }
            if(d == upLimit) break;//дошли до верхней границы
            d++;
        }
        return null;
    }

    // возвращает true если число простое
    public Boolean isPrimeNumber(Integer num) {
        if (num == null) return null;
        if (num < 1) return false;

        for (int i = 2; i <= sqrt(num); i++) {
            if (num % i == 0)
                return false;
        }
        return true;
    }

    
    public StringBuilder getListDiv(Integer div){
        if(div == null) return null;
        StringBuilder list = new StringBuilder("");
        for(int i = downLimit; i <= upLimit; i++){
            if(isDivNumber(i, div)){
                list.append(i + " Hope!" + '\r' + '\n');
            }
        }
        return list;
    }

    public Boolean isDivNumber(Integer num, Integer div){
        if((num == null)||(div == null)) return null;
        if(num%div == 0) return true;
        return false;
    }
}
