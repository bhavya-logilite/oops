package delet_stack_element;
import java.util.*;
public class delet_element {

	public static void main(String[] args) {
		Stack stack= new Stack();
		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.push(4);
		stack.push(5);
		stack.push(6);
		System.out.println("initial elemnts:" + stack);
		System.out.println("poped element:" + stack.pop());
		System.out.println("remaning elements:" + stack);
	}

}
