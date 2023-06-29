package ru.geekbrains.lesson3;

public class Main {

    public static void main(String[] args) {
//        LinkedList linkedList = new LinkedList();
//        linkedList.addFirst(1);
//        linkedList.addFirst(22);
//        linkedList.addFirst(52);
//        linkedList.addFirst(12);
//        linkedList.printList();
//
//        linkedList.addLast(18);
//        linkedList.addLast(33);
//        linkedList.addLast(36);
//        linkedList.printList();
//
//        System.out.println("linkedList.contains(55) = " + linkedList.contains(52));
//        System.out.println("linkedList.contains(76) = " + linkedList.contains(76));
//
//        linkedList.removeLast();
//        linkedList.printList();
//
//        linkedList.remove();
//        linkedList.printList();
        DoubleList doubleList = new DoubleList();
        doubleList.addFirst(1);
        doubleList.addFirst(22);
        doubleList.addFirst(52);
        doubleList.addFirst(12);
        doubleList.printList();

        doubleList.addLast(18);
        doubleList.addLast(33);
        doubleList.addLast(36);
        doubleList.printList();

        System.out.println("doubleList.contains(18) = " + doubleList.contains(18));
        System.out.println("doubleList.contains(76) = " + doubleList.contains(76));

        doubleList.removeLast();
        doubleList.printList();

        doubleList.remove();
        doubleList.printList();
        doubleList.revert();
        doubleList.printList();

    }
}