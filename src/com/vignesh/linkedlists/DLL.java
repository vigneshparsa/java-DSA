package com.vignesh.linkedlists;
import org.w3c.dom.Node;

import java.util.LinkedList;

public class DLL {
    private Node head;
    private Node tail;

    private static class Node {
         int val;
         Node next;
         Node prev;

         public Node(int val) {
             this.val = val;
             this.next = null;
             this.prev = null;
         }
        public Node(int val ,Node next , Node prev) {
            this.val = val;
            this.next = next;
            this.prev = prev;
        }
    }
    public void insertFirst(int val) {
        Node node = new Node(val);
        node.next = head;
        node.prev = null;
        if(head != null) {
            head.prev = node;
        }
        head = node;
    }
    public void insertLast(int val) {
        Node node = new Node(val);

        if (head == null) {
            node.prev = null;
            head = node;
            return;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = node;
        node.prev = temp;
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
    public void insert(int after , int val) {
        Node p = find(after);
        if (p == null) {
            System.out.println("does not exist");
            return;
        }
        Node node = new Node(val);
        node.next = p.next;
        p.next = node;
        node.prev = p;
        if(node.next.prev != node){
            node.next.prev = node;
        }
    }
    public void displayBackward(){
        if(head == null){
            return;
        }
        Node temp = head;
        while(temp.next != null){
            temp = temp.next;
        }
        while(temp.prev != null){
            System.out.print(temp.val + " <-> ");
                temp = temp.prev;
            }
            System.out.println();
        }

    public void display() {
        Node node = head;
        while (node != null) {
            System.out.print(node.val + " <-> ");
            node = node.next;
        }
        System.out.println("END");
    }
}
