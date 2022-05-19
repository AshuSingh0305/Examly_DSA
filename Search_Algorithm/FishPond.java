package DataStructure.Examly.Search_Algorithm;

import java.util.Scanner;

public class FishPond {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int arr[] = new int[n];
        int arr2[]= new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
            arr2[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            while(true){
                int index = search(arr, arr2[i], i);
                if (index==-1){
                    break;
                }
                arr[index]=100000;
            }
        }
        int count=0;
        for(int i=0;i<n;i++){
            if(arr[i]!=100000){
                count++;
            }
        }
        System.out.println(count+1);
    }
    public static int search(int arr[], int search, int j){
        for(int i=0;i<arr.length;i++){
            if(i!=j) if(arr[i]<=search) return i;
        }
        return -1;
    }
}
