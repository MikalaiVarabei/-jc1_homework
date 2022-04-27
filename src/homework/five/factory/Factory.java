package homework.five.factory;

public class Factory {
    Worker operator;
    Worker security;
    Worker chief;

    public Factory() {
        operator = new WorkerInterest("работник-1", "оператор станка");
        security = new WorkerHourly("работник-2", "охранник");
        chief = new WorkerMixed("работник-3", "начальник цеха");
    }

    public void allCalc(){
        operator.calcEfficiency();
        security.calcEfficiency();
        chief.calcEfficiency();
    }

    public static void main (String[] args){
        Factory factory = new Factory();

        factory.allCalc();
    }
}
