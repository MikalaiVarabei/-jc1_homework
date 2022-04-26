package homework.five.factory;

public class SalaryInterest  extends Salary{
    private int sum;
    private int percent;

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

    @Override
    public void calcSalary() {
        int salary = sum*percent;
        super.setSalary(salary);
        System.out.println("Начислена Процентная оплата труда");
    }
}
