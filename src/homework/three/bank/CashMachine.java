package homework.three.bank;

import static homework.three.bank.StateCashMachine.*;

public class CashMachine {
    private final UserDisplay userDisplay;
    private final UserKeyboard userKeyboard;
    private final CashBoxStorage cashBoxStorage;
    private final MathCash mathCash;

    private StateCashMachine stateCashMachine;

    public CashMachine() {
        this.userDisplay = new UserDisplay();
        this.userKeyboard = new UserKeyboard();
        this.cashBoxStorage = new CashBoxStorage(1000, 1000, 1000);//конструктор 3-х номиналов
        this.mathCash = new MathCash(cashBoxStorage.getCashBox().length);
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
                    userDisplay.printAllSum(mathCash.getSumCash(cashBoxStorage.getCashBox()));
                    stateCashMachine = START;
                    break;

                case FILL_CASH: //добавляем деньги в банкомат
                    while (fillCashBoxStorage());
                    stateCashMachine = START;
                    break;

                case GIVE_CASH: //снимаем деньги
                    giveCash();
                    stateCashMachine = START;
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

    private boolean giveCash() {
        int maxSumCash = mathCash.getSumCash(cashBoxStorage.getCashBox());
        if(maxSumCash == 0) {
            userDisplay.printNoCash();
            return false;
        }
        userDisplay.printAllCachDenomination(cashBoxStorage.getCashBox());  //вывод купюр имеющиеся в банкомате
        userDisplay.printMaxSum(maxSumCash);                                //вывод максимальной суммы
        int giveSum = userKeyboard.getDataInt();
        if (giveSum < 0) return false;
        //копируем состояние хранилища
        if(!mathCash.setCashBuffer(cashBoxStorage)) return false;//TODO check error
        boolean operation = mathCash.giveCashFromBuffer(giveSum);//TODO check the sum is a multiple 160, 180
//        if(operation == false) {
//            if(!mathCash.setCashBuffer(cashBoxStorage)) return false;//TODO check error
//            operation = mathCash.giveCashFromBuffer2(giveSum);
//        }
        //максимальной суммы, возможности выдачи суммы
        while ((giveSum>maxSumCash) || (operation == false)) {
            userDisplay.printNoOperation();
            userDisplay.printMaxSum(maxSumCash);                                //максимальная сумма
            userDisplay.printUotOfMenu();
            giveSum = userKeyboard.getDataInt();
            if (giveSum < 0) return false;
            if(giveSum>maxSumCash) continue;
            if(!mathCash.setCashBuffer(cashBoxStorage)) return false;//TODO check error
            operation = mathCash.giveCashFromBuffer(giveSum);

//            if(operation == false) {
//                if(!mathCash.setCashBuffer(cashBoxStorage)) return false;//TODO check error
//                operation = mathCash.giveCashFromBuffer2(giveSum);
//
//            }
            //userDisplay.printCashBuffer(mathCash.getCashBuff());
        }

        if(!giveCashFromStorage()) return false;    //TODO check error
        //userDisplay.printCashBuffer(mathCash.getCashBuff());
        userDisplay.printGiveCashBuffer(mathCash.getCashBuff());//купюры к выдаче

        return true;
    }

    private boolean giveCashFromStorage() {
        for(int i=0; i<cashBoxStorage.getCashBox().length; i++){
            int nominal = mathCash.getCashBuff()[i].getNominal();
            int quantity = mathCash.getCashBuff()[i].getGiveQuantity();
            if(!cashBoxStorage.changeCashBoxStorage(nominal, quantity)) return false;
        }
        return true;
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
