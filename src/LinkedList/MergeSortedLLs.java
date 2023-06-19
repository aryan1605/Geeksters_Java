package LinkedList;

public class MergeSortedLLs {

    static class Node
    {
        int data;
        Node next;

        public Node(int data)
        {
            this.data = data;
        }
    }
    public static void printLL_Iterative(Node head)
    {
        if(head == null)
            return;

        Node temp = head;

        while(temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
        // Time Complexity : O(n) where n is the total no. of nodes
        // Auxiliary Space : O(1)
    }
    public static Node merger(Node head1,Node head2)
    {
        if(head1 == null)
            return head2;
        else if(head2 == null)
            return head1;

        Node temp1 = head1,temp2 = head2,merger_head = null,merger_tail = null;
        if(temp1.data <= temp2.data)
        {
            merger_head = temp1;
            merger_tail = temp1;
            temp1 = temp1.next;
        }
        else
        {
            merger_head = temp2;
            merger_tail = temp2;
            temp2 = temp2.next;
        }
        while(temp1 != null && temp2 != null)
        {
            if(temp1.data <= temp2.data)
            {
                merger_tail.next = temp1;
                merger_tail = temp1;
                temp1 = temp1.next;
            }
            else
            {
                merger_tail.next = temp2;
                merger_tail = temp2;
                temp2 = temp2.next;
            }
        }
        if(temp1 == null)
        {
            merger_tail.next = temp2;

        }
        else
        {
            merger_tail.next = temp1;
        }

        return merger_head;

        // Time Complexity : O(m + n) where m & n are the lengths of the given LLs respectively
        // Auxiliary Space : O(1)
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
        Node head2 = new Node(5);
        Node n11 = new Node(15);
        Node n22 = new Node(25);
        Node n33 = new Node(56);

        head2.next = n11;
        n11.next = n22;
        n22.next = n33;
// ------------------------------------------
        Node head3 = new Node(1);
        Node n111 = new Node(2);
        Node n222 = new Node(3);

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

// -----------------------------------------------

        Node head7 = new Node(5);
        Node n1111111 = new Node(15);
        Node n2222222 = new Node(25);
        Node n3333333 = new Node(56);

        head7.next = n1111111;
        n1111111.next = n2222222;
        n2222222.next = n3333333;

        printLL_Iterative(merger(head1,head3));
        printLL_Iterative(merger(head2,head7));
        printLL_Iterative(merger(null,head4));
        printLL_Iterative(merger(head5,null));
        printLL_Iterative(merger(null,null));
        /*
           All the other cases including the corner cases are being tested.
         */
    }
}
