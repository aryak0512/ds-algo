package org.aryak.hashing.chaining;

public class ChainingClient {

    Node[] a = new Node[10];

    public int hash(int n) {
        return n % 10;
    }

    public static void main(String[] args) {
        //2, 4, 6, 3, 45, 32, 15

        int [] keys = {2, 12,22, 32, 46};
        ChainingClient obj = new ChainingClient();
        for ( int key : keys ){
            obj.insert(key);
        }

        // queries
        boolean is3Present = obj.searchSorted(2);
        boolean is5Present = obj.searchSorted(12);
        boolean is7Present = obj.searchSorted(35);
        System.out.println(is3Present);
        System.out.println(is5Present);
        System.out.println(is7Present);

    }


    public void insert(int n){
        int hashValue = hash(n);
        Node node = new Node(n);
        // first element being inserted
        if ( a[hashValue] == null ) {
            a[hashValue] = node;
        } else {
            insertSorted(node, a[hashValue]);
        }
    }

    /**
     * insert in a sorted linked list
     * @param node
     * @param head
     */
    public void insertSorted(Node node, Node head) {

        if ( head != null ) {
            Node n = head;
            Node temp = head;
            while ( n != null &&  n.getData() < node.getData()) {
                temp = n;
                n = n.getNext();
            }
            node.setNext(temp.getNext());
            temp.setNext(node);
        } else {
            head = node;
        }
    }

    public boolean searchSorted(int value) {
        int hashValue = hash(value);
        Node head= a[hashValue];
        if ( head == null ) {
            return false;
        }

        if ( head != null ) {
            Node n = head;
            while ( n != null ) {
                if ( n.getData() > value ) {
                    return false; // element not found
                }
                if ( n.getData() == value ) {
                    return true;
                }
                n = n.getNext();
            }
        }
        return false;
    }
}

