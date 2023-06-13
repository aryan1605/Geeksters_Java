package LinkedList;
import java.util.*;

public class Implementation_SLL {

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

        // Time Complexity : O(n) where n is the total no. of nodes
        // Auxiliary Space : O(1)
    }
    public static void printLL_Recursive(Node head)
    {
        if(head == null)
            return;

        System.out.print(head.data+" ");
        printLL_Recursive(head.next);

        // Time Complexity : O(n) where n is the total no. of nodes.
        // Auxiliary Space : O(n) where n is the total no. of nodes.
    }
    public static Node Insert_Beginning(Node head,int data)
    {
        Node newNode = new Node(data);

        if(head == null)
            return newNode;

        newNode.next = head;
        return newNode;

        // Time Complexity : O(1)
    }
    public static Node Insert_End(Node head,int data)
    {
        Node newNode = new Node(data);

        if(head == null)
            return newNode;

        Node temp = head;
        while(temp.next != null)
        {
            temp = temp.next;
        }
        temp.next = newNode;

        return head;

        // Time Complexity : O(n) where n is the no. of nodes in LL.
    }
    public static Node Insert_AnyPosition(int pos,int data,Node head)
    {
        Node newNode = new Node(data);

        if(pos == 1)
        {
           newNode.next = head;
           return newNode;
        }

         int i = 1;
         Node temp = head;

         while(i <= pos-2 && temp != null)
         {
             temp = temp.next;
             i++;
         }

         if(temp == null)
             return head;

         newNode.next = temp.next;
         temp.next = newNode;

         return head;

         // Time Complexity : O(n) where n is the no. of nodes in LL.
    }

    public static Node Delete_Beginning(Node head)
    {
        if(head == null)
            return null;

        return head.next;

        // Time Complexity : O(1)
    }
    public static Node Delete_End(Node head)
    {
        if(head == null || head.next == null)
            return null;

        Node temp = head;
        while(temp.next.next != null)
        {
            temp = temp.next;
        }
        temp.next = null;

        return head;

        // Time Complexity : O(n) where n is the no. of nodes in LL.
    }
    public static int length_LL(Node head)
    {
        if(head == null)
           return 0;

        int count = 0;
        Node temp = head;
        while(temp != null)
        {
            count++;
            temp = temp.next;
        }
        return count;

        // Time Complexity : O(n) where n is the no. of nodes in LL.
    }
    public static int Search_Iterative(Node head,int data)
    {
        Node temp = head;

        for(int i = 1;temp != null;i++)
        {
            if(temp.data == data)
                return i;

            temp = temp.next;
        }

        return -1;

        // Time Complexity : O(n) where n is the no. of nodes in LL.
        // Auxiliary Space : O(1)
    }
    public static int Search_Recursive(Node head,int data)
    {
        if(head == null)
            return -1;
        else if(head.data == data)
            return 1;

        int pos = Search_Recursive(head.next,data);
        if(pos == -1)
            return -1;
        else
            return (pos+1);

        // Time Complexity : O(n) where n is the no. of nodes in LL.
        // Auxiliary Space : O(n)
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Node n1 = new Node(10);
        Node n2 = new Node(20);
        Node n3 = new Node(30);

        n1.next = n2;
        n2.next = n3;

        printLL_Iterative(n1);
        System.out.println();
        printLL_Recursive(n1);
        System.out.println();

        System.out.println("Enter the element to be inserted at beginning");
        int x = sc.nextInt();

        n1 = Insert_Beginning(n1,x);
        printLL_Iterative(n1);
        System.out.println();

        System.out.println("Enter the element to be inserted at the end");
        x = sc.nextInt();

        n1 = Insert_End(n1,x);
        printLL_Iterative(n1);
        System.out.println();

        n1 = Delete_Beginning(n1);
        printLL_Iterative(n1);
        System.out.println();

        n1 = Delete_End(n1);
        printLL_Iterative(n1);
        System.out.println();

        System.out.println("Enter the position and the data to be inserted");
        int pos = sc.nextInt();
        x = sc.nextInt();
        n1 = Insert_AnyPosition(pos,x,n1);
        printLL_Iterative(n1);

        System.out.println();
        System.out.println("Enter the element to be searched");
        x = sc.nextInt();

        int pos1 = Search_Iterative(n1,x);
        int pos2 = Search_Recursive(n1,x);

        if(pos1 == -1)
            System.out.println("Element is not present");
        else
            System.out.println("Element is present at position "+pos1+".");

        if(pos2 == -1)
            System.out.println("Element is not present");
        else
            System.out.println("Element is present at position "+pos2+".");
    }
}
