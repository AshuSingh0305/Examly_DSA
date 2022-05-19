package DataStructure.Examly.Search_Algorithm;

import java.util.Arrays;
import java.util.Scanner;

public class Sorted_Frequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int find=sc.nextInt();
        Arrays.sort(arr);
        System.out.print("Sorted Array:");
        for (int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        int count = 0;
        while (true){
            int index = BinarySearchIterative(arr, find);
            if (index==-1) break;
            else count++;
            arr[index]=0;
            Arrays.sort(arr);
        }
        System.out.println();
        if (count!=0) System.out.println("Count:"+count);
        else System.out.println("Element not found in the array");

    }
    public static int BinarySearchIterative(int arr[], int search){
        int left=0;
        int right=arr.length-1;
        while(true){
            if(left>right) return -1;
            int mid=(left+right)/2;
            if(arr[mid]==search) return mid;
            else{
                if(arr[mid]>search) right=mid-1;
                else left=mid+1;
            }
        }
    }
}
