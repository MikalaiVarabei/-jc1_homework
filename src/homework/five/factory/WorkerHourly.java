package homework.five.factory;

public class WorkerHourly extends SalaryHourly implements Worker {
    private String fio;
    private String profession;

    public WorkerHourly(String fio, String profession) {
        this.fio = fio;
        this.profession = profession;
    }

    @Override
    public void calcEfficiency() {
        System.out.println(fio + ", "+profession);
        super.calcSalary();
    }
}
