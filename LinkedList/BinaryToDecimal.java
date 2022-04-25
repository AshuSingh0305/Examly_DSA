package DataStructure.Examly.LinkedList;

import java.util.LinkedList;
import java.util.Scanner;
@SuppressWarnings("unchecked")
public class BinaryToDecimal {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum=0;
        for(int i=n-1;i>=0;i--){
            int val=sc.nextInt();
            sum+=(val*Math.pow(2, i));
        }
        System.out.println(sum);
    }
}
