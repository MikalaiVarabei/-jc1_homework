package homework.three.bank;

public class UserDisplay {

    public void printCashBoxStorage(CashBox[] cashBox) {
        for(int i=0; i<cashBox.length; i++){
            if(cashBox[i] == null) continue;
            System.out.println("Купюр номиналом "+cashBox[i].getDenomination()+" - " +cashBox[i].getQuantity()+"шт.");
        }
        System.out.println("");
    }

    public void printMenuFillStorage() {
        System.out.println("Для внесения денег введите номинал купюры.");
        System.out.println("Для выхода нажмите Q.");
    }

    public void printMenuGetQuantity() {
        System.out.println("Введите количесво купюр.");
        System.out.println("Для выхода нажмите Q.");
    }

    public void printStorageFull() {
        System.out.println("Для нового номинала нет места.");
        System.out.println("Для выхода нажмите Q.");
        System.out.println("");
    }
}
