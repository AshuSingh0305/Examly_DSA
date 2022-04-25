package DataStructure.Examly.LinkedList;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;

public class ReverseFirstNElements {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        Scanner sc = new Scanner(System.in);
        while (true){
            int val = sc.nextInt();
            if(val==0){
                break;
            }else{
                list.add(val);
            }
        }
        int rev=sc.nextInt();
        LinkedList<Integer> list2 = new LinkedList<>();
        for (int i=0;i<rev;i++){
            list2.addFirst(list.remove());
        }
        while(!list.isEmpty()){
            list2.addLast(list.remove());
        }
        while(!list2.isEmpty()){
            System.out.print(list2.remove()+" ");
        }
    }
}

