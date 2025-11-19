package com.vignesh.linkedlists;

import java.util.LinkedList;

import java.util.*;

public class LL {

    private Node head;
    private Node tail;
    private int size;

    public LL() {
        this.size = 0;
    }

    private class Node {
        private int val;
        private Node next;

        public Node(int val, Node next) {
            this.val = val;
            this.next = next;
        }

        @Override
        public String toString() {
            return "Node{" +
                    "val=" + val +
                    ", next=" + next +
                    '}';
        }
    }

    public void insertFirst(int val, Node next) {
        Node node = new Node(val, next);
        node.next = head;
        head = node;
        if (tail == null) {
            tail = head;
        }
        size++;
    }

    public void insertLast(int val, Node next) {
        if (tail == null) {
            insertFirst(val, next);
            return;
        }
        Node node = new Node(val, next);
        tail.next = node;
        tail = node;
        size++;
    }

    public void insert(int val, Node next, int index) {
        if (index == 0) {
            insertFirst(val, next);
        }
        if (index == size) {
            insertLast(val, next);
        }
        Node temp = head;
        for (int i = 1; i < index; i++) {
            temp = temp.next;
        }
        Node newNode = new Node(val, next);
        temp.next = newNode;
        size++;
    }

    public void deleteFirst() {
        int val = head.val;
        head = head.next;
        if (head == null) {
            tail = null;
        }
        size--;
    }

    public void deleteLast() {
        if (size <= 1) {
            deleteFirst();
            return;
        }
        Node secLast = head;
        int val = secLast.next.val;
        for (int i = 1; i < size - 2; i++) {
            tail = secLast;
            secLast.next = null;
        }
        size--;
    }

    public int delete(int index) {
        if (index == 0) {
            deleteFirst();
        }
        if (index == size - 1) {
            deleteLast();
        }
        Node prev = head;
        for (int i = 1; i < index; i++) {
            prev = prev.next;
        }
            int val = prev.next.val;
            prev.next = prev.next.next;
            size--;
            return val;
    }
    public Node find(int val) {
        Node node = head;
        while (node != null) {
            if (node.val == val) {
                return node;
            }
            node = node.next;
        }
        return null;
    }

    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        }
        System.out.println("END");
    }
}




