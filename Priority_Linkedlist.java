package Priority_queue_in_linkedlist;

public class Priority_Linkedlist {
	 static class Node {
	        int data;
	        int priority;
	        Node next;
	        
	        public Node(int data, int priority) {
	            this.data = data;
	            this.priority = priority;
	        }
	    }
	    private static Node head = null;
	    private static void push(int x, int p) {
	        Node newNode = new Node(x, p);
	        if (head == null) {
	            head = newNode;
	            return;
	        }
	        Node temp = head;
	        Node prev = null;
	        while (temp != null && temp.priority > p) {
	            prev = temp;
	            temp = temp.next;
	        }
	        if (temp == null) {
	            prev.next = newNode;
	        } else {
	            if (prev == null) {
	                newNode.next = head;
	                head = newNode;
	            } else {
	                newNode.next = temp;
	                prev.next = newNode;
	            }
	        }
	    }
	    private static int peek() {
	        if (head != null) {
	            return head.data;
	        }
	        return -1;
	    }
	    private static int pop() {
	        if (head != null) {
	            int data = head.data;
	            head = head.next;
	            return data;
	        }
	        return -1;
	    }
	public static void main(String[] args) {
		push(5, 2);
        push(1, 3);
        System.out.println(peek());
        push(7, 5);
        push(9, 1);
        System.out.println(pop());
        System.out.println(pop());
        System.out.println(peek());

	}

}
