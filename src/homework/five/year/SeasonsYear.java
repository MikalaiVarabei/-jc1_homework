package homework.five.year;

import homework.three.bank.StateCashMachine;

public enum SeasonsYear {
    SPRING("Весна",92),
    SUMMER("Лето",92),
    AUTUMN("Осень",91),
    WINTER("Зима",90);

    private String description;
    private int countOfDays;

    SeasonsYear(String description, int countOfDays) {
        this.description = description;
        this.countOfDays = countOfDays;
    }

    public String getDescription() {
        return description;
    }

    public int getCountOfDays() {
        return countOfDays;
    }
}
