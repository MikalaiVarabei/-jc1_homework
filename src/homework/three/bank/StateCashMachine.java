package homework.three.bank;

public enum StateCashMachine {
    START("S"),
    INFO("I"),
    FILL_CASH("F"),
    GIVE_CASH("T"),
    QUIT("Q");

    private String state;

    private StateCashMachine(String state) {
        this.state = state;
    }

    public StateCashMachine getValue(String data) {
        if (("I".equals(data))||("i".equals(data)))  return INFO;
        if (("F".equals(data))||("f".equals(data)))  return FILL_CASH;
        if (("G".equals(data))||("g".equals(data)))  return GIVE_CASH;
        if (("Q".equals(data))||("q".equals(data)))  return QUIT;
        return null;
    }
}
