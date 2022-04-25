package DataStructure.Examly.LinkedList;

import java.util.LinkedList;
import java.util.Scanner;

public class InsertElementAtEnd {
    public static void main(String[] args) {
        LinkedList <Integer> list = new LinkedList<>();
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        int s=sc.nextInt();
        for(int i=0;i<s;i++){
            list.add(sc.nextInt());
        }
        list.add(n);
        while (!list.isEmpty()){
            System.out.print(list.remove());
        }
    }
}
