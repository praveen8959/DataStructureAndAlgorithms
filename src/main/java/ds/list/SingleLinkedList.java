package ds.list;

import ds.model.Employee;

public class SingleLinkedList {

    public static void main(String[] args) {
        Employee jane = new Employee(123, "Jane", "jones");
        Employee john = new Employee(4567, "John", "Doe");
        Employee mary = new Employee(22, "Mary", "Smith");
        Employee mike = new Employee(3245, "Mike", "Wilson");

        EmployeeSinglyLinkedList employeeSinglyLinkedList = new EmployeeSinglyLinkedList();
        System.out.println("Employee linked list is empty : " + employeeSinglyLinkedList.isEmpty());

        employeeSinglyLinkedList.addToFront(jane);
        employeeSinglyLinkedList.addToFront(john);
        employeeSinglyLinkedList.addToFront(mary);
        employeeSinglyLinkedList.addToFront(mike);

        employeeSinglyLinkedList.printList();
        System.out.println();
        System.out.println("Employee linked list is empty : " + employeeSinglyLinkedList.isEmpty());
        System.out.println("Employee linked list size is  : " + employeeSinglyLinkedList.getSize());


        employeeSinglyLinkedList.removeFromFront();
        System.out.println("After removing  : " + employeeSinglyLinkedList.getSize());
        employeeSinglyLinkedList.printList();
    }

}
