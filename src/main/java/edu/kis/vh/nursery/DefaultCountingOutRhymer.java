package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    private final int SIZE_NUMBERS = 12;

    private final int ERROR_VALUE = -1;

    private final int STARTING_TOTAL = -1;

    private final int MAX_NUMBERS = SIZE_NUMBERS - 1;

    private final int[] numbers = new int[SIZE_NUMBERS];

    private int total = -1;

    public void countIn(int in) {
        if (!isFull())
            numbers[++total] = in;
    }

    public boolean callCheck() {
        return total == STARTING_TOTAL;
    }

    public boolean isFull() {
        return total == MAX_NUMBERS;
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

    public int getTotal() {
        return total;
    }
}

// TODO: Metoda peekaboo jest protected. Być może warto zastanowić się
//       nad jej dostępnością (czy na pewno powinna być dostępna tylko
//       dla klas dziedziczących?)
