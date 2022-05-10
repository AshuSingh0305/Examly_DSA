package DataStructure.Examly.Trees;

import DataStructure.Trees.Binary_Tree.Tree;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;

public class Height_Of_BST {
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
    public int height(){
        return height(root);
    }

    public int height(Node root){
        if(root==null)
            return -1;
        if(root.left==null && root.right==null)
            return 0;
        return 1+Math.max(height(root.left), height(root.right));
    }


}
class height{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        Height_Of_BST tree=new Height_Of_BST();
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

        System.out.println(tree.height());
    }
}
