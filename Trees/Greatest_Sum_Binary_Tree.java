package DataStructure.Examly.Trees;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;

public class Greatest_Sum_Binary_Tree {
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
}
class sumBST{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Greatest_Sum_Binary_Tree tree=new Greatest_Sum_Binary_Tree();
        Queue<Integer> queue = new ArrayDeque<>();
        for (int i=0;i<7;i++){
            int temp=sc.nextInt();

                queue.add(temp);

        }
        int del = 0;
        int size = queue.size();
        for (int i=0;i< size;i++){
            int temp= queue.remove();
            del+=temp;
            tree.insert(temp);
        }
        System.out.println(del);
    }
}

