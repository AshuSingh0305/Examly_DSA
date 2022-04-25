package DataStructure.Examly.Hashing;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class UniqueElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        Map<Integer, Integer> map = new HashMap<>();
        for(int i=0;i<n;i++){
            int val=sc.nextInt();
            int count= map.containsKey(val)? map.get(val):0;
            map.put(val, count+1);
        }
        int arr[]=new int[n];
        int index=0;
        for(var val: map.entrySet()){
            if(val.getValue()==1){
                arr[index++]=val.getKey();
            }
        }
        if(index==0){
            System.out.println("-1");
        }else{
            for(int i=index-1;i>=0;i--){
                System.out.print(arr[i]+" ");
            }
        }

    }
}
