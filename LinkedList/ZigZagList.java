package DataStructure.Examly.LinkedList;

import java.util.Scanner;

class ZigZagList {

    /* Link list Node */
    static class Node {
        int data;
        Node next;
    }
    static Node head = null;
    static int temp = 0;

    // This function distributes
    // the Node in zigzag fashion
    static void zigZagList(Node head)
    {
        // If flag is true, then
        // next node should be greater
        // in the desired output.
        boolean flag = true;

        // Traverse linked list starting from head.
        Node current = head;
        while (current != null && current.next != null) {
            if (flag == true) /* "<" relation expected */
            {
                /* If we have a situation like A > B > C
            where A, B and C are consecutive Nodes
            in list we get A > B < C by swapping B
            and C */
                if (current.data > current.next.data) {
                    temp = current.data;
                    current.data = current.next.data;
                    current.next.data = temp;
                }
            }
            else /* ">" relation expected */
            {
                /* If we have a situation like A < B < C where
            A, B and C are consecutive Nodes in list we
            get A < C > B by swapping B and C */
                if (current.data < current.next.data) {
                    temp = current.data;
                    current.data = current.next.data;
                    current.next.data = temp;
                }
            }

            current = current.next;

            /* flip flag for reverse checking */
            flag = !(flag);
        }
    }

    /* UTILITY FUNCTIONS */
    /* Function to push a Node */
    static void push(int new_data)
    {
        /* allocate Node */
        Node new_Node = new Node();

        /* put in the data */
        new_Node.data = new_data;

        /* link the old list off the new Node */
        new_Node.next = (head);

        /* move the head to point to the new Node */
        (head) = new_Node;
    }

    /* Function to print linked list */
    static void printList(Node Node)
    {
        while (Node != null) {
            System.out.print(Node.data + "->");
            Node = Node.next;
        }
        System.out.println("NULL");
    }

    /* Driver code*/
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i=0;i<n;i++){
            push(sc.nextInt());
        }

        printList(head);

        zigZagList(head);

        printList(head);
    }
}