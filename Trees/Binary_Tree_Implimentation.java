package DataStructure.Examly.Trees;


import DataStructure.Trees.Binary_Tree.Tree;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Queue;
import java.util.Scanner;

public class Binary_Tree_Implimentation {

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

    public void inOrderTraversal(Queue queue){
        inOrderTraversal(root, queue);
    }
    private void inOrderTraversal(Node root, Queue queue){
        if(root==null){
            return;
        }
        inOrderTraversal(root.left, queue);
        queue.add(root.value);
        inOrderTraversal(root.right, queue);
    }
}

class impl{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ins=sc.nextInt();
        int del=sc.nextInt();
        Binary_Tree_Implimentation tree = new Binary_Tree_Implimentation();
        for(int i=0;i<ins;i++){
            tree.insert(sc.nextInt());
        }
        Queue<Integer> queue = new ArrayDeque<>();
        tree.inOrderTraversal(queue);
        Queue<Integer> queue1 = new ArrayDeque<>();
        int arr[]=new int[del];
        for (int i=0;i<del;i++){
            arr[i]=sc.nextInt();
        }
        Arrays.sort(arr);
        int a=0;
        while (!queue.isEmpty() ){
            int temp=queue.remove();
            System.out.print(temp+" ");
            if(arr[a]==temp){
                a++;
                if(a== arr.length){
                    a=0;
                }
            }else{
                queue1.add(temp);
            }
        }
        System.out.println();
        while (!queue1.isEmpty()){
            int temp=queue1.remove();
            queue.add(temp);
            System.out.print(temp+" ");
        }
        int ser=sc.nextInt();
        System.out.println();
        if(queue.contains(ser)){
            System.out.println(ser+" Found");
        }else{
            System.out.println(ser+" Not Found");
        }
    }
}
