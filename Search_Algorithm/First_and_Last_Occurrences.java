package DataStructure.Examly.Search_Algorithm;

import java.util.Scanner;

public class First_and_Last_Occurrences {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[]= new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int find=sc.nextInt();
        int tog1=0,tog2=0;
        for(int i=0;i<n;i++){
            if(arr[i]==find){
                tog1=1;
                System.out.print(i+ " ");
                i++;
                while(arr[i]==find){
                    i++;
                    tog2=1;
                    if(i== arr.length) break;
                }
                if(tog2==1) {
                    System.out.print(i - 1);
                    break;
                }
            }
        }
        if(tog1==0) System.out.println("NO OCCURENCES");
    }
}
