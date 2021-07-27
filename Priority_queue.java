package priority_Queue_in_arraay;
import java.util.*;


public class Priority_queue {

	public static void main(String[] args) {
		PriorityQueue<Integer> queue = new PriorityQueue<Integer>();
		queue.add(10);
		queue.add(20);
		queue.add(5);
		queue.add(15);
		System.out.println("the elements are:" + queue);
		System.out.println(queue.isEmpty());
		queue.poll();
		System.out.println("after removing the max element from queue:" + queue);
	}	

}
