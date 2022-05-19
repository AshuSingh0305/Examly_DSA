package DataStructure.Examly.Search_Algorithm;

import java.util.Scanner;

public class Pair_of_given_difference {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i=0;i<n;i++) arr[i]=sc.nextInt();
        int diff = sc.nextInt();
        boolean tog=true;
        for (int i=0;i<n;i++){
            int temp=arr[i]+diff;
            int index = search(arr, i, temp);
            if(index>0){
                System.out.println("("+ arr[i]+", "+arr[index]+")");
                tog=false;
                break;
            }
        }
        if(tog){
            System.out.println("No such pair");
        }
    }
    public static int search(int []arr, int i, int temp){
        for(i=i;i<arr.length;i++){
            if(arr[i]==temp) return i;
        }
        return -1;
    }
}
