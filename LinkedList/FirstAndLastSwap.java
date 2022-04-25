package DataStructure.Examly.LinkedList;

import java.util.LinkedList;
import java.util.Scanner;

public class FirstAndLastSwap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList list = new LinkedList();
        LinkedList list2 = new LinkedList();
        int n = sc.nextInt();
        for (int i=0;i<n;i++){
            list.add(sc.nextInt());
        }
        System.out.print("Before Swap : ");
        while (!list.isEmpty()){
            int val= (int) list.remove();
            list2.add(val);
            System.out.print(+val+" ");
        }
        System.out.println();
        System.out.print("After Swap : ");
        int temp = (int) list2.remove();
        int temp2 = (int) list2.removeLast();
        list2.add(temp);
        list2.addFirst(temp2);
        while (!list2.isEmpty()){
            System.out.print(list2.remove()+" ");
        }
    }
}
