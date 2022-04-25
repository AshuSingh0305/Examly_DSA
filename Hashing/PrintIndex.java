package DataStructure.Examly.Hashing;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class PrintIndex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[]=new int[n];
        int arr2[]=new int[n];
        for(int i=0;i<n;i++){
            int val=sc.nextInt();
            arr[i]=val;
            arr2[i]=val;
        }
        Arrays.sort(arr);
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(arr2[i]==arr[j]){
                    System.out.print(j+" ");
                }
            }
        }
    }
}
