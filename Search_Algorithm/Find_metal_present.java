package DataStructure.Examly.Search_Algorithm;

import java.util.LinkedList;
import java.util.Scanner;

public class Find_metal_present {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList<Integer> list = new LinkedList<>();
        for(int i=0;i<5;i++){
            list.add(sc.nextInt());
        }
        int find=sc.nextInt();
        int index = list.indexOf(find);
        if(index>=0) System.out.println("Yes");
        else System.out.println("No");
    }
}
