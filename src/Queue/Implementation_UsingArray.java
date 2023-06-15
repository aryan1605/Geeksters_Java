package Queue;

public class Implementation_UsingArray {
    static class Queue
    {
       static int [] queue_arr;
       static int size;
       static int rear = -1;

       Queue(int size)
       {
           queue_arr = new int[size];
           this.size = size;
       }

       // Checking Queue is Empty or not.
       public static boolean isEmpty()
       {
           return (rear == -1);
       }

       // add (Adding elements from the rear side)
       public static void add(int data)
       {
           if(rear == size-1)
           {
               System.out.println("Queue is Full");
               return;
           }

           rear++;
           queue_arr[rear] = data;
       }

       // remove (Removing elements from the front side)
       public static int remove()
       {
           if(isEmpty())
           {
               System.out.println("Queue is Empty");
               return -1;
           }

           int front = queue_arr[0];
           for(int i = 0;i<rear;i++)
               queue_arr[i] = queue_arr[i+1];

           rear--;
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

            int front = queue_arr[0];

            return front;
        }
    }
    public static void main(String[] args) {

        // Creating Queue Object
        Queue que = new Queue(5);

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
