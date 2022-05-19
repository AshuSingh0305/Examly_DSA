package DataStructure.Examly.Search_Algorithm;

import java.util.Arrays;
import java.util.Scanner;

public class Frequency_element_Binary_Search {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int arr[] = new int[n];
        for (int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int search = sc.nextInt();
        int count=0;
        Arrays.sort(arr);
        while (true){
            int index = BinarySearch(arr, 0, arr.length-1, search);
            if(index==-1) break;
            arr[index]=0;
            Arrays.sort(arr);
            count++;
        }
        System.out.println(count);
    }
    public static int BinarySearch(int array[], int left , int right, int val){
        if(left > right)
            return -1;
        int index = (left+right)/2;
        if(array[index]== val)
            return index;
        else if(array[index] < val){
            return BinarySearch(array,index+1 , right , val);
        }else{
            return BinarySearch(array, left , index-1 , val);
        }
    }
}
