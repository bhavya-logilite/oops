package add_delete_dispay_queue_linkedlist;
import java.util.LinkedList;
import java.util.Queue;

public class Queue_linkedlist {

	public static void main(String[] args) {
	Queue q = new LinkedList<>();
          for(int i = 1; i<=5; i++)
        	  q.add(i);
          System.out.println("elements in queue" + q);
          int dele = (int) q.remove();
          System.out.println("after removel of element:"
                             + dele);
    
          System.out.println(q);
    
          // To view the head of queue
          int fele = (int) q.peek();
          System.out.println("first element of queue is now:"
                             + fele);
	}

}
