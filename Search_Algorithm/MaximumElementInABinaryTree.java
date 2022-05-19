package DataStructure.Examly.Search_Algorithm;

import java.util.Scanner;

public class MaximumElementInABinaryTree {
    public static void main(String[] args) {
        Tree tree = new Tree();
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextInt()){
            tree.insert(sc.nextInt());
        }
        System.out.println(tree.findMaximum());
    }
}

class Tree {

    Node root;

    private class Node {
        int value;
        Node left;
        Node right;

        public Node(int value) {
            this.value = value;
        }
    }

    public void insert(int value) {
        Node node = new Node(value);
        if (root == null) {
            root = node;
            root.left = null;
            root.right = null;
        } else {
            var current = root;
            while (true) {
                if (current.value > value) {
                    if (current.left == null) {
                        current.left = node;
                        break;
                    }
                    current = current.left;
                } else {
                    if (current.right == null) {
                        current.right = node;
                        break;
                    }
                    current = current.right;
                }
            }

        }
    }

    public int findMaximum(){
        return findMaximum(root);

    }
    private int findMaximum(Node root){
        if(root.right == null){
            return root.value;
        }
        return findMaximum(root.right);
    }
}