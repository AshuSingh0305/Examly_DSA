package DataStructure.Examly.Queues;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;

public class InterLeave {
    public static void main(String[] args) {
        Queue<Integer> queue = new ArrayDeque<>();
        Queue<Integer> queue2 = new ArrayDeque<>();
        Queue<Integer> queue3 = new ArrayDeque<>();
        Scanner sc =new Scanner(System.in);
        int n= sc.nextInt();
        int count=1;
        for(int i=0;i<n/2;i++){
            queue.add(count++);
        }
        for (int i=0;i<n/2;i++){
            queue2.add(count++);
        }
        if(n%2!=0)
            queue3.add(count);
        for(int i=0;i<n/2;i++){
            queue3.add(queue.remove());
            queue3.add(queue2.remove());
        }
        while (!queue3.isEmpty()) {
            System.out.print(queue3.remove() + " ");
        }
    }
}
