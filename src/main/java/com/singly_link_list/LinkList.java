package com.singly_link_list;

public class LinkList<T extends Comparable> {
    Node head;

    public static class Node<T extends Comparable> {
        T data;
        Node next;
        Node(T d) {
            data = d;
            next = null;
        }

        public Node() {

        }
    }

    public String toPrint() {
        String result = "";
        Node findLast = head;
        while ( findLast != null ){
            result += findLast.data+" ";
            System.out.println(findLast.data);
            findLast = findLast.next;
        }
        return result;
    }

    public void toAdd(T data) {
        Node<T> node = new Node<>(data);
        if (head == null ) {
            this.head = node;
        }
        else {
            Node findLast = head;
            while (findLast.next != null) {
                findLast = findLast.next;
            }
            findLast.next = new Node(data);
        }

    }

    public void toRemove() {
        Node<T> node = new Node<>();
        if (head == null ) {
            System.out.println("Link List is Empty.");
        }
        else {
            Node secondLast = head;
            while (secondLast.next.next != null) {
                secondLast = secondLast.next;
            }
            secondLast.next = null;
        }
    }
}
