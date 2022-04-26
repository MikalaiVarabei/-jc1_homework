package homework.five.factory;

public class SalaryMixed extends Salary{
    private int sum;
    private int percent;
    private int hour;

    public int getSum() {
        return sum;
    }

    public void setSum(int sum) {
        this.sum = sum;
    }

    public int getPercent() {
        return percent;
    }

    public void setPercent(int percent) {
        this.percent = percent;
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    @Override
    public void calcSalary() {
        int salary = sum*percent+sum*hour;
        super.setSalary(salary);
        System.out.println("Начислена Смешанная оплата труда");
    }
}
