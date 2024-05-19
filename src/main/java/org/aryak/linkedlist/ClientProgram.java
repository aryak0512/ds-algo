package org.aryak.linkedlist;

public class ClientProgram {
    public static void main(String[] args) {
        SinglyLinkedList list = new SinglyLinkedList();

        list.insertSorted(1);
        list.insertSorted(2);

        // 45 55 65 75
        list.print();
        System.out.println();
        System.out.println(list.getLength());

    }
}
