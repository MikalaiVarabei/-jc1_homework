package homework.five.factory;

public class SalaryHourly extends Salary{
    private int sum;
    private int hour;

    public int getSum() {
        return sum;
    }

    public void setSum(int sum) {
        this.sum = sum;
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    @Override
    public void calcSalary() {
        int salary = sum*hour;
        super.setSalary(salary);
        System.out.println("Начислена Почасовая оплата труда");
    }
}
