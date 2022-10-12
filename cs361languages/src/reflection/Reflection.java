/**
 * 
 */
package reflection;

/**
 * @author WESLEY WU 
 *
 */

// Reflection: https://docs.oracle.com/javase/tutorial/reflect/class/

// Demonstration of Reflection

// Given an object o, we want to know what class corresponds to o, the inheritance chain for o
// and the list of methods of the class

// Complete the code

import java.lang.reflect.Method;

import circle.ColoredCircle;

public class Reflection {

	/**
	 * Print the class corresponding to the object
	 * @param o the object
	 */
	public void correspondingClass(Object o) {
		if (o == null)
			throw new IllegalArgumentException("Object passesd is null");

		System.out.println("Inspecting class: " + o.getClass().getName());
	}

	/**
	 * Print the chain of super classes of the object 
	 * Format of the output:
	 * Inheritance chain:
	 * Cn inherits from Cn-1 inherits ... inherits from java.lang.Object
	 * @param o the object
	 */
	public void inheritanceChain(Object o) {
		if (o == null)
			throw new IllegalArgumentException("Object passesd is null");

		// TODO To complete
		// You need to use the EXACT format of the output
		// Hint: Use the method getSuperClass()
		Class temp = o.getClass();
		System.out.println("Inheritance chain:");
		System.out.print(temp.getName());
		temp = temp.getSuperclass();
		while(temp != null) {
			System.out.print(" inherits from " + temp);
			temp = temp.getSuperclass();
		}
		System.out.print("\n");
	}
	
	/**
	 * Print the list of methods of the object
	 * @param o an object
	 */
	public void listMethods(Object o) {
		if (o == null)
			throw new IllegalArgumentException("Object passesd is null");

		Method[] m = o.getClass().getMethods();

		// List of methods
		// TODO To complete
		// Print each method on one line
		// Use this EXACT format
		for(Method method : m) {
			System.out.println(method);
		}
		System.out.println("\n");
	}

	/**
	 * Constructor
	 */
	public Reflection() {
	}

	/**
	 * Demonstration
	 * @param args
	 */
	public static void main(String[] args) {

		Reflection r = new Reflection();		
		
		// Demonstration of the methods on an objet of type String
		// TODO To complete
		String s = "Hi, this is me.";
		r.correspondingClass(s);
		r.inheritanceChain(s);
		r.listMethods(s);
		
		
		// Demonstration of the methods on an objet of type ColoredCircle
		// TODO To complete		
		ColoredCircle c = new ColoredCircle();
		r.correspondingClass(c);
		r.inheritanceChain(c);
		r.listMethods(c);
	}

}
