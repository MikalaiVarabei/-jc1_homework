package homework.three.bank;

import java.util.Scanner;

public class UserButton {
    public int getDataInt() {
        Scanner scanner = new Scanner(System.in);
        String numberPattern = "[0-9]";
        String exitPattern = "[qQйЙ]";
        int data=-1;
        for (;;){
            if(scanner.hasNext(numberPattern)) {
                data = scanner.nextInt();
                break;
            }
            else if(scanner.hasNext(exitPattern)){
                data = -1;
                break;
            }
            scanner.nextLine();
        }
        return data;
    }
}
