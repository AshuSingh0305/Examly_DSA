package DataStructure.Examly.Queues;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class BinaryPrint {

    public static void main(String[] args) {
        FindBinary findBinary = new FindBinary();
        Queue<Integer> queue = new ArrayDeque<>();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=0;i<n;i++){
            int val =(int) Math.pow(2, i);
            if(val>n){
                break;
            }else{
                queue.add(val);
            }
        }
        int que= queue.size();
        int arr[]=new int[que];
        for(int i=0;i<que;i++){
            arr[i]=queue.remove();
        }

        while (n>0){
            findBinary.find(n,arr);
            n--;
        }
        while (!findBinary.stack.isEmpty()){
            System.out.println(findBinary.stack.pop());
        }
    }
}

class FindBinary{
    Stack<String> stack = new Stack<>();
    public void find(int n, int arr[]){
        String str = "";
        for(int i = arr.length-1; i>=0 ; i--){
            if(arr[i] <= n){
                str+="1";
                n-= arr[i];
            }else if(n==0){
                while (i>=0){
                    str+="0";
                    i--;
                }
                break;
            }
            else if(!str.equals("")) {
                str+="0";
            }
        }
        stack.push(str);
    }
}