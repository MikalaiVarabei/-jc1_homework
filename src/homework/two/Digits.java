package homework.two;

public class Digits {

    //возвращает сумму цифр
    public Integer calcSumOfDigit(Long i){
        if(i == null){
            System.out.println("введено некорректное число");
            return null;
        }

        if(i < 0) i = -i;

        Integer len = calcDigitsOfLong(i);    //подсчитываем количесво разрядов
        if(len == null) return null;
        //System.out.println("число разрядов: " + len);

        Integer[] arr = longToArray(i, len);    //преобразуем число в массив
        if(arr == null) return null;
        //System.out.println(Arrays.toString(arr));

        int n = 0;
        int sum=0;

        while(n < len){
            sum += arr[n];
            n++;
        }

        return sum;
    }

    // преобразует число в строку, группируя цифры по 3 через пробел
    public StringBuilder separationDigits (Long i) {
        if(i == null){
            System.out.println("введено некорректное число");
            return null;
        }

        StringBuilder dig = new StringBuilder("");

        if(i < 0){
            dig.append("-");
            i = -i;
        }

        Integer len = calcDigitsOfLong(i);    //подсчитываем количесво разрядов
        if(len == null) return null;
        Integer[] arr = longToArray(i, len);    //преобразуем число в массив
        if(arr == null) return null;

        int n = 0;
        int s = len-1;
        while (n < len){
            dig.append(arr[n]);
            if(s%3 == 0) dig.append(" ");
            n++;
            s--;
        }

        return dig;
    }

    //преобразует число в массив Integer
    public Integer[] longToArray(Long i, Integer len){
        if((i == null)||(len == null)||(len > 19)||(len < 1)) {
            System.out.println("введено некорректное число");
            return null;
        }

        Integer[] arr = new Integer[len];
        Integer n = len;
        long m = 1L;

        while (n > 0){
            n--;
            arr[n] = Math.toIntExact((i % (m * 10)) / m);
            m *= 10;
        }
        //System.out.println(Arrays.toString(arr));
        return arr;
    }

    //возвращает количесво разрядов в заданном числе
    public Integer calcDigitsOfLong(Long i) {
        if(i == null){
            System.out.println("введено некорректное число");
            return null;
        }

        if(i == 0) return 1;

        int len = 1;
        long n = 10L;

        while (true){
            if(i/n != 0){
                len++;
                if(len > 19) return null;
                n *= 10;
            }
            else
                break;
        }
        //System.out.println("length: " + len);
        return len;
    }
}
