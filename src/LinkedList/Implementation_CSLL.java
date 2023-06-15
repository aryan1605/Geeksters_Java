package LinkedList;
import java.util.Scanner;

/*
    In Java, there is a automatic garbage collector which automatically deallocates the memory when not in use.

    Here, while deleting a node, we should not worry about the deleted node, it will automatically be garbage collected.
 */
public class Implementation_CSLL {

    static class Node_CSLL
    {
        int data;
        Node_CSLL next;

        Node_CSLL(int data)
        {
            this.data = data;
        }
    }
    public static void printCSLL_while(Node_CSLL head)
    {
        if(head == null)
            return;

        System.out.print(head.data+" ");
        Node_CSLL temp = head.next;

        while(temp != head)
        {
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
        System.out.println();

        // Time Complexity : O(n) where n is the total no. of nodes.
    }
    public static void printCSLL_dowhile(Node_CSLL head)
    {
        if(head == null)
            return;

        Node_CSLL temp = head;

        do {
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
        while(temp != head);

        System.out.println();

        // Time Complexity : O(n) where n is the total no. of nodes.
    }
    public static Node_CSLL Insert_Begin_N(Node_CSLL head,int data)
    {
        Node_CSLL newNode = new Node_CSLL(data);

        if(head == null)
        {
            newNode.next = newNode;
            return newNode;
        }

        Node_CSLL temp = head;

        while(temp.next != head) // Calculating the tail reference.
        {
            temp = temp.next;
        }

        newNode.next = head;
        temp.next = newNode;

        return newNode;

        // Time Complexity : O(n) where n is the total no. of nodes.
        /*
            One way to optimize to O(1) is to maintain a tail reference,
            therefore we don't have to run a loop to calculate the tail reference.
         */
    }
    public static Node_CSLL Insert_Begin_1(Node_CSLL head,int data)
    {
        Node_CSLL newNode = new Node_CSLL(data);

        if(head == null)
        {
            newNode.next = newNode;
            return newNode;
        }

        newNode.next = head.next;
        head.next = newNode;

        int t = head.data;
        head.data = newNode.data;
        newNode.data = t;

        return head;

        // Time Complexity : O(1)
    }
    public static Node_CSLL Insert_End_N(Node_CSLL head,int data)
    {
        Node_CSLL newNode = new Node_CSLL(data);

        if(head == null)
        {
            newNode.next = newNode;
            return newNode;
        }

        Node_CSLL temp = head;

        while(temp.next != head) // Calculating the tail reference.
        {
            temp = temp.next;
        }

        newNode.next = head;
        temp.next = newNode;

        return head;

        // Time Complexity : O(n) where n is the total no. of nodes.
        /*
            One way to optimize to O(1) is to maintain a tail reference,
            therefore we don't have to run a loop to calculate the tail reference.
         */
    }
    public static Node_CSLL Insert_End_1(Node_CSLL head,int data)
    {
       Node_CSLL newNode = new Node_CSLL(data);

       if(head == null)
       {
           newNode.next = newNode;
           return newNode;
       }

       newNode.next = head.next;
       head.next = newNode;

       int t = newNode.data;
       newNode.data = head.data;
       head.data = t;

       return newNode;

       // Time Complexity : O(1)

    }
    public static Node_CSLL Delete_Begin_N(Node_CSLL head)
    {
        if(head == null || head.next == head)
            return null;

        Node_CSLL temp = head;

        while(temp.next != head)
        {
            temp = temp.next;
        }

        temp.next = head.next;

        return head.next;

        // Time Complexity : O(n) where n is the total no. of nodes.
    }
    public static Node_CSLL Delete_Begin_1(Node_CSLL head)
    {
        if(head == null || head.next == head)
            return null;

        head.data = head.next.data;
        head.next = head.next.next;

        return head;

        // Time Complexity : 0(1)
    }
    public static Node_CSLL Delete_K(Node_CSLL head,int k)
    {
        /*
            Assumption : No. of nodes >= k
         */
       if(head == null)
           return head;

       if(k == 1)
       {
           return Delete_Begin_1(head); // -----> O(1)
       }

       Node_CSLL temp = head;
       int i = 1;

       while(i <= k-2)
       {
           temp = temp.next;
           i++;
       }

       temp.next = temp.next.next;

       return head;

        // Time Complexity : O(n) where n is the total no. of nodes.
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Node_CSLL head = new Node_CSLL(10);
        Node_CSLL n1 = new Node_CSLL(20);
        Node_CSLL n2 = new Node_CSLL(30);
        Node_CSLL n3 = new Node_CSLL(40);

        head.next = n1;
        n1.next = n2;
        n2.next = n3;
        n3.next = head;

        printCSLL_while(head);
        printCSLL_dowhile(head);

        System.out.println("Enter the element to be inserted at the beginning");
        int x = sc.nextInt();
        head = Insert_Begin_N(head,x);
        head = Insert_Begin_1(head,x-1);
        printCSLL_dowhile(head);

        System.out.println("Enter the element to be inserted at the end");
        x = sc.nextInt();
        head = Insert_End_N(head,x);
        head = Insert_End_1(head,x+1);
        printCSLL_while(head);

        head = Delete_Begin_N(head);
        head = Delete_Begin_1(head);
        printCSLL_while(head);

        System.out.println("Enter the position at which you want to delete the node.");
        int k = sc.nextInt();
        head = Delete_K(head,k);
        printCSLL_dowhile(head);
    }
}
