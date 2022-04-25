package DataStructure.Examly.Hashing;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ClassMarksAndAverage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        Map<String, Integer> map = new HashMap<>();
        sc.next();
        String str[] = new String[n];
        String arr[] = new String[n];
        for(int i=0 ; i< n ; i++){
            String name = sc.nextLine();
            int marks = Integer.parseInt(sc.nextLine());
            map.put(name, marks);
            str[i]=name;
        }

        int x = sc.nextInt();
        int y = sc.nextInt();
        if(x>y){
            int temp=x;
            x=y;
            y=temp;
        }

        float average =0;
        int count=0;
        System.out.println(map);
        int i=0;
        for(var entry :map.entrySet()){
            if(entry.getValue()<= y && entry.getValue()>=x ) {
                arr[i++]= entry.getKey();
//                System.out.println(entry.getKey() + " # " + entry.getValue());
                average+=entry.getValue();
                count++;
            }
        }
        for(int j=0;j<i;j++){
            for(var entry: map.entrySet()){
//                System.out.println(entry.getValue(arr[i]));
            }
        }
        average/=count;
        if(count==0)
            System.out.println("No results");
        else
            System.out.println(String.format(java.util.Locale.US,"%.2f", average));
    }
}