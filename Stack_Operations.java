package Advance_DSA;
import java.util.*;
public class Stack_Operations {
	static void stack_push(Stack<Integer> stack) {
		for(int i = 0; i<5; i++) {
			stack.push(i);
		}
	}
	
	static void stack_pop(Stack<Integer> stack) {
		Integer y = (Integer) stack.pop();
		System.out.print(y);
	}
	
public static void main(String[] args) {
		Stack<Integer> stack = new Stack<Integer>();
		stack_push(stack);
		stack_push(stack);
		stack_pop(stack);
		System.out.println(stack.peek());
	}
}
