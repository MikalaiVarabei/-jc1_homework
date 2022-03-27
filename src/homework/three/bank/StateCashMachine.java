package homework.three.bank;

public enum StateCashMachine {
    START("S"),
    INFO("I"),
    FILL_CASH("F"),
    TAKE_CASH("T"),
    QUIT("Q");

    private String state;

    private StateCashMachine(String state) {
        this.state = state;
    }

    public StateCashMachine getValue(String data) {
        if (("I".equals(data))||("i".equals(data)))  return INFO;
        if (("F".equals(data))||("f".equals(data)))  return FILL_CASH;
        if (("T".equals(data))||("t".equals(data)))  return TAKE_CASH;
        if (("Q".equals(data))||("q".equals(data)))  return QUIT;
        return null;
    }
}
