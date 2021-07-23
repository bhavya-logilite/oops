package add_delet_element_in_linkedlist;
import static java.lang.System.exit;

//Create Stack Using Linked list
class Linkedlist {

	// A linked list node
	private class Node {

		int data; 
		Node link;
	}
	Node top;
	Linkedlist()
	{
		this.top = null;
	}

	public void push(int x)
	{
		// create new node temp and allocate memory
		Node temp = new Node();

		temp.data = x;

		temp.link = top;

		// update top reference
		top = temp;
	}

	//  function to check if the stack is empty or not
	public boolean isEmpty()
	{
		return top == null;
	}

	//  function to return top element in a stack
	public int peek()
	{
		// check for empty stack
		if (!isEmpty()) {
			return top.data;
		}
		else {
			System.out.println("Stack is empty");
			return -1;
		}
	}

	//  function to pop top element from the stack
	public void pop() 
	{
		// check for stack underflow
		if (top == null) {
			System.out.print("\nStack Underflow");
			return;
		}

		// update the top pointer to point to the next node
		top = (top).link;
	}

	public void display()
	{
		// check for stack underflow
		if (top == null) {
			System.out.printf("\nStack Underflow");
			exit(1);
		}
		else {
			Node temp = top;
			while (temp != null) {

				// print node data
				System.out.printf("%d-", temp.data);

				// assign temp link to temp
				temp = temp.link;
			}
		}
	}
}
//main class
public class  add_delet_element_in_linkedlist {
	public static void main(String[] args)
	{
		// create Object of Implementing class
		Linkedlist obj = new Linkedlist();
		// insert Stack value
		obj.push(11);
		obj.push(22);
		obj.push(33);
		obj.push(44);
		
		obj.display();
		
		System.out.printf("Top element is %d\n", obj.peek());
		
		obj.pop();
		obj.display();
		System.out.printf("after pop %d", obj.peek());
	}
}
