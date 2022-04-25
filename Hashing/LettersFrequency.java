package DataStructure.Examly.Hashing;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Scanner;

public class LettersFrequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<Character , Integer> map = new HashMap<>();
        String str = sc.nextLine();
        str =str.toLowerCase();
        char [] array = new char[128];
        for(char ch :str.toCharArray()){
            array[ch]++;
        }
        for(int i =0 ; i<128 ; i++ ){
            if(array[i] != 0 && i!=32){
                System.out.println((char)i+" - "+(int) array[i]);
            }
        }
//        System.out.println(map);

    }
}
