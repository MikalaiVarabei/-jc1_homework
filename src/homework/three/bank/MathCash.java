package homework.three.bank;

public class MathCash {

    class CashBuffer {
        private int nominal;
        private int quantity;
        private int giveQuantity;

        public CashBuffer(int nominal, int quantity) {
            this.nominal = nominal;
            this.quantity = quantity;
            giveQuantity=0;
        }

        public int getNominal() {
            return nominal;
        }

        public int getQuantity() {
            return quantity;
        }

        public int getGiveQuantity() {
            return giveQuantity;
        }
    }
    private CashBuffer[] cashBuff;

    public MathCash(int len) {
        cashBuff = new CashBuffer[len];
    }

    public CashBuffer[] getCashBuff() {
        return cashBuff;
    }

    public boolean giveCashFromBuffer(int givSum) {
        int count=0;
        int sum=0;
        sortCashBufferMaxToMin();//сортируем буфер по убыванию номинала
        for(int i=0; i< cashBuff.length; i++){
            if(getModuleSum(i, givSum, cashBuff[i].nominal) != true) continue;
            count = givSum/cashBuff[i].nominal;
            if(count > cashBuff[i].quantity) count = cashBuff[i].quantity;
            cashBuff[i].quantity -= count;
            cashBuff[i].giveQuantity = count;
            givSum -= count*cashBuff[i].nominal;
            sum += count*cashBuff[i].nominal;
//            System.out.println("ном: "+ cashBuff[i].nominal + ", шт: " + cashBuff[i].giveQuantity);
//            System.out.println("sum: "+sum+", givSum: "+givSum);
            if(givSum == 0) return true;
        }
        return false;
    }

    public boolean setCashBuffer(CashBoxStorage cashBoxStorage) {
        CashBox[] cashBox = cashBoxStorage.getCashBox();
        if(this.cashBuff.length != cashBox.length) return false;
        for(int i=0; i<this.cashBuff.length; i++){
            if(cashBoxStorage.getCashBox() == null) {
                this.cashBuff[i] = null;
                continue;
            }
            this.cashBuff[i] = new CashBuffer(cashBox[i].getNominal(), cashBox[i].getQuantity());
        }
        return true;
    }

    private void sortCashBufferMaxToMin() {
        int buffNom;
        int buffQnt;
        for(int i=0; i<cashBuff.length; i++){
            for (int j=0; j<cashBuff.length; j++){
                if(cashBuff[i].nominal > cashBuff[j].nominal){
                    buffNom = cashBuff[i].nominal;
                    buffQnt = cashBuff[i].quantity;
                    cashBuff[i].nominal = cashBuff[j].nominal;
                    cashBuff[i].quantity = cashBuff[j].quantity;
                    cashBuff[j].nominal = buffNom;
                    cashBuff[j].quantity = buffQnt;
                }
            }
        }
    }

    private CashBox getMinimalBanknote(CashBox[] cashBox) {
        int buffer=Integer.MAX_VALUE;
        int index=0;
        int i;
        for(i=0; i<cashBox.length; i++){
            if(cashBox[i] == null) continue;
            //находим минимальную досупную купюру
            if((buffer > cashBox[i].getNominal())&&(cashBox[i].getQuantity() > 0)) {
                buffer = cashBox[i].getNominal();
                index = i;
            }
        }
        if(buffer==Integer.MAX_VALUE) return null;
        return  cashBox[index];
    }

    private boolean getModuleSum(int j, int x, int y){
        int c = x/y;
        c = x*c;
        for (int i=j; i<cashBuff.length; i++){
            if(getModule(y-c, getMinimalNominal(i))==0) return true;
        }

        return false;
    }

    private int getModule(int x, int y) {
        if(y==0) return -1;
        return x%y;
    }

    private int getMinimalNominal(int j){
        for (int i=j; i<cashBuff.length; i++){
            if(cashBuff[i].quantity < 1) continue;
            return cashBuff[i].nominal;
        }
        return 0;
    }

    public int getSumCash(CashBox[] cashBox) {
        int sum=0;
        for(int i=0; i<cashBox.length; i++){
            if(cashBox[i] == null) continue;
            sum += (cashBox[i].getNominal() * cashBox[i].getQuantity());
        }
        return  sum;
    }


}
