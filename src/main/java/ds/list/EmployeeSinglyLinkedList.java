package ds.list;

import ds.model.Employee;

public class EmployeeSinglyLinkedList {

    private EmployeeNode head;
    private int          size = 0;

    public void addToFront(Employee employee) {
        EmployeeNode employeeNode = new EmployeeNode(employee);
        employeeNode.setNext(head);
        head = employeeNode;
        size++;
    }

    public int getSize() {
        return size;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void printList() {
        EmployeeNode current = head;
        System.out.print(" HEAD -> ");
        while (current != null) {
            System.out.print(current);
            System.out.print(" -> ");
            current = current.getNext();
        }
        System.out.print(" NULL ");
    }

    public EmployeeNode removeFromFront() {
        if (isEmpty()) {
            return null;
        }
        EmployeeNode current = head;
        head = head.getNext();
        size--;
        current.setNext(null);
        return current;
    }

}
