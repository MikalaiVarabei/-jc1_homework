package homework.five.factory;

public abstract class Salary {
    private int salary;

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public abstract void calcSalary();
}
