package DataStructure.Examly.Trees;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;

public class PostOrder {
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

    public void postOrderTraversal(){
        postOrderTraversal(root);
    }
    private void postOrderTraversal(Node root){
        if(root==null)
            return;
        postOrderTraversal(root.left);
        postOrderTraversal(root.right);
        System.out.print(root.value+"  ");


    }

}
class postord{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        PostOrder tree=new PostOrder();
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
        System.out.print("POSTORDER = ");
        tree.postOrderTraversal();
    }
}
