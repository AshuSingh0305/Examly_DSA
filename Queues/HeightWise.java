package DataStructure.Examly.Queues;

import java.util.PriorityQueue;
import java.util.Scanner;

public class HeightWise {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
        for(int i=0;i<n;i++){
            priorityQueue.add(sc.nextInt());
        }
        System.out.println("Sorted Queue: ");
        while (!priorityQueue.isEmpty()){
            System.out.print(priorityQueue.remove()+" ");
        }
    }
}
