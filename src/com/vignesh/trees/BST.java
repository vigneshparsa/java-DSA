package com.vignesh.trees;

import java.util.Scanner;

public class BST {

    private class Node {

        private int val;
        private int height;
        private Node left;
        private Node right;

        public Node(int val) {
            this.val = val;
        }

        public int getVal(int val) {
            return val;
        }
    }

    private Node root;

    public int height(Node node) {
        if (node == null) {
            return -1;
        }
        return node.height;
    }

    public boolean isEmpty() {
        return root == null;
    }

    public void insert(int val) {
        root = insert(val, root);
    }

    private Node insert(int val, Node node) {
        if (node == null) {
            return new Node(val);
        }
        if (val < node.val) {
            node.left = insert(val, node.left);
        }
        if (val > node.val) {
            node.right = insert(val, node.right);
        }
        node.height = Math.max(height(node.left), height(node.right)) + 1;
        return node;
    }
    public void populate(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            this.insert(nums[i]);
        }
    }
    public boolean balanced() {
        return balanced(root);
    }
    private boolean balanced(Node node) {
        if (node == null) {
            return true;
        }
        return Math.abs(height(node.left) - height(node.right)) <= 1 && balanced(node.left) && balanced(node.right);
    }
    public void display(){
        display(this.root , "Root Node : ");
    }
    private void display(Node node, String prefix){
        if (node == null) {
            return;
        }
        System.out.println(prefix + node.val);
        display(node.left, "Left child of " + node.val + " : ");
        display(node.right, "Right child of " + node.val + " : ");
    }
    
    public void preOrder(){
        preOrder(root);
    }
    private void preOrder(Node node){
        if (node == null) {
            return;
        }
        System.out.print(node.val + " ");
        preOrder(node.left);
        preOrder(node.right);
    }

    public void inOrder(){
        inOrder(root);
    }
    private void inOrder(Node node){
        if (node == null) {
            return;
        }
        inOrder(node.left);
        System.out.println(node.val + " ");
        inOrder(node.right);
    }

    public void postOrder(){
        postOrder(root);
    }
    private void postOrder(Node node){
        if (node == null) {
            return;
        }
        postOrder(node.left);
        postOrder(node.right);
        System.out.println(node.val + " ");
    }

    public void populatedSorted(int[] nums) {
        populatedSorted(nums, 0, nums.length);
    }
    private void populatedSorted(int[] nums, int low, int high) {
        if (low > high) {
            return;
        }
        int mid = (low + high) / 2;
        this.insert(nums[mid]);
        populatedSorted(nums, low, mid);
        populatedSorted(nums, mid + 1, high);
    }
//    private void rotate(Node node) {
//        if(height(node.left) - height(node.right) > 1){
//            // Left is Heavy
//            if(height(node.left.left) - height(node.left.right) > 0){
//                //Left Left case
//                return rightRotate(node);
//            }
//            if(height(node.right.left) - height(node.right.right) < 0){
//                //Left Right case
//                node.left = leftRotate(node.left);
//            }
//        }
//    }

    public static void main(String[] args) {
        BST tree = new BST();
        int[] nums = {10 , 5 , 15 , 4 , 13 ,  17 , 7 , 2 , 4 , 16 , 20};
//        tree.populate(nums);
//        tree.display();
//        tree.isEmpty();
//        tree.height(tree.root);
//        tree.populatedSorted(nums);



    }
}

