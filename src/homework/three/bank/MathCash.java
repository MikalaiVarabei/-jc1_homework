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
            while(true){
                if((givSum > (cashBuff[i].nominal*2))) {
                    if(cashBuff[i].quantity > 0){
                        cashBuff[i].quantity--;
                        cashBuff[i].giveQuantity++;
                        givSum -= cashBuff[i].nominal;
                        sum += cashBuff[i].nominal;
                    }
                    else break;
                }
                else if((givSum > cashBuff[i].nominal)&&((getModuleSum(i, givSum)==0))) {//||(serchModuleSum(i,givSum)==0)
                    if(cashBuff[i].quantity > 0){
                        cashBuff[i].quantity--;
                        cashBuff[i].giveQuantity++;
                        givSum -= cashBuff[i].nominal;
                        sum += cashBuff[i].nominal;
                    }
                    else break;
                }
                else break;
            }

            if(getModule(givSum, cashBuff[i].nominal) == 0){
                while(true) {
                    if (givSum >= (cashBuff[i].nominal)) {
                        if (cashBuff[i].quantity > 0) {
                            cashBuff[i].quantity--;
                            cashBuff[i].giveQuantity++;
                            givSum -= cashBuff[i].nominal;
                            sum += cashBuff[i].nominal;
                        }
                        else break;
                    }
                    else break;
                }
            }
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

    private CashBuffer getMinimalBanknote() {
        int buffer=Integer.MAX_VALUE;
        int index=0;
        int i;
        for(i=0; i<cashBuff.length; i++){
            if(cashBuff[i] == null) continue;
            //находим минимальную досупную купюру
            if((buffer > cashBuff[i].getNominal())&&(cashBuff[i].getQuantity() > 0)) {
                buffer = cashBuff[i].getNominal();
                index = i;
            }
        }
        if(buffer==Integer.MAX_VALUE) return null;
        return  cashBuff[index];
    }

    private CashBuffer getMaximalBanknote() {
        int buffer=0;
        int index=0;
        int i;
        for(i=0; i<cashBuff.length; i++){
            if(cashBuff[i] == null) continue;
            //находим минимальную досупную купюру
            if((buffer < cashBuff[i].getNominal())&&(cashBuff[i].getQuantity() > 0)) {
                buffer = cashBuff[i].getNominal();
                index = i;
            }
        }
        if(buffer==0) return null;
        return  cashBuff[index];
    }

    private CashBuffer getPreviousBanknote(int i) {
        for (i+=1; i<cashBuff.length; i++){
            if(cashBuff[i].quantity < 1) continue;
            return cashBuff[i];
        }
        return cashBuff[cashBuff.length-1];
    }

//    private int getModuleSum(int j, int x, int y){
//        int c = x/y;
//        c = x*c;
//        for (int i=j; i<cashBuff.length; i++){
//            if(getModule(y-c, getPreviousNominal(i))==0) return 0;
//        }
//
//        return 1;
//    }

    private int getModuleSum(int j, int sum){
        int ost = getModule(sum, cashBuff[j].nominal);
        if(ost==0) return 0;
        int i=j+1;
        if(i>=cashBuff.length) return -1;
        return getModuleSum(i, ost);
    }

    private int serchModuleSum(int j, int sum){
        for(int i=j; i<cashBuff.length; i++){
            int ost = getModule(sum, cashBuff[i].nominal);
            if(ost==0) return 0;
        }
        return -1;
    }

    private int getModule(int x, int y) {
        if(y==0) return -1;
        return x%y;
    }

    private int getPreviousNominal(int j){
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
