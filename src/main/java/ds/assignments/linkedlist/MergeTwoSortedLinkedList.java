package ds.assignments.linkedlist;

public class MergeTwoSortedLinkedList {

    public static void main(String[] args) {
        IntegerLinkedList listOne = new IntegerLinkedList();
        listOne.addToEnd(1);
        listOne.addToEnd(8);
        listOne.addToEnd(15);
        listOne.addToEnd(19);
        IntegerLinkedList listTwo = new IntegerLinkedList();
        listTwo.addToEnd(7);
        listTwo.addToEnd(9);
        listTwo.addToEnd(10);
        listTwo.addToEnd(16);

        System.out.println("-------------------------FIRST List----------------------------");
        listOne.printList();
        System.out.println("\n-------------------------SECOND List----------------------------");
        listTwo.printList();

        IntegerLinkedList mergedList = new IntegerLinkedList();
        LinkedListNode linkedListNode = mergeTwoSortedList(listOne.getHead(), listTwo.getHead());
        mergedList.setHead(linkedListNode);
        System.out.println("\n-------------------------MERGED List----------------------------");
        mergedList.printList();

    }

    private static LinkedListNode mergeTwoSortedList(LinkedListNode headOne, LinkedListNode headTwo) {
        if (headOne == null) {
            return headTwo;
        } else if (headTwo == null) {
            return headOne;
        }

        LinkedListNode mergedHead;
        if (headOne.getInteger() <= headTwo.getInteger()) {
            mergedHead = headOne;
            headOne = headOne.getNext();
        } else {
            mergedHead = headTwo;
            headTwo = headTwo.getNext();
        }

        LinkedListNode mergedTail = mergedHead;
        while (headOne != null && headTwo != null) {
            LinkedListNode temp;
            if (headOne.getInteger() <= headTwo.getInteger()) {
                temp = headOne;
                headOne = headOne.getNext();
            } else {
                temp = headTwo;
                headTwo = headTwo.getNext();
            }
            mergedTail.setNext(temp);
            mergedTail = temp;
        }
        return mergedHead;
    }

}
