package homework.three.bank;

public class UserDisplay {

    public void printCashBoxStorage(CashBox[] cashBox) {
        System.out.println("ЯЧЕЙКИ БАНКОМАТА");
        for(int i=0; i<cashBox.length; i++){
            if(cashBox[i] == null) continue;
            System.out.println("Купюр номиналом "+cashBox[i].getNominal()+" "+cashBox[i].getName()+" ("+cashBox[i].getCountry() + ") "+" - " +cashBox[i].getQuantity()+"шт.");
        }
        System.out.println("");
    }

    public void printGiveCashBuffer(MathCash.CashBuffer[] cashBuff) {
        System.out.println("КУПЮРЫ К ВЫДАЧЕ");
        for(int i=0; i<cashBuff.length; i++){
            if((cashBuff[i] == null)||(cashBuff[i].getGiveQuantity() == 0)) continue;

            System.out.println(" номинал "+cashBuff[i].getNominal()+" - " +cashBuff[i].getGiveQuantity()+"шт.");
        }
        System.out.println("");
    }

    public void printCashBuffer(MathCash.CashBuffer[] cashBuff) {
        for(int i=0; i<cashBuff.length; i++){
            if(cashBuff[i] == null) continue;
            System.out.println("Буфер: номинал "+cashBuff[i].getNominal()+" - " +cashBuff[i].getQuantity()+"шт.");
        }
        System.out.println("");
    }

    public void printStartMenu() {
        System.out.println("-----------------------------------------------");
        System.out.println(" ГЛАВНОЕ МЕНЮ");
        System.out.println(" I - получение информации об имеющихся купюрах");
        System.out.println(" F - добавление денег в банкомат");
        System.out.println(" G - снятие денег");
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
    }

    public void printStorageFull() {
        System.out.println("Внимание! Для нового номинала нет свободных ячеек.");
        System.out.println("");
    }

    public void printAllCachDenomination(CashBox[] cashBox) {
        System.out.println("ДОСТУПНЫЕ КУПЮРЫ");
        for(int i=0; i<cashBox.length; i++){
            if(cashBox[i] == null) continue;
            System.out.println(" "+cashBox[i].getNominal()+cashBox[i].getName()+" ("+cashBox[i].getCountry() + ") ");
        }
        System.out.println("");
    }

    public void printEnterSum(CashBox cashBox) {
        System.out.println("Введите сумму кратную "+cashBox.getNominal()+" " + cashBox.getName());
    }

    public void printMaxSum(int maxSumCash) {
        System.out.println("Максимальная сумма "+maxSumCash);
    }

    public void printAllSum(int sumCash) {
        System.out.println("Общая сумма: " + sumCash);
    }

    public void printUotOfMenu() {
        System.out.println("Q - выход из меню");
    }


    public void printNoCash() {
        System.out.println("В банкомате закончились деньги!");
        System.out.println(" ");
    }
}
