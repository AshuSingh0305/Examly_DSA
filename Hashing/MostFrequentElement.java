package DataStructure.Examly.Hashing;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MostFrequentElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Map<Integer, Integer> map = new HashMap<>();
        for(int i=0;i<n;i++){
            int val = sc.nextInt();
            int count= map.containsKey(val)? map.get(val) :0;
            map.put(val, count+1);
        }
        int max=0;
        int set=1;
        for(var entry: map.entrySet()){
            int temp= entry.getValue();
            if(temp>max){
                max=temp;
                set= entry.getKey();
            }
        }
        System.out.print(set);
    }
}
