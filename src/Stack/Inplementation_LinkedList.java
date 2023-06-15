package Stack;

public class Inplementation_LinkedList {
    static class Node
    {
        int data;
        Node next;
        public Node(int data)
        {
            this.data = data;
            next = null;
        }
    }
    static class Stack
    {
        public static Node head;

        // Checking whether the Stack is Empty or not.
        public static boolean isEmpty()
        {
            return (head == null);
        }

        // Adding the elements at the top
        public static void Push(int data)
        {
            Node newNode = new Node(data);
            if(isEmpty())
            {
                head = newNode;
                return;
            }
            newNode.next = head;
            head = newNode;
        }

        // Removing the elements from the top
        public static int Pop()
        {
            if(isEmpty())
            {
                return -1;
            }
            int top = head.data;
            head = head.next;
            return top;
        }

        // Returning the element at the top
        public static int Peek()
        {
            if(isEmpty())
            {
                return -1;
            }
            return head.data;
        }
    }

    public static void main(String[] args) {
        Stack stk = new Stack();

        stk.Push(1);
        stk.Push(2);
        stk.Push(3);
        stk.Push(4);

        while(!(stk.isEmpty()))
        {
            System.out.println(stk.Peek());
            stk.Pop();
        }
    }
}
