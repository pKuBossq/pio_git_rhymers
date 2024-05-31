package edu.kis.vh.nursery;

/**
 * FIFORhymers class inherits from DefaultCountingOutRhymer class
 */
public class FIFORhymer extends DefaultCountingOutRhymer {

    /**
     * Initializing DefaultCountingOutRhymer instance in temp variable
     */
    private final DefaultCountingOutRhymer temp = new DefaultCountingOutRhymer();

    /**
     *
     * @return the number of elements removed from the queue. Implementing a queue data structure using two stacks
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

    /**
     *
     * @return private variable
     */
    public DefaultCountingOutRhymer getTemp() {
        return temp;
    }
}
