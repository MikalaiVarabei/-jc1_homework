package homework.five.year;

public enum SeasonYear {
    SPRING,
    SUMMER,
    AUTUMN,
    WINTER;

    private String description;
    private int countOfDays;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getCountOfDays() {
        return countOfDays;
    }

    public void setCountOfDays(int countOfDays) {
        this.countOfDays = countOfDays;
    }
}
