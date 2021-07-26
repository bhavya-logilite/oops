package add_delete_display_queue_arraylist;
class Queue {
	public static int front,rear,capacity;
	public static int queue[];

     Queue (int c){
    	 front=rear=0;
    	 capacity= c;
    	 queue= new int [capacity];
    	 
     }
     public static void Enequeue(int data) {
    	 if(capacity == rear) {
    		 System.out.println("Queue is full");
    		return;
    	 }
    	 else {
    		 queue[rear] = data;
    		 rear++;
    	 }
    	 return;
     }
     public static void Dequeue() {
    	 if(front == rear) {
    		 System.out.println("Queue is empty");
    		 return;
    	 }
    	 else {
    		 for (int i = 0; i < rear - 1; i++) {
                 queue[i] = queue[i + 1];
    	 }
    		 rear--;
     }
    	 return;
  }
     public static void Display() {
    	 int i;
    	 if(front == rear) {
    		 System.out.println("queue is empty");
    	 }
    	 for(i = front; i < rear; i++) {
    		 System.out.printf("%d :", queue[i]);
    	 }
    	 return;
     }
}
public class queue_arraylist {
	public static void main(String[] args) {
		Queue q= new Queue(4);
		q.Enequeue(10);
		q.Enequeue(20);
		q.Enequeue(30);
		q.Enequeue(40);
		System.out.println("queue elements");
		q.Display();
		q.Dequeue();
		System.out.println("\nafter deleting queue element");
		q.Display();
	}
 
}
