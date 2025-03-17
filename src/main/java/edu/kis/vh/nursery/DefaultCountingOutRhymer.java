package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    private final int SIZE_NUMBERS = 12;

    private final int ERROR_VALUE = -1;

    private final int STARTING_TOTAL = -1;

    private final int FULL_TOTAL = 11;

    private int[] numbers = new int[SIZE_NUMBERS];

    public int total = -1;

    public void countIn(int in) {
        if (!isFull())
            numbers[++total] = in;
    }

    public boolean callCheck() {
        return total == STARTING_TOTAL;
    }

    public boolean isFull() {
        return total == FULL_TOTAL;
    }

    protected int peekaboo() {
        if (callCheck())
            return ERROR_VALUE;
        return numbers[total];
    }

    public int countOut() {
        if (callCheck())
            return ERROR_VALUE;
        return numbers[total--];
    }

}
