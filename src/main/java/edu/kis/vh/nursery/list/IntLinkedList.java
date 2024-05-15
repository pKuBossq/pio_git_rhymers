package edu.kis.vh.nursery.list;

public class IntLinkedList {

    private final int LINKED_LIST_DEFAULT_NEGATIVE_VALUE = -1;
    private Node last;
    private int i;

    public void push(int i) {
        if (last == null)
            last = new Node(i);
        else {
            last.setNext(new Node(i));
            last.getNext().setPrev(last);
            last = last.getNext();
        }
    }

    public boolean isEmpty() {
        return last == null;
    }

    public boolean isFull() {
        return false;
    }

    public int getTop() {
        if (isEmpty())
            return LINKED_LIST_DEFAULT_NEGATIVE_VALUE;
        return last.getValue();
    }

    public int pop() {
        if (isEmpty())
            return LINKED_LIST_DEFAULT_NEGATIVE_VALUE;
        int ret = last.getValue();
        last = last.getPrev();
        return ret;
    }

    public int getLINKED_LIST_DEFAULT_NEGATIVE_VALUE() {
        return LINKED_LIST_DEFAULT_NEGATIVE_VALUE;
    }

    public Node getLast() {
        return last;
    }

    public int getI() {
        return i;
    }
}
