package org.aryak.linkedlist;

/**
 * Basics operations of a singly linked list
 */
public class SinglyLinkedList {

    private Node head;

    /**
     * appends element to end of list
     * @param value
     */
    public void append(int value) {
        Node node = new Node(value);
        if ( head != null ) {
            Node n = head;
            while ( n.getNext() != null ) {
                n = n.getNext();
            }
            // append the node
            n.setNext(node);
        } else {
            head = node;
        }
    }

    /**
     * displays all elements of list
     */
    public void print() {
        if ( head != null ) {
            Node n = head;
            while ( n != null ) {
                System.out.print(n.getData() + " ");
                n = n.getNext();
            }
        } else {
            System.out.println("List is empty");
        }
    }

    /**
     * returns index of the given element in list
     * returns -1 if not found
     * @param value
     * @return
     */
    public int search(int value) {
        int idx = 0;
        if ( head != null ) {
            Node n = head;
            while ( n != null ) {
                if ( n.getData() == value ) {
                    return idx;
                }
                idx++;
                n = n.getNext();
            }
        }
        return -1;
    }

    /**
     * gives size of the list
     * @return
     */
    public int getLength() {
        int length = 0;
        if ( head != null ) {
            Node n = head;
            while ( n != null ) {
                length++;
                n = n.getNext();
            }
        }
        return length;
    }

    /**
     * inserts a value at a given position
     * @param value
     * @param idx
     */
    public void insert(int value, int idx) {
        Node node = new Node(value);
        int i =0;
        if ( head != null ) {
            Node n = head;
            while ( n != null ) {
                i++;
                if ( i == idx ) {
                    Node q = n.getNext();
                    node.setNext(q);
                    n.setNext(node);
                }
                n = n.getNext();
            }

        } else {
            if ( idx > 0 ) {
                System.out.println("Cannot insert at idx = " + idx);
            } else {
                head = node;
            }
        }
    }

    // TODO : need to complete this function
    public void insertSorted(int value) {
        Node node = new Node(value);
        if ( head != null ) {
            Node n = head;
            while ( n.getNext() != null ) {
                if ( n.getData() > value ) {
                    Node q = n;
                    n = node;
                    node.setNext(q);
                }
                n = n.getNext();
            }
            // append the node
            if ( n.getData() > value ) {
                Node q = n;
                n = node;
                node.setNext(q);
            }
        } else {
            head = node;
        }
    }
}
