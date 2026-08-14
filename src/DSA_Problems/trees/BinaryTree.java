package DSA_Problems.trees;

import java.util.Scanner;

public class BinaryTree {

    private static class Node {
        int val;
        Node left;
        Node right;

        Node(int val) {
            this.val = val;
        }
    }

    private Node root;

    public void populate(Scanner in) {
        System.out.println("Enter the value of node you want to insert:");
        int val = in.nextInt();
        root = new Node(val);
        populate(in, root);
    }

    private void populate(Scanner in, Node node) {
        System.out.println("Enter the value of node you want to insert left:" + node.val);
        boolean left = in.nextBoolean();
        if (left) {
            int val = in.nextInt();
            node.left = new Node(val);
            populate(in, node.left);
        }
        System.out.println("Enter the value of node you want to insert right:" + node.val);
        boolean right = in.nextBoolean();
        if (right) {
            int val = in.nextInt();
            node.right = new Node(val);
            populate(in, node.right);
        }
    }

    public void display() {
        display(root, " ");
    }

    private void display(Node node, String indent) {
        if (node == null) {
            return;
        }
        System.out.print(indent + node.val + " ");
        display(node.left, indent + "\t");
        display(node.right, indent + "\t");
    }

            public void prettyDisplay () {
            prettyDisplay(root, 0);
        }

        private void prettyDisplay (Node node,int level){
            if (node == null) {
                return;
            }
            prettyDisplay(node.right, level + 1);
            if (level != 0) {
                for (int i = 0; i < level - 1; i++) {
                    System.out.print(" |\t\t ");
                }
                System.out.println(" |----->" + node.val);
            } else {
                System.out.println(node.val);
            }
            prettyDisplay(node.left, level + 1);
        }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        BinaryTree tree = new BinaryTree();
        tree.populate(in);
//        tree.display();
        tree.prettyDisplay();

    }
}



