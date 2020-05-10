package com.singly_link_list;

public class LinkList<T extends Comparable> {
    static Node head;

    public static class Node<T extends Comparable> {
        T data;
        Node next;

        Node(T d) {
            this.data = d;
            this.next = null;
        }

        public Node() {

        }
    }


    public void add(T data) {
        Node<T> node = new Node<>(data);
        if (head == null) {
            this.head = node;
        } else {
            Node findLast = head;
            while (findLast.next != null) {
                findLast = findLast.next;
            }
            findLast.next = new Node(data);
        }

    }

    public void remove() {
        Node<T> node = new Node<>();
        if (head == null) {
            System.out.println("Link List is Empty.");
        } else {
            Node secondLast = head;
            while (secondLast.next.next != null) {
                secondLast = secondLast.next;
            }
            secondLast.next = null;
        }
    }

//    public <T extends Comparable> T toSearch(T data) {
//        Node<T> node = new Node<>(data);
//        Node findNode = head;
//        if (head == null) {
//            System.out.println("Link List is Empty.");
//        } else {
//
//            while (findNode.next.next != data) {
//                break;
//            }
//        }
//        return (findNode.next);
//    }

    @Override
    public String toString() {
        StringBuilder element = new StringBuilder();
        Node<T> findLast = head;
        while (findLast.next != null) {
            element.append(" ").append(findLast.data).append(",");
            findLast = findLast.next;
        }
        element.append(" ").append(findLast.data).append(" ");
        return "["+element+"]";
    }


}
