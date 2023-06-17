package LinkedList;

public class ReverseLL {

    static class Node
    {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
        }
    }
    public static void printLL_Iterative(Node head)
    {
        if(head == null)
        {
            System.out.println("Empty LinkedList");
            return;
        }

        Node temp = head;

        while(temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }

        System.out.println();
        // Time Complexity : O(n) where n is the total no. of nodes
        // Auxiliary Space : O(1)
    }
    public static Node Reverse_LinkedList(Node head) // Self Iterative Method
    {

        Node tail_head = null,temp = head,prev = null;

        while(temp != null)
        {
            prev = temp;
            temp = temp.next;

            prev.next = tail_head;
            tail_head = prev;
        }
        return tail_head;

        // Time Complexity : O(n) where n is the total no. of nodes
        // Auxiliary Space : O(1)
    }
    public static Node Reverse_LinkedListGFG(Node head) // GFG Iterative Method
    {
          if(head == null)
              return head;

          Node prev = null,curr = head;

          while(curr != null)
          {
              Node next = curr.next;
              curr.next = prev;
              prev = curr;
              curr = next;
          }

          return prev;

        // Time Complexity : O(n) where n is the total no. of nodes
        // Auxiliary Space : O(1)
    }
    public static Node reverseListSG(Node head) { // Self and GFG Second Recursive Method

        return reverseLL(head,null);
    }
    public static Node reverseLL(Node head, Node prev) {

        if(head == null)
            return prev;

        Node next = head.next;
        head.next = prev;

        return reverseLL(next,head);

        // Time Complexity : O(n) where n is the total no. of nodes
        // Auxiliary Space : O(n)

    }
    public static Node reverseListGFG(Node head) // GFG First Recursive Solution
    {
        if(head == null || head.next == null)
            return head;

        Node rev_head = reverseListGFG(head.next);
        Node rev_tail = head.next;
        rev_tail.next = head;
        head.next = null;

        return rev_head;

        // Time Complexity : O(n) where n is the total no. of nodes
        // Auxiliary Space : O(n)
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

//      ------------Iterative Solution-----------
          head1 = Reverse_LinkedList(head1);
          head2 = Reverse_LinkedList(head2);
          head3 = Reverse_LinkedList(head3);
          head4 = Reverse_LinkedList(head4);
          head5 = Reverse_LinkedList(head5);
          head6 = Reverse_LinkedList(head6);

          printLL_Iterative(head1);
          printLL_Iterative(head2);
          printLL_Iterative(head3);
          printLL_Iterative(head4);
          printLL_Iterative(head5);
          printLL_Iterative(head6);

         head1 = Reverse_LinkedListGFG(head1);
         head2 = Reverse_LinkedListGFG(head2);
         head3 = Reverse_LinkedListGFG(head3);
         head4 = Reverse_LinkedListGFG(head4);
         head5 = Reverse_LinkedListGFG(head5);
         head6 = Reverse_LinkedListGFG(head6);

         printLL_Iterative(head1);
         printLL_Iterative(head2);
         printLL_Iterative(head3);
         printLL_Iterative(head4);
         printLL_Iterative(head5);
         printLL_Iterative(head6);

// --------------- Recursive Solution ----------------
         head1 = reverseListSG(head1);
         head2 = reverseListSG(head2);
         head3 = reverseListSG(head3);
         head4 = reverseListSG(head4);
         head5 = reverseListSG(head5);
         head6 = reverseListSG(head6);

         printLL_Iterative(head1);
         printLL_Iterative(head2);
         printLL_Iterative(head3);
         printLL_Iterative(head4);
         printLL_Iterative(head5);
         printLL_Iterative(head6);

        head1 = reverseListGFG(head1);
        head2 = reverseListGFG(head2);
        head3 = reverseListGFG(head3);
        head4 = reverseListGFG(head4);
        head5 = reverseListGFG(head5);
        head6 = reverseListGFG(head6);

        printLL_Iterative(head1);
        printLL_Iterative(head2);
        printLL_Iterative(head3);
        printLL_Iterative(head4);
        printLL_Iterative(head5);
        printLL_Iterative(head6);
    }
}
