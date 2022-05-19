package DataStructure.Examly.Search_Algorithm;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;

public class Subarray_or_not {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Queue<Integer> queue = new ArrayDeque<>();
        Queue<Integer> queue1 = new ArrayDeque<>();
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            queue.add(sc.nextInt());
        }
        n=sc.nextInt();
        int toh=0;
        for(int i = 0;i<n;i++){
            if (!queue.contains(sc.nextInt())){
                System.out.println("NOT A SUB ARRAY");
                toh=1;
                break;
            }
        }
        if (toh==0) System.out.println("SUB ARRAY");
    }
}
