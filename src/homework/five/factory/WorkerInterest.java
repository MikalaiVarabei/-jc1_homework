package homework.five.factory;

public class WorkerInterest extends SalaryInterest implements Worker {
    private String fio;
    private String profession;

    public WorkerInterest(String fio, String profession) {
        this.fio = fio;
        this.profession = profession;
    }

    @Override
    public void calcEfficiency() {
        System.out.println(fio + ", "+profession);
        super.calcSalary();
    }
}
