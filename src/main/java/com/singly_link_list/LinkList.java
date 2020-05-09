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
}
