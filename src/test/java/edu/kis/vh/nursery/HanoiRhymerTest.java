package edu.kis.vh.nursery;

import org.junit.Assert;
import org.junit.Test;

public class HanoiRhymerTest {

    @Test
    public void testRejectingHigherNumbers() {
        HanoiRhymer rhymer = new HanoiRhymer();
        rhymer.countIn(5);
        rhymer.countIn(3);
        rhymer.countIn(7); // Odrzucone (7 > 3)
        rhymer.countIn(2);
        rhymer.countIn(9); // Odrzucone (9 > 2)

        Assert.assertEquals(2, rhymer.reportRejected());
    }

    @Test
    public void testAcceptingLowerNumbers() {
        HanoiRhymer rhymer = new HanoiRhymer();
        rhymer.countIn(5);
        rhymer.countIn(3);
        rhymer.countIn(2);
        rhymer.countIn(1);

        Assert.assertEquals(0, rhymer.reportRejected());
    }

    @Test
    public void testStartingEmpty() {
        HanoiRhymer rhymer = new HanoiRhymer();
        Assert.assertEquals(0, rhymer.reportRejected());
    }

    @Test
    public void testCorrectCountingOut() {
        HanoiRhymer rhymer = new HanoiRhymer();
        rhymer.countIn(5);
        rhymer.countIn(3);

        Assert.assertEquals(3, rhymer.countOut());
        Assert.assertEquals(5, rhymer.countOut());
    }
}