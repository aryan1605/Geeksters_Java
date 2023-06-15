package Queue;

public class Implementation_UsingLinkedList {

    static class Node
    {
        int data;
        Node next;
        Node(int data)
        {
            this.data = data;
            next = null;
        }
    }
    static class Queue
    {
        static Node head;
        static Node tail;

        // Checking Queue is Empty or not.
        public static boolean isEmpty()
        {
            return (head == null && tail == null);
        }

        // add (Adding elements from the rear side)
        public static void add(int data)
        {
            Node newNode = new Node(data);
            if(tail == null)
            {
                head = tail = newNode;
            }

            tail.next = newNode;
            tail = newNode;
        }

        // remove (Removing elements from the front side)
        public static int remove()
        {
            if(isEmpty())
            {
                System.out.println("Queue is Empty");
                return -1;
            }

            int front = head.data;
            if(head == tail)
            {
                tail = null;
            }
            head = head.next;
            return front;
        }


        // peek (Returning the element at the front)
        public static int peek()
        {
            if(isEmpty())
            {
                System.out.println("Queue is Empty");
                return -1;
            }

            return head.data;
        }
    }
    public static void main(String[] args) {
        // Creating Queue Object
        Queue que = new Queue();

        // add
        que.add(1);
        que.add(2);
        que.add(3);

        //Traversal
        while(!(que.isEmpty()))
        {
            System.out.print(que.peek()+" ");
            que.remove();
        }
    }
}
