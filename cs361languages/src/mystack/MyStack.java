/**
 * 
 */
package mystack;

/**
 * @author WESLEY WU 
 *
 */

// Stack using generics

// Complete the provided code

public class MyStack<T> {

	private class MyNode<T1> {
		T1 val;
		MyNode<T1> next;

		MyNode(T1 v, MyNode<T1> n) {
			val = v;
			next = n;
		}
	}

	private MyNode<T> theStack = null;

	/**
	 * 
	 */
	public MyStack() {
	}

	public T pop() {
		// TODO To complete
		T popVal = theStack.val;
		theStack = theStack.next;
		return popVal;
	}

	public void push(T v) {
		// TODO To complete
		theStack = new MyNode<T>(v, theStack);
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO To complete
		// Create a stack of Integer
		// Push 1 and 2
		// Pop
		// Push 5
		MyStack<Integer> stackInt = new MyStack<Integer>();
		stackInt.push(1);
		stackInt.push(2);
		stackInt.pop();
		stackInt.push(5);
		
		// TODO To complete
		// Create a stack of Person
		// Push a person p1 with your name
		// Push a person p2 with my name
		MyStack<Person> stackP = new MyStack<Person>();
		Person p1 = new Person("Wesley", "Wu");
		Person p2 = new Person("Christelle", "Scharff");
		stackP.push(p1);
		stackP.push(p2);
	}

}
