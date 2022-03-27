package homework.three.bank;

import static homework.three.bank.StateCashMachine.*;

public class CashMachine {
    private final UserDisplay userDisplay;
    private final UserKeyboard userKeyboard;
    private final CashBoxStorage cashBoxStorage;

    private StateCashMachine stateCashMachine;

    public CashMachine() {
        this.userDisplay = new UserDisplay();
        this.userKeyboard = new UserKeyboard();
        this.cashBoxStorage = new CashBoxStorage(10_000, 10_000, 10_000);
    }

    public void work(){
        stateCashMachine = START;
        while (stateCashMachine != QUIT) {
            switch (stateCashMachine) {
                case START:
                    userDisplay.printStartMenu();
                    stateCashMachine = stateCashMachine.getValue(userKeyboard.getDataState());
                    break;

                case INFO:  //отображаем количесво купюр
                    userDisplay.printCashBoxStorage(cashBoxStorage.getCashBox());
                    stateCashMachine = START;
                    break;

                case FILL_CASH: //добавляем деньги в банкомат
                    while (fillCashBoxStorage()) ;
                    stateCashMachine = START;
                    break;

                case TAKE_CASH: //снимаем деньги
                    stateCashMachine = START;//TODO: add take method
                    break;

                case QUIT:
                    break;

                default:
                    stateCashMachine = START;
                    break;
            }
        }
        System.out.println("Выход");
    }



    private boolean fillCashBoxStorage() {
        userDisplay.printCashBoxStorage(cashBoxStorage.getCashBox());
        userDisplay.printMenuFillStorage(cashBoxStorage.getCashBox());
        int denomination = userKeyboard.getDataInt();
        if (denomination < 0) return false;
        userDisplay.printMenuGetQuantity();
        int quantity = userKeyboard.getDataInt();
        if (quantity < 0) return false;
        if(!cashBoxStorage.addCash(denomination, quantity)){
            userDisplay.printStorageFull();
        }
        return true;
    }

}
