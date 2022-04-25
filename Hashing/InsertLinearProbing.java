package DataStructure.Examly.Hashing;

import java.util.Arrays;
import java.util.Scanner;

public class InsertLinearProbing {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            int val =sc.nextInt();
            int index=val%n;
            for(int j=index;j<=n;j++){
                if(j>=n){
                    j=j%n;
                }
                if(arr[j]==0){
                    arr[j]= val;
                    break;
                }

            }
        }
        for (int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
