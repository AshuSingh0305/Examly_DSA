package DataStructure.Examly.LinkedList;

import java.util.Scanner;
import java.util.LinkedList;

public class CheckPallindrome {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int j=10;
        for(int i=0;i<6;i++){
            list.add(j);
            j=j+10;
        }
        for(int i=0;i<6;i++){
            int val = (int) list.remove();
            list.add(val);
            System.out.print(val+" ");
        }
        System.out.println();
        for(int i=0;i<n;i++){
            list.add(list.remove());
        }
        while (!list.isEmpty()){
            System.out.print(list.remove()+" ");
        }
    }
}