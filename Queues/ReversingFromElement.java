package DataStructure.Examly.Queues;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;

public class ReversingFromElement {
    public static void main(String[] args) {
        Queue<Integer> queue = new ArrayDeque<>();
        Queue<Integer> queuenew = new ArrayDeque<>();
        Scanner sc = new Scanner(System.in);
        int i=0;
        int n  = sc.nextInt();
        int m= sc.nextInt();
        for(i=0;i<m;i++){
            queue.add(sc.nextInt());
        }
        for(i=i;i<n;i++){
            queuenew.add(sc.nextInt());
        }
        reverse(queue);
        while (!queuenew.isEmpty()){
            System.out.print(queuenew.remove()+" ");
        }
    }
    public static void reverse(Queue<Integer> queue){
        int i= queue.size();
        int arr [] =new int[i];
        while (!queue.isEmpty()) {
            arr[i - 1] = queue.remove();
            i--;
        }
        for (int j=0;j< arr.length;j++){
            queue.add(arr[j]);
        }
        System.out.println("Reversed queue: ");
        while (!queue.isEmpty()){
            System.out.print(queue.remove()+" ");
        }
    }
}
