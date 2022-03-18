package homework.two;

public class Factorial {

    public Long calculateFromCicle(Integer i){
        if((i == null)||(i < 0)||(i > 10)){
            System.out.println("введено некорректное число");
            return null;
        }

        if(i == 0) return 1L;

        int n = 1;
        long fl = 1L;

        while (n <= i) {
            fl = fl * n;
            n++;
        }
        return fl;
    }
}
