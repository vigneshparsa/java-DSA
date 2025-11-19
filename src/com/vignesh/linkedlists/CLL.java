package com.vignesh.linkedlists;

import org.w3c.dom.Node;

public class CLL {
    private Node head;
    private Node tail;

    public CLL() {
        this.head = null;
        this.tail = null;
    }
    public class Node{
        int val;
        Node next;
        public Node(int val ,  Node next){
            this.val = val;
            this.next = next;
        }
    }
    public void insertFirst(int val){
        Node node = new Node(val, null);
        if(head == null){
            head = node;
            tail = node;
            return;
        }
        tail.next = node;
        node.next = head;
        tail = node;
    }
    public void delete(int val){
        Node node = head;
        if(node == null) {
            return;
        }
        if(node.val == val){
            head = node.next;
            tail.next = head;
            return;
        }
        do{
            Node n = node.next;
            if(n.val == val){
                node.next = n.next;
                break;
            }
            node = node.next;
        }
        while(node != head);
    }
    public void display(){
        Node current = head;
        if(head != null) {
            do {
                System.out.print(current.val + " -> ");
                current = current.next;
            }
            while(current != head);
        }
    }
}
