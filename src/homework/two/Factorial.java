package homework.two;

public class Factorial {

    public Long factorial(Integer i){
        if((i == null)||(i < 1)||(i > 10)){
            System.out.println("введено некорректное число");
            return null;
        }

        int n = 1;
        int j = i;
        long fl = 1L;

        while (j > 0) {
            //отсуствует проверка на переполнение, если нужно могу добавить
            fl = fl * n;
            n++;
            j--;
        }
        return fl;
    }
}
