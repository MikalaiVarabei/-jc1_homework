package homework.five.card;

public class Main {
    public static void main(String[] args){
        BankCard bankCard = new BankCard("1111 2222 3333 4444","Нефтебанк");
        System.out.println(bankCard.getBankName() + " - наименование банка");
        System.out.println(bankCard.getDataMagnetic()+ " - информация прочитана при помощи магнитной полосы");
        System.out.println(bankCard.getDataRf()+ " - информация прочитана при помощи RFID");
        System.out.println(bankCard.getDataChip()+ " - информация прочитана при помощи электронного чипа");
    }
}
