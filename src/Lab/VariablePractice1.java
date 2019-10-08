package Lab;
/**
 * @author asraf
 */
public class VariablePractice1 {

	/* define few global variable and not initializing it
	 * of different data type (int, float, char, boolean, etc.)
	 * 
	 * try to use any reserved keyword as identifier (name of variable) 
	 * and you will see, that compiler will not allow to do so
	 */

	static int x;
	static boolean bool;
	static char c;
	static short s;
	static byte b;
	static double d;
	static float f;

	public static void main(String[] args) {
		/*
		 * print the default value i.e. value of uninitialized variable
		 */
		System.out.println("default value of int: " + x);
		System.out.println("default value of boolean: " + bool);
		System.out.println("default value of char: " + c);
		System.out.println("default value of short: " + s);
		System.out.println("default value of byte: " + b);
		System.out.println("default value of double: " + d);
		System.out.println("default value of boolean: " + f);

	}

}
/*
 *  •	How to define a global variable
 *  •	Use of data type in creating a variable
 *  •	Default value of global variables
 *  •	Reserve keywords cannot be use as identifier


 */


