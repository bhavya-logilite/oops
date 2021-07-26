package circular_queue_implementation;
import java.util.ArrayList;

public class Circular_Queue {
	private int size,front,rear;
	private ArrayList<Integer> queue = new ArrayList<Integer>();
	Circular_Queue(int size)
	{
	    this.size = size;
	    this.front = this.rear = -1;
	}
	
	public void enqueue(int data)
	{
	    if((front == 0 && rear == size - 1) ||
	      (rear == (front - 1) % (size - 1)))
	    {
	        System.out.print("Queue is Full");
	    }
	    else if(front == -1)
	    {
	        front = 0;
	        rear = 0;
	        queue.add(rear, data);
	    }
	    else if(rear == size - 1 && front != 0)
	    {
	        rear = 0;
	        queue.set(rear, data);
	    }
	    else
	    {
	        rear = (rear + 1);
	        if(front <= rear)
	        {
	            queue.add(rear, data);
	        }
	        else
	        {
	            queue.set(rear, data);
	        }
	    }
	}
	public int dequeue()
	{
	    int temp;
	    if(front == -1)
	    {
	        System.out.print("Queue is Empty");
	        return -1;
	    }
	    temp = queue.get(front);
	    if(front == rear)
	    {
	        front = -1;
	        rear = -1;
	    }
	    else if(front == size - 1)
	    {
	        front = 0;
	    }
	    else
	    {
	        front = front + 1;
	    }
	    return temp;
	}
	public void displayqueue()
	{
	    if(front == -1)
	    {
	        System.out.print("Queue is Empty");
	        return;
	    }	  
	    System.out.print("Elements in the " +
	                     "circular queue are: ");
	    if(rear >= front)
	    {
	        for(int i = front; i <= rear; i++)
	        {
	            System.out.print(queue.get(i));
	            System.out.print(" ");
	        }
	        System.out.println();
	    }
	    else
	    {
	        for(int i = front; i < size; i++)
	        {
	            System.out.print(queue.get(i));
	            System.out.print(" ");
	        }
	        for(int i = 0; i <= rear; i++)
	        {
	            System.out.print(queue.get(i));
	            System.out.print(" ");
	        }
	        System.out.println();
	    }
	}
	public static void main(String[] args) {
		 Circular_Queue q = new Circular_Queue(5);
	     
		    q.enqueue(10);
		    q.enqueue(15);
		    q.enqueue(18);
		    q.enqueue(88);
		    q.displayqueue();		 
		    int x = q.dequeue();
		    if(x != -1)
		    {
		        System.out.print("Deleted element is = ");
		        System.out.println(x);
		    }
		 
		    q.displayqueue();
		    q.enqueue(90);
		    q.enqueue(2);
		    q.displayqueue();

	}

}
