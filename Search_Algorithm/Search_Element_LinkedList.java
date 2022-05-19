package DataStructure.Examly.Search_Algorithm;

import java.util.LinkedList;
import java.util.Scanner;

public class Search_Element_LinkedList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        LinkedList<Integer> list = new LinkedList<>();
        for(int i=0;i<n;i++){
            list.add(sc.nextInt());
        }
        int search = sc.nextInt();
        int index = list.indexOf(search);
        if(index<0) System.out.println(search+ " No");
        else System.out.println(search+ " Yes");
    }
}
