package DataStructure.Examly.Search_Algorithm;

import java.util.Scanner;

public class Find_Negative_Pairs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ws= sc.nextInt();
        int arr[]=new int[n];
        for (int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            if(i>arr.length-ws) break;
            int min=0;
            for(int j=i;j<i+ws;j++) if(arr[j]<min) min = arr[j];
            System.out.print(min+" ");
        }
    }
}
