package Lab;

public class VariablePractice2 {

	/*
	 * define few global variable and initialize them Also define some constants
	 * (here for example I have defined an int type variable and constants)
	 */
	static int x = 12;
	static boolean bool;
	static final int y = 10;

	public static void main(String[] args) {
		// printing the value x
		System.out.println("value of int x before modifying: " + x);
		System.out.println("value of boolean bool before modifying: " + bool);
		System.out.println();

		// modifying its value
		x = 14;
		bool = true;

		// to check, if global variable can be modified locally
		System.out.println("value of int x after modifying: " + x);
		System.out.println("value of int x after modifying: " + bool);

		// try to modify constant, complier will not allow
		// y = 16;

	}

}
