package DataStructure.Examly.Search_Algorithm;

import java.util.Scanner;

public class Find_ceil_element {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[]= new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int find=sc.nextInt();
        boolean tog = true;
        for(int i=0;i<n;i++){
            if(arr[i]>find){
                System.out.println(arr[i]);
                tog=false;
                break;
            }
        }
        if (tog) System.out.println("No Ceil");
    }
}
