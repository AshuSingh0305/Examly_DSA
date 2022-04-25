package DataStructure.Examly.LinkedList;

import java.util.LinkedList;
import java.util.Scanner;
@SuppressWarnings("unchecked")
public class ValueOfIndex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList list = new LinkedList();
        int n = sc.nextInt();
        for (int i=0;i<n;i++){
            list.add(sc.nextInt());
        }
        int ind= sc.nextInt();
        for (int i=1;i<=n;i++){
            if(i==ind){
                list.remove();
            }else{
                System.out.print(list.remove()+" ");
            }
        }
    }
}
