package DataStructure.Examly.Queues;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;

public class SafariRide {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int no_of_cars = sc.nextInt();
        int no_of_pass_at_museum  = sc.nextInt();
        int no_of_pass_at_waiting_for_ride = sc.nextInt();
        int time_for_ride = sc.nextInt();
        int time_for_museum = sc.nextInt();
        int total_time = sc.nextInt();

        int c = no_of_cars;
        int done=0;
        int cars_gone=0;
        Queue<Integer> queue = new ArrayDeque<>();
        int count=1;
        int i =1;
        while (i<= total_time){
            if(i%time_for_museum == 0){
                no_of_pass_at_museum--;
                no_of_pass_at_waiting_for_ride++;
            }

            if(no_of_cars != 0) {
                while (no_of_cars!=0){
                    if(no_of_pass_at_waiting_for_ride== 0){
                        break;
                    }
                    no_of_cars--;
                    no_of_pass_at_waiting_for_ride--;
                    queue.add(i+time_for_ride-1);
                }
            }
            while (!queue.isEmpty() && queue.peek()==i){
                queue.remove();
                no_of_cars+=1;
                done++;
            }

            i++;
        }
        System.out.println(no_of_cars+" "+done+" "+no_of_pass_at_museum+" "+no_of_pass_at_waiting_for_ride);

    }

}