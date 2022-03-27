package homework.three.bank;

import java.util.Scanner;

import static homework.three.bank.StateCashMachine.*;

public class UserKeyboard {
    public int getDataInt() {
        Scanner scanner = new Scanner(System.in);
        String numberPattern = "[0-9]{1,6}";
        String exitPattern = "[qQ]";
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

    public String getDataState() {
        Scanner scanner = new Scanner(System.in);
        String pattern = "[iIfFtTqQ]";
        String data;
        for (;;){
            if(scanner.hasNext(pattern)){
                return scanner.next();
            }
            scanner.nextLine();
        }
    }
}
