package edu.kis.vh.nursery.list;

public class IntLinkedList {

    private Node last;
    private final int ERROR_VALUE = -1;

    public void push(int value) {
        Node newNode = new Node(value);
        if (last == null) {
            last = newNode;
        } else {
            newNode.setPrev(last);
            last.setNext(newNode);
            last = newNode;
        }
    }

    public boolean isEmpty() {
        return last == null;
    }

    public boolean isFull() {
        return false;
    }

    public int top() {
        if (isEmpty()) {
            return ERROR_VALUE;
        }
        return last.getValue();
    }

    public int pop() {
        if (isEmpty()) {
            return ERROR_VALUE;
        }
        int ret = last.getValue();
        last = last.getPrev();
        if (last != null) {
            last.setNext(null);
        }
        return ret;
    }
}