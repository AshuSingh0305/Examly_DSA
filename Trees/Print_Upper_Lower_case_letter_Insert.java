package DataStructure.Examly.Trees;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class Print_Upper_Lower_case_letter_Insert {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        char arr[]=new char[n];
//        char arr2[]=new char[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.next().charAt(0);
        }
        Arrays.sort(arr);
        Stack<Character> stack=new Stack<>();
        for(int i=0;i<n;i++){
            if(arr[i]>='A'&&arr[i]<='Z'){
                System.out.print(arr[i]+" ");
            }else{
                stack.push(arr[i]);
            }
        }
        System.out.println();
        while (!stack.isEmpty()){
            System.out.print(stack.pop()+" ");
        }
    }
}

