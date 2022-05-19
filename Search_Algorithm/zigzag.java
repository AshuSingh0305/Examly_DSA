package DataStructure.Examly.Search_Algorithm;

import java.util.Scanner;

public class zigzag {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int[n];
        for(int i =0 ; i<n ; i++){
            arr[i] = sc.nextInt();
        }

        int count=0;
        for(int i=0 ; i<n-2 ; i++){
            if(arr[i]>arr[i+1] && arr[i+1] >arr[i+2] || arr[i]<arr[i+1] && arr[i+1] <arr[i+2]){
                count++;
            }
        }
        System.out.println(count);
    }
}