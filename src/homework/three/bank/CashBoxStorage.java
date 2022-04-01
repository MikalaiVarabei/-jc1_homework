package homework.three.bank;

public class CashBoxStorage {
    private CashBox[] cashBox;

    public CashBoxStorage(int len) {
        cashBox = new CashBox[len];
    }

    public CashBoxStorage(int quantity1, int quantity2, int quantity3) {
        cashBox = new CashBox[3];
        cashBox[0] = new CashBox(20, quantity1);
        cashBox[1] = new CashBox(50, quantity2);
        cashBox[2] = new CashBox(100, quantity3);
    }

    public boolean addCash(int denomination, int quantity){
        int i;
        for(i=0; i < cashBox.length; i++){
            //вносим новый номинал
            if(cashBox[i] == null) {
                cashBox[i] = new CashBox(denomination, quantity);
                break;
            }
            //пополняем сущесвующий номинал
            if(denomination == cashBox[i].getNominal()) {
                cashBox[i].changeQuantity(quantity);
                break;
            }
        }
        if(i == cashBox.length) return false;
        return true;
    }



    public CashBox[] getCashBox() {
        return cashBox;
    }

    public boolean changeCashBoxStorage(int nominal, int quantity) {
        for (int i=0; i<cashBox.length; i++){
            if(cashBox[i] == null) continue;
            if(cashBox[i].getNominal() == nominal){
                if(cashBox[i].getQuantity() < quantity) return false;
                cashBox[i].changeQuantity(-quantity);
                return true;
            }
        }
        return false;
    }
}
