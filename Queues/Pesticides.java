package DataStructure.Examly.Queues;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;

public class Pesticides {
    static int count,value=0;
    static Queue<Integer> queuenew = new ArrayDeque<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for(int i=0;i<n;i++){
            queuenew.add(scanner.nextInt());
        }
        int count2=1;
        while(count2!=0){
            int size = queuenew.size();
            int arr[]=new int[size];
            for(int i=0;i< arr.length;i++){
                arr[i]=queuenew.remove();
            }
            count2 = check(arr);
            value++;
        }
        System.out.println(value-1);
    }
    public static int check(int arr[]){
        count=0;
        Queue<Integer> queue = new ArrayDeque<>();
        for(int i=0;i< arr.length;i++){
            if(i== arr.length-1){
                break;
            }else{
                if(arr[i]<arr[i+1]){
                    queue.add(i+1);
                    count++;
                }
            }
        }
        int newarr[] = new int[arr.length - queue.size()];
        int j=0;
        for(int i=0;i< arr.length;i++){
            if(!queue.isEmpty() && i== queue.peek()){
                queue.remove();
            }else{
                newarr[j]=arr[i];
                j++;
            }
        }
        while (!queuenew.isEmpty()){
            queuenew.remove();
        }
        for(int i=0;i< newarr.length;i++){
            queuenew.add(newarr[i]);
        }
        return count;
    }
}
