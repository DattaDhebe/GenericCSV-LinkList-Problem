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


    public void add(T item) {
        Node<T> node = new Node<>(item);
        if (head == null) {
            this.head = node;
        } else {
            Node findLast = head;
            while (findLast.next != null) {
                findLast = findLast.next;
            }
            findLast.next = new Node(item);
        }

    }

    public Boolean search(T item) {
        try {
            if (head == null) {
                System.out.println("Empty list.");
            } else {
                Node findElement = head;
                while (findElement.next != null) {
                    if ( findElement == item )
                        break;
                    else
                        findElement = findElement.next;
                    if ( findElement.next == null)
                        return false;
                }
                return true;
            }
            return false;
        } catch (Exception NullPointerException) {
            return false;
        }

    }

    public void remove() {

        if (head == null) {
            System.out.println("Empty list.");
        } else {
            Node secondLast = head;
            while (secondLast.next.next != null) {
                secondLast = secondLast.next;
            }
            secondLast.next = null;
        }
    }

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
