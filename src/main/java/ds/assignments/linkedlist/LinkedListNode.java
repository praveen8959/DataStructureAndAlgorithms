package ds.assignments.linkedlist;

public class LinkedListNode {

    private Integer        integer;
    private LinkedListNode next;

    public LinkedListNode(Integer integer) {
        this.integer = integer;
    }

    public Integer getInteger() {
        return integer;
    }

    public void setInteger(Integer integer) {
        this.integer = integer;
    }

    public LinkedListNode getNext() {
        return next;
    }

    public void setNext(LinkedListNode next) {
        this.next = next;
    }

    @Override
    public String toString() {
        return " { " + integer + " } ";
    }
}
