package LinkedList;
import java.util.*;

public class Implementation_CDLL {

    static class Node_CDLL
    {
        int data;
        Node_CDLL prev;
        Node_CDLL next;

        Node_CDLL(int data)
        {
            this.data = data;
        }
    }
    public static void printCDLL_Sequence(Node_CDLL head)
    {
        if(head == null)
            return;

        Node_CDLL temp = head;

        do {
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
        while(temp != head);

        System.out.println();

        // Time Complexity : O(n) where n is the total no. of nodes.
    }
    public static void printCDLL_Reverse(Node_CDLL head)
    {
        if(head == null)
            return;

        Node_CDLL temp = head.prev;

        do {
            System.out.print(temp.data+" ");
            temp = temp.prev;
        }
        while(temp != head.prev);

        System.out.println();

        // Time Complexity : O(n) where n is the total no. of nodes.
    }
    public static Node_CDLL Insert_Begin(Node_CDLL head,int data)
    {
        Node_CDLL newNode = new Node_CDLL(data);

        if(head == null)
        {
            newNode.next = newNode;
            newNode.prev = newNode;

            return newNode;
        }

        newNode.prev = head.prev;
        newNode.next = head;
        head.prev.next = newNode;
        head.prev = newNode;

        return newNode;

        // Time Complexity : O(1)
    }
    public static Node_CDLL Insert_End_OneWay(Node_CDLL head,int data)
    {
        Node_CDLL newNode = new Node_CDLL(data);

        if(head == null)
        {
            newNode.prev = newNode;
            newNode.next = newNode;
            return newNode;
        }

        Node_CDLL temp = head.prev;

        head.prev = newNode;

        newNode.next = temp.next;
        newNode.prev = temp;
        temp.next = newNode;

        return head;

        // Time Complexity : O(1)
    }
    public static Node_CDLL Insert_End_SecondWay(Node_CDLL head,int data)
    {
        Node_CDLL newNode = new Node_CDLL(data);

        if(head == null)
        {
            newNode.next = newNode;
            newNode.prev = newNode;

            return newNode;
        }

        newNode.prev = head.prev;
        newNode.next = head;
        head.prev.next = newNode;
        head.prev = newNode;

        return head;

        // Time Complexity : O(1)
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Node_CDLL head = new Node_CDLL(10);
        Node_CDLL n1 = new Node_CDLL(20);
        Node_CDLL n2 = new Node_CDLL(30);
        Node_CDLL n3 = new Node_CDLL(40);

        head.prev = n3;
        head.next = n1;

        n1.prev = head;
        n1.next = n2;

        n2.prev = n1;
        n2.next = n3;

        n3.prev = n2;
        n3.next = head;

        printCDLL_Sequence(head);
        printCDLL_Reverse(head);
        System.out.println();

        System.out.println("Enter the element to be inserted at the beginning");
        int x = sc.nextInt();
        head = Insert_Begin(head,x);
        printCDLL_Sequence(head);

        System.out.println();

        System.out.println("Enter the element to be inserted at the end");
        x = sc.nextInt();
        head = Insert_End_OneWay(head,x);
        head = Insert_End_SecondWay(head,x+5);
        printCDLL_Sequence(head);
    }
}
