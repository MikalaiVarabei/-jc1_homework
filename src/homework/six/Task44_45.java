package homework.six;

public class Task44_45 {
    public static void main(String[] args) {
        System.out.println("Задание 44.");

        try{
            System.out.println(sum(null, 10));
        } catch (MyException e) {
            System.out.println("Exception " + e);
            e.printStackTrace();
        }

        System.out.println("Задание 45.");
        System.out.println(doException(5, null));
    }

    private static Integer sum(Integer a, Integer b) throws MyException {
        if(a==null) throw new MyException("a is null");
        if(b==null) throw new MyException("b is null");
        return a + b;
    }

    private static Integer doException(Integer a, Integer b){
        Integer c=null;
        try{
            c = sum(a, b)*2;
        } catch (MyException e) {
            System.out.println("Exception " + e);
            e.printStackTrace();
        }
        return c;
    }
}

class MyException extends Exception {
    public MyException(String message) {
        super(message);
    }
}
