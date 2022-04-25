package DataStructure.Examly.Hashing;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class FriendList {
    public static void main(String[] args) {
        Map<String, String> map=new HashMap<>();
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            map.put(sc.next(), sc.next());
        }
        String str = sc.next();
        int count=0;
        for(String friend: map.values()){
            if(str.equals(friend))
                count++;
        }
        if(count==0)
            System.out.print("No Friends");
        else
            System.out.print(count+" Friends");
    }
}
