package DataStructure.Examly.LinkedList;

import java.util.LinkedList;
import java.util.Scanner;

public class TrainCoach {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        for(int i =0;i<n;i++){
            list.add(sc.nextInt());
        }
        int a= sc.nextInt();
        boolean y=list.contains(a);
        if(y==true){
            System.out.print(a+": Yes");
        }else {
            System.out.print(a+": No");
        }
    }
}
