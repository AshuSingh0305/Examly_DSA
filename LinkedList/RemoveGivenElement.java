package DataStructure.Examly.LinkedList;

import java.util.LinkedList;
import java.util.Scanner;

public class RemoveGivenElement {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i=0;i<n;i++){
            list.addFirst(sc.nextInt());
        }
        int rem=sc.nextInt();
        int index=list.indexOf(rem);
        for(int i=0;i<n;i++){
            if(i!=index){
                System.out.print(list.remove()+" ");
            }else{
                list.remove();
            }
        }
    }
}
