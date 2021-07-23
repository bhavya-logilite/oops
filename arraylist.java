package add_remove_element_in_arraylist;
import java.util.*;

class stack<T> {

		// An Empty array list
		ArrayList<T> A;

		// Default value of top variable when stack is empty
		int top = -1;

		// Variable to store size of array
		int size;
		
		stack(int size)
		{
			this.size = size;

			this.A = new ArrayList();
		}
		// To push  element into stack
		void push(T X)
		{
			// Checking if array is full
			if (top + 1 == size) {

				// Display message when array is full
				System.out.println("Stack Overflow");
			}
			else {

				// Increment top to go to next position
				top = top + 1;

				// Over-writing existing element
				if (A.size() > top)
					A.set(top, X);

				else

					// Creating new element
					A.add(X);
			}
		}
		// To return topmost element of stack
		T top()
		{
			// If stack is empty
			if (top == -1) {

				// Display message when there are no elements in
				System.out.println("Stack Underflow");

				return null;
			}
			// return the topmost element
			else
				return A.get(top);
		}
		void pop()
		{
			// If stack is empty
			if (top == -1) {

				System.out.println("Stack Underflow");
			}

			else
				top--;
		}
		boolean empty() { return top == -1; }


		public String toString()
		{

			String Ans = "";

			for (int i = 0; i < top; i++) {
				Ans += String.valueOf(A.get(i)) + "->";
			}

			Ans += String.valueOf(A.get(top));

			return Ans;
		}
	}
	public class arraylist {

		public static void main(String[] args)
		{
			stack stack1 = new stack(3);
			stack1.push(10);
			stack1.push(20);
			stack1.push(30);
			System.out.println("stack1 elements" + stack1);
			stack1.pop();
			System.out.println("stack1 after pop :" + stack1);

			stack<String> stack2 = new stack<>(3);
			stack2.push("hello");
			stack2.push("world");
			stack2.push("java");
			System.out.println("stack2 elements:" + stack2);
			stack2.pop();
			System.out.println("stack2 after pop:"  + stack2);
	}

}
