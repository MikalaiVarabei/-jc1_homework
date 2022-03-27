package homework.three.bank;

public class UserDisplay {

    public void printCashBoxStorage(CashBox[] cashBox) {
        System.out.println("ЯЧЕЙКИ БАНКОМАТА");
        for(int i=0; i<cashBox.length; i++){
            if(cashBox[i] == null) continue;
            System.out.println("Купюр номиналом "+cashBox[i].getDenomination()+cashBox[i].getName()+" ("+cashBox[i].getCountry() + ") "+" - " +cashBox[i].getQuantity()+"шт.");
        }
        System.out.println("");
    }

    public void printStartMenu() {
        System.out.println("-----------------------------------------------");
        System.out.println(" ГЛАВНОЕ МЕНЮ");
        System.out.println(" I - получение информации об имеющихся купюрах");
        System.out.println(" F - добавление денег в банкомат");
        System.out.println(" T - снятие денег (в разработке)");
        System.out.println(" Q - выход из программы");
        System.out.println("-----------------------------------------------");
    }

    public void printMenuFillStorage(CashBox[] cashBox) {
        System.out.println("МЕНЮ ВНЕСЕНИЯ ДЕНЕГ");
        System.out.println("В банкомате установлены ячейки для "+cashBox.length+"-х номиналов купюр.");
        System.out.println("Для внесения денег введите номинал купюры.");
        System.out.println("Q - выход из меню");
    }

    public void printMenuGetQuantity() {
        System.out.println("Введите количесво купюр.");
        System.out.println("Q - выход из меню");
    }

    public void printStorageFull() {
        System.out.println("Внимание! Для нового номинала нет свободных ячеек.");
        System.out.println("Q - выход из меню");
        System.out.println("");
    }


}
