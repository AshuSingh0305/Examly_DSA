package DataStructure.Examly.Search_Algorithm;

import java.util.Scanner;

public class Minimum_element_in_Binary_tree {
    public static void main(String[] args) {
        MEIBT tree = new MEIBT();
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextInt()){
            tree.insert(sc.nextInt());
        }
        System.out.println(tree.findMinimum());
    }
}

class MEIBT {

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

    public int findMinimum(){
        return findMinimum(root);

    }
    private int findMinimum(Node root){
        if(root.left == null){
            return root.value;
        }
        return findMinimum(root.left);
    }
}