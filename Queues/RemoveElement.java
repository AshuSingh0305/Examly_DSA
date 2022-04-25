package DataStructure.Examly.Queues;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;

public class RemoveElement {
    public static void main(String[] args) {
        Queue <Integer> queue = new ArrayDeque<>();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=0;i<n;i++){
            queue.add(sc.nextInt());
        }
        int rem= sc.nextInt();
        for(int i=0;i<rem;i++){
            System.out.println("Element deleted from queue is : "+queue.remove());
        }
        System.out.println("Queue is : ");
        while (!queue.isEmpty()){
            System.out.print(queue.remove()+" ");
        }
    }
}
