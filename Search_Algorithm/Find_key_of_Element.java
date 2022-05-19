package DataStructure.Examly.Search_Algorithm;

import java.util.LinkedList;
import java.util.Scanner;

public class Find_key_of_Element {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        LinkedList<Integer> list = new LinkedList<>();
        for(int i=0;i<n;i++){
            list.add(sc.nextInt());
        }
        int find=sc.nextInt();
        int index = list.indexOf(find);
        if(index>=0) System.out.println("Index of "+ find+" is "+ index);
        else System.out.println("Not found");
    }
}
