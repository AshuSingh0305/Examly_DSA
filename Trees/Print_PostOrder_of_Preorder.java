package DataStructure.Examly.Trees;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;

public class Print_PostOrder_of_Preorder {
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

    public void preOrderTraversal(Queue queue) {
        preOrderTraversal(root, queue);
    }

    private void preOrderTraversal(Node root, Queue queue) {
        if (root == null) {
            return;
        }
        queue.add(root.value);
        preOrderTraversal(root.left, queue);
        preOrderTraversal(root.right, queue);
    }

    public void postOrderTraversal(){
        postOrderTraversal(root);
    }
    private void postOrderTraversal(Node root){
        if(root==null)
            return;
        postOrderTraversal(root.left);
        postOrderTraversal(root.right);
        System.out.print(root.value+" ");
    }
}
class Main {
    public static void main(String[] args) {
        Print_PostOrder_of_Preorder tree = new Print_PostOrder_of_Preorder();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[]=new int[n];
        for (int i = 0; i < n; i++) {
            int temp=sc.nextInt();
            arr[i]=temp;
            tree.insert(temp);
        }
        Queue<Integer> queue = new ArrayDeque<>();
        tree.preOrderTraversal(queue);
        int tog=0;
        for(int i=0;i<n;i++){
            if(queue.remove()!=arr[i]){
                tog=1;
                break;
            }
        }
        if(tog==1){
            System.out.println("-1");
        }else{
            tree.postOrderTraversal();
        }
    }
}
