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

    class Node {

        private final int value;
        private Node prev, next;

        public Node(int value) {
            this.value = value;
        }

        public int getValue() {
            return value;
        }

        public Node getPrev() {
            return prev;
        }

        public void setPrev(Node prev) {
            this.prev = prev;
        }

        public void setNext(Node next) {
            this.next = next;
        }
    }
}

// TODO: Przeanalizować, czy IntLinkedList powinna dopuszczać przechowywanie
//       wartości null. Jeśli nie, dodać odpowiednie sprawdzenie w metodzie
//       'push'.
// TODO: Dodać atrybut 'size' przechowujący rozmiar listy i metodę 'size()'
//       zwracającą ten rozmiar. Pozwoli to uniknąć konieczności iterowania
//       po liście, aby sprawdzić jej rozmiar.
// TODO: Dodać możliwość iterowania po elementach listy (np. poprzez
//       implementację interfejsu Iterable).