package DataStructure.Examly.LinkedList;

import java.util.LinkedList;
import java.util.Scanner;

public class InsertInMiddle {
    public static void main(String[] args) {
        LinkedList <Integer> list = new LinkedList<>();
        Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();
        list.add(6);
        list.add(7);
        list.add(n);
        list.add(8);
        list.add(9);
        while (!list.isEmpty()){
            System.out.print(list.remove()+" ");
        }
    }
}
