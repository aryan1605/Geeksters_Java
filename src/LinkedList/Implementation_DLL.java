package LinkedList;
import java.util.*;

/*
    In Java, there is a automatic garbage collector which automatically deallocates the memory when not in use.

    Here, while deleting a node, we should not worry about the deleted node, it will automatically be garbage collected.
 */
public class Implementation_DLL {

    static class Node_DLL
    {
        int data;
        Node_DLL prev;
        Node_DLL next;

        Node_DLL(int data)
        {
            this.data = data;
            prev = null;
            next = null;
        }
    }
    public static void printDLL_Sequence(Node_DLL head)
    {
        if(head == null)
            return;

        Node_DLL temp = head;

        while(temp != null)
        {
            System.out.print(temp.data+" ");
            temp = temp.next;
        }

        //Time Complexity : O(n) where n is the total no. of nodes.
    }
    public static void printDLL_Reverse(Node_DLL head)
    {
        if(head == null)
            return;

        Node_DLL temp = head;

        while(temp.next != null)
            temp = temp.next;

        while(temp != null)
        {
            System.out.print(temp.data+" ");
            temp = temp.prev;
        }

        //Time Complexity : O(n) where n is the total no. of nodes.
    }
    public static Node_DLL Insert_Begin(Node_DLL head,int data)
    {
        Node_DLL newNode = new Node_DLL(data);

        if(head == null)
            return newNode;

        newNode.next = head;
        head.prev = newNode;

        return newNode;

        // Time Complexity : O(1)
    }
    public static Node_DLL Insert_End(Node_DLL head,int data)
    {
        Node_DLL newNode = new Node_DLL(data);

        if(head == null)
        {
            return newNode;
        }

        Node_DLL temp = head;

        while(temp.next != null)
        {
            temp = temp.next;
        }

        newNode.prev = temp;
        temp.next = newNode;

        return head;

        // Time Complexity : O(n) where n is the total no. of nodes.
    }
    public static Node_DLL Delete_Begin(Node_DLL head)
    {
        if(head == null || (head.next == null && head.prev == null))
            return null;

        head.next.prev = null;
        return head.next;

        // Time Complexity : O(1)
    }
    public static Node_DLL Delete_End(Node_DLL head)
    {
        if(head == null || (head.next == null && head.prev == null))
            return null;

        Node_DLL temp = head;
        while(temp.next != null)
        {
            temp = temp.next;
        }

        temp.prev.next = null;
        return head;

        // Time Complexity : O(n) where n is the total no. of nodes.
    }
    public static Node_DLL Reverse_DLL(Node_DLL head)
    {
        if(head == null || (head.next == null && head.prev == null))
        {
            return head;
        }

        Node_DLL temp1 = head,temp2 = null;
        while(temp1 != null)
        {
            temp2 = temp1.prev;
            temp1.prev = temp1.next;
            temp1.next = temp2;

            temp1 = temp1.prev;
        }

        return temp2.prev;

        //Time Complexity : O(n) where n is the total no. of nodes.
    }
    public static int lengthDLL(Node_DLL head)
    {
        if(head == null)
            return 0;
        else if(head.next == null && head.prev == null)
            return 1;

        int count = 0;
        Node_DLL temp = head;

        while(temp != null)
        {
            count++;
            temp = temp.next;
        }
        return count;

        //Time Complexity : O(n) where n is the total no. of nodes.
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Node_DLL n1 = new Node_DLL(10);
        Node_DLL n2 = new Node_DLL(20);
        Node_DLL n3 = new Node_DLL(30);

        n1.next = n2;
        n2.next = n3;

        n3.prev = n2;
        n2.prev = n1;

        Node_DLL head = n1;

        printDLL_Sequence(head);
        System.out.println();
        printDLL_Reverse(head);
        System.out.println();

        System.out.println("Enter the element to be inserted at the beginning");
        int x = sc.nextInt();
        head = Insert_Begin(head,x);
        printDLL_Sequence(head);
        System.out.println();

        System.out.println("Enter the element to be inserted at the end");
        x = sc.nextInt();
        head = Insert_End(head,x);
        printDLL_Sequence(head);
        System.out.println();

        head = Reverse_DLL(head);
        printDLL_Sequence(head);
        System.out.println();

        head = Delete_Begin(head);
        printDLL_Sequence(head);
        System.out.println();

        head = Delete_End(head);
        printDLL_Sequence(head);
    }
}
