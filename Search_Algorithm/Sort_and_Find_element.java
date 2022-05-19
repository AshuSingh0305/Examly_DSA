package DataStructure.Examly.Search_Algorithm;

import java.util.Arrays;
import java.util.Scanner;

public class Sort_and_Find_element {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int target = sc.nextInt();
        Arrays.sort(arr);
        for (int i=0;i<n;i++){
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
        int index = TernarySearch(arr, 0, arr.length, target);
        if(index<0) System.out.println("NO");
        else System.out.println("YES");
    }
    public static int TernarySearch(int [] array , int left , int right , int target ){
        int partitionsize = (right-left)/3;
        int mid1 = left+partitionsize;
        int mid2 = right-partitionsize;
        if(mid1>mid2)
            return -1;

        if(array[mid1] == target)
            return mid1;

        if(array[mid2] == target)
            return mid2;
        if(array[mid1] > target)
            return TernarySearch(array , left , mid1-1 , target);

        if(array[mid2] < target)
            return TernarySearch(array , mid2+1 , right , target);

        return TernarySearch(array , mid1+1 , mid2-1 , target);
    }
}
