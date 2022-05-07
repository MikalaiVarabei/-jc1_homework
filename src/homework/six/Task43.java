package homework.six;

public class Task43 {
    public static void main(String[] args) {

        System.out.println("Задание 43.");
        int i=0;
        Integer j=null;
        try {
            i=j;
        }
        catch (NullPointerException e){
            System.out.println("Exception: "+e);
            e.printStackTrace();
        }
    }
}
