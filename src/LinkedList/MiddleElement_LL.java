package LinkedList;
import java.util.Scanner;

public class MiddleElement_LL {

    static class Node
    {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
        }
    }
    public static void MiddleElement_Naive(Node head)
    {
        if(head == null)
            return;

        int count = 0;

        Node temp = head;

        while(temp != null)
        {
            temp = temp.next;
            count++;
        }
        temp = head;

        int pos = count / 2,i = 1;

        while(i <= pos)
        {
            temp = temp.next;
            i++;
        }

        System.out.println("Middle Element of the LL : "+temp.data);

        // Time Complexity : O(n) where n is the total no. of nodes.
    }
    public static void MiddleElement_BetterSelf(Node head)
    {
        if(head == null)
            return;

        Node temp = head,prev = head;
        int count = 0;

        while(temp != null)
        {
            temp = temp.next;
            count++;

            if(count % 2 == 0)
                prev = prev.next;
        }

        System.out.println("Middle Element of the LL : "+prev.data);

        // Time Complexity : O(n) where n is the total no. of nodes.
    }
    public static void MiddleElement_BetterGFG(Node head)
    {
         if(head == null)
             return;

        Node temp = head,prev = head;

        while(temp != null && temp.next != null) {
                temp = temp.next.next;
                prev = prev.next;
            }

        System.out.println("Middle Element of the LL : "+prev.data);

        // Time Complexity : O(n) where n is the total no. of nodes.
    }
    public static void main(String[] args) {

        Node head1 = new Node(10);
        Node n1 = new Node(20);
        Node n2 = new Node(30);
        Node n3 = new Node(40);
        Node n4 = new Node(50);
        head1.next = n1;
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;

// -------------------------------------------
        Node head2 = new Node(10);
        Node n11 = new Node(20);
        Node n22 = new Node(30);
        Node n33 = new Node(40);

        head2.next = n11;
        n11.next = n22;
        n22.next = n33;
// ------------------------------------------
        Node head3 = new Node(10);
        Node n111 = new Node(20);
        Node n222 = new Node(30);

        head3.next = n111;
        n111.next = n222;

// ------------------------------------------

        Node head4 = new Node(10);
        Node n1111 = new Node(20);

        head4.next = n1111;
// -------------------------------------------

        Node head5 = new Node(10);
// ----------------------------------------------

          Node head6 = null;

 // ------------------Naive Solution---------------------
        MiddleElement_Naive(head1);
        MiddleElement_Naive(head2);
        MiddleElement_Naive(head3);
        MiddleElement_Naive(head4);
        MiddleElement_Naive(head5);
        MiddleElement_Naive(head6);

        System.out.println();
 // ------------------- Self : Better Solution-------------------------

        MiddleElement_BetterSelf(head1);
        MiddleElement_BetterSelf(head2);
        MiddleElement_BetterSelf(head3);
        MiddleElement_BetterSelf(head4);
        MiddleElement_BetterSelf(head5);
        MiddleElement_BetterSelf(head6);

        System.out.println();

        // ------------------- GFG : Better Solution-------------------------

        MiddleElement_BetterGFG(head1);
        MiddleElement_BetterGFG(head2);
        MiddleElement_BetterGFG(head3);
        MiddleElement_BetterGFG(head4);
        MiddleElement_BetterGFG(head5);
        MiddleElement_BetterGFG(head6);

    }
}
