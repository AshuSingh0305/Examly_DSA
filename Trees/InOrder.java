package DataStructure.Examly.Trees;

import java.util.Queue;
import java.util.Scanner;

public class InOrder {
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

    public void inOrderTraversal(){
        inOrderTraversal(root);
    }
    private void inOrderTraversal(Node root){
        if(root==null){
            return;
        }
        inOrderTraversal(root.left);
        System.out.print(root.value+"  ");
        inOrderTraversal(root.right);
    }
}
class inord{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        InOrder tree=new InOrder();
        for (int i=0;i<n;i++){
            tree.insert(sc.nextInt());
        }
        System.out.print("INORDER = ");
        tree.inOrderTraversal();
    }
}
