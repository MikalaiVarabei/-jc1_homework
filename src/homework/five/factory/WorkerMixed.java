package homework.five.factory;

public class WorkerMixed extends SalaryMixed implements Worker{
    private String fio;
    private String profession;

    public WorkerMixed(String fio, String profession) {
        this.fio = fio;
        this.profession = profession;
    }

    @Override
    public void calcEfficiency() {
        System.out.println(fio + ", "+profession);
        super.calcSalary();
    }
}
