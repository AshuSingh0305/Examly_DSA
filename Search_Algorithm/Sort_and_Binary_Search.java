package DataStructure.Examly.Search_Algorithm;

import java.util.Arrays;
import java.util.Scanner;

public class Sort_and_Binary_Search {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        Arrays.sort(arr);
        int find = sc.nextInt();
        int index = BinarySearchIterative(arr, find);
        if(index!=-1){
            index+=1;
            System.out.println("Found at position:  "+ index);
        }else System.out.println("Not Found");

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
