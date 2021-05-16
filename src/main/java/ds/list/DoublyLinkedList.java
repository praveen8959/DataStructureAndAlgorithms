package ds.list;

import ds.model.Employee;

public class DoublyLinkedList {

    public static void main(String[] args) {
        Employee jane = new Employee(123, "Jane", "jones");
        Employee john = new Employee(4567, "John", "Doe");
        Employee mary = new Employee(22, "Mary", "Smith");
        Employee mike = new Employee(3245, "Mike", "Wilson");

        System.out.println("_______________________________HEAD_INSERTION_______________________________________________________");
        EmployeeDoublyLinkedList employeeDoublyLinkedListHead = new EmployeeDoublyLinkedList();
        System.out.println("Employee linked list is empty : " + employeeDoublyLinkedListHead.isEmpty());

        employeeDoublyLinkedListHead.addToFront(jane);
        employeeDoublyLinkedListHead.addToFront(john);
        employeeDoublyLinkedListHead.addToFront(mary);
        employeeDoublyLinkedListHead.addToFront(mike);

        employeeDoublyLinkedListHead.printList();
        System.out.println();
        System.out.println("Employee linked list is empty : " + employeeDoublyLinkedListHead.isEmpty());
        System.out.println("Employee linked list size is  : " + employeeDoublyLinkedListHead.getSize());

        employeeDoublyLinkedListHead.removeFromFront();
        System.out.println("After removing  : " + employeeDoublyLinkedListHead.getSize());
        employeeDoublyLinkedListHead.printList();
        System.out.println("______________________________________________________________________________________");
        System.out.println("_______________________________TAIL_INSERTION_______________________________________________________");

        EmployeeDoublyLinkedList employeeDoublyLinkedListTail = new EmployeeDoublyLinkedList();
        System.out.println("Employee linked list is empty : " + employeeDoublyLinkedListTail.isEmpty());

        employeeDoublyLinkedListTail.addToEnd(jane);
        employeeDoublyLinkedListTail.addToEnd(john);
        employeeDoublyLinkedListTail.addToEnd(mary);
        employeeDoublyLinkedListTail.addToEnd(mike);

        employeeDoublyLinkedListTail.printList();
        System.out.println();
        System.out.println("Employee linked list is empty : " + employeeDoublyLinkedListTail.isEmpty());
        System.out.println("Employee linked list size is  : " + employeeDoublyLinkedListTail.getSize());

        employeeDoublyLinkedListTail.removeFromEnd();
        System.out.println("After removing  : " + employeeDoublyLinkedListTail.getSize());
        employeeDoublyLinkedListTail.printList();
    }

}
