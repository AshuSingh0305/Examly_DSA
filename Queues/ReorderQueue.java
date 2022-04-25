package DataStructure.Examly.Queues;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;

public class ReorderQueue {
    public static void main(String[] args) {
        Queue <Integer> queue = new ArrayDeque<>();
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        for(int i=0;i<n;i++){
            queue.add(sc.nextInt());
        }
        Queue<Integer> queue1=new ArrayDeque<>();
        int val;

        for(int i=0;i<n/2;i++){
            val=queue.remove();
            if(val>queue.peek()){
                queue1.add(queue.remove());
                queue1.add(val);
            }else{
                queue1.add(val);
                queue1.add(queue.remove());
            }
        }
        if(!queue.isEmpty()){
            queue1.add(queue.remove());
        }
        System.out.println("Reordered queue: ");
        while (!queue1.isEmpty()){
            System.out.print(queue1.remove()+" ");
        }
    }
}
