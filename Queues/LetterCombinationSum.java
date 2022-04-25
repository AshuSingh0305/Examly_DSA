package DataStructure.Examly.Queues;

import java.util.*;

public class LetterCombinationSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String  str = sc.next();
        int n = sc.nextInt();
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
        int [] asc = new int[128];
        int count=0;
        for(char ch: str.toCharArray()){
            if(asc[ch]==0){
                count++;
            }
            asc[ch]++;
        }
        Integer [] array = new Integer[count];
        count=0;
        for(int i =0 ; i< 128 ;i++){
            if(asc[i] !=0){
                array[count++]=asc[i];
            }
        }

        while(n>0){
            Arrays.sort(array, Collections.reverseOrder());
            array[0]--;
            n--;
        }
        int sum=0;
        for(int i=0;i< array.length;i++){
            sum+= Math.pow(array[i], 2);
        }
        System.out.println(sum);
    }
}
