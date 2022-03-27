package homework.three.bank;

public class CashMachine {
    private final UserDisplay userDisplay;
    private final UserButton userButton;
    private final CashBoxStorage cashBoxStorage;

    public CashMachine() {
        this.userDisplay = new UserDisplay();
        this.userButton = new UserButton();
        this.cashBoxStorage = new CashBoxStorage();
    }

    public void work(){
        //добавляем деньги в банкомат
        while (fillCashBoxStorage());

        System.out.println("Выход work()");
    }

    private boolean fillCashBoxStorage() {
        userDisplay.printCashBoxStorage(cashBoxStorage.getCashBox());
        userDisplay.printMenuFillStorage();
        int denomination = userButton.getDataInt();
        if (denomination < 0) return false;
        userDisplay.printMenuGetQuantity();
        int quantity = userButton.getDataInt();
        if (quantity < 0) return false;
        if(!cashBoxStorage.addCash(denomination, quantity)){
            userDisplay.printStorageFull();
        }
        return true;
    }

}
