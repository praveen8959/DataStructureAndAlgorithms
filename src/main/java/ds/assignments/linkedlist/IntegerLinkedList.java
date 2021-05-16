package ds.assignments.linkedlist;

public class IntegerLinkedList {

    private LinkedListNode head;
    private int            size = 0;

    public void addToEnd(Integer value) {
        LinkedListNode newNode = new LinkedListNode(value);
        if (head == null) {
            head = newNode;
        } else {
            LinkedListNode tempNode = head;
            while (tempNode.getNext() != null) {
                tempNode = tempNode.getNext();
            }
            tempNode.setNext(newNode);
        }
        size++;
    }

    public LinkedListNode getHead() {
        return head;
    }

    public void setHead(LinkedListNode head) {
        this.head = head;
    }

    public void printList() {
        LinkedListNode currentNode = head;
        System.out.print("HEAD -> ");
        while (currentNode != null) {
            System.out.print(currentNode);
            currentNode = currentNode.getNext();
            System.out.print(" -> ");
        }
        System.out.print(" NULLL");
    }

}
