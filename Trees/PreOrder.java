package DataStructure.Examly.Trees;

import DataStructure.Trees.Binary_Tree.Tree;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;

public class PreOrder {
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
            while (true){
                if(current.value > value){
                    if(current.left==null) {
                        current.left = node;
                        break;
                    }
                    current = current.left;
                }else {
                    if(current.right == null) {
                        current.right = node;
                        break;
                    }
                    current = current.right;
                }
            }
        }
    }
    public void preOrderTraversal(){
        preOrderTraversal(root);
    }
    private void preOrderTraversal(Node root){
        if(root==null){
            return;
        }
        System.out.print(root.value+"  ");
        preOrderTraversal(root.left);
        preOrderTraversal(root.right);
    }
}
class preord{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        PreOrder tree=new PreOrder();
        Queue<Integer> queue = new ArrayDeque<>();
        for (int i=0;i<n;i++){
            int temp=sc.nextInt();
            if(queue.contains(temp)){
            }else {
                queue.add(temp);
            }
        }
        int size= queue.size();
        for (int i=0;i< size;i++){
            tree.insert(queue.remove());
        }
        System.out.print("PREORDER = ");
        tree.preOrderTraversal();
    }
}
