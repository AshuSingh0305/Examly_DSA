package DataStructure.Examly.Queues;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;

public class TransportBusiness {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int m=sc.nextInt();
        Queue<Integer> queue = new ArrayDeque<>();
        Queue<Integer> queue2 = new ArrayDeque<>();
        if(n<=1 || m<=1){
            System.out.println("-1");
        }else{
            for(int i=0;i<m;i++){
                queue.add(sc.nextInt());
            }
            for(int i=0;i<n;i++){
                queue2.add(queue.remove());
            }
            while (!queue.isEmpty()){
                int val=queue.remove();
                if(val%2==0){
                    queue2.remove();
                    queue2.add(val);
                }
            }
        }
        while (!queue2.isEmpty()){
            System.out.print(queue2.remove()+" ");
        }
    }
}
