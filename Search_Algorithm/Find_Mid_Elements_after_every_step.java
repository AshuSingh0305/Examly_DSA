package DataStructure.Examly.Search_Algorithm;
import java.util.Scanner;

public class Find_Mid_Elements_after_every_step {
    private Node first;
    private Node last;
    private int size;
    class Node{
        public int value;
        public Node next;

        public Node(int value){
            this.value = value;
        }
    }
    public void addFirst(int value){
        var node = new Node(value);
        if(first == null)
            first=last=node;
        else {
            node.next=first;
            first=node;
        }
        size++;
    }
    public void findKthNode(int k){
        Node pointer1 = first;
        Node pointer2 = first;
        int j =1;
        while (j<= k-1){
            pointer2=pointer2.next;
            j++;
        }
        while (pointer2!=last){
            pointer1=pointer1.next;
            pointer2=pointer2.next;
        }
        System.out.println(pointer1.value);
    }
    public int [] toArray(){
        int [] array = new int[size];
        Node current = first;
        int index=0;
        while (current!=null){
            array[index++] = current.value;
            current=current.next;
        }
        return array;
    }
}
class FMEAES{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Find_Mid_Elements_after_every_step list = new Find_Mid_Elements_after_every_step();
        for(int i=6;i>0;i--){
            list.addFirst(i);
            int arr[] = list.toArray();
            for (int j=0;j<arr.length;j++){
                System.out.print(arr[j]+"->");
            }
            System.out.println("NULL");
            int mid;
            if(arr.length%2==0){
                mid=(arr.length/2);
            }else{
                mid=(arr.length/2)+1;
            }
            System.out.print("Middle element is ");
            list.findKthNode(mid);
        }


    }
}
