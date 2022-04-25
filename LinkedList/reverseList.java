package DataStructure.Examly.LinkedList;

import java.util.LinkedList;
import java.util.Scanner;

public class reverseList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList list = new LinkedList();
        int n=sc.nextInt();
        for (int i=0;i<n;i++){
            list.addFirst(sc.nextInt());
        }
        while (!list.isEmpty()){
            int val = (int) list.remove();
            System.out.print(val+" ");
        }

    }
}
