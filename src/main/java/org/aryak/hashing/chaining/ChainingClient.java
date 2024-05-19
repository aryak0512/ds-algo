package org.aryak.hashing.chaining;

public class ChainingClient {

    Node[] a = new Node[10];

    public int hash(int n) {
        return n % 10;
    }

    public static void main(String[] args) {
        //2, 4, 6, 3, 45, 32, 15

        // queries
        boolean is3Present = get(3);
        boolean is5Present = get(7);
        boolean is7Present = get(5);
    }

    private static boolean get(int n) {
        return false;
    }

    public void insert(int n){

        int hashValue = hash(n);
        Node node = new Node(n);
        // first element being inserted
        if ( a[hashValue] == null ) {
            a[hashValue] = node;
        } else {
            // traverse till end of list & then append
            Node p = a[hashValue];
            while ( p != null ) {

                if(p.getData() > node.getData()){
                    // insert
                    Node q = p;
                    p.setNext(node);
                    node.setNext(q);
                }

                p = p.getNext();
            }
            // append new node
            p.setNext(node);
        }
    }
}

