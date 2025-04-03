package edu.kis.vh.nursery;

/**
 * Klasa reprezentująca wyliczankę działającą na zasadzie FIFO (First In, First Out).
 * Elementy są wyliczane w kolejności, w jakiej zostały dodane.
 */
public class FIFORhymer extends DefaultCountingOutRhymer {

    private final DefaultCountingOutRhymer temp = new DefaultCountingOutRhymer();

    /**
     * Wylicza element z wyliczanki zgodnie z zasadą FIFO.
     *
     * @return Wyliczony element z wyliczanki. Zwraca -1, jeśli wyliczanka jest pusta.
     */
    @Override
    public int countOut() {
        while (!callCheck())
            temp.countIn(super.countOut());

        int ret = temp.countOut();

        while (!temp.callCheck())
            countIn(temp.countOut());

        return ret;
    }
}