package Lab;
/**
 * This class is use to practice various up and down casting
 */

public class DataTypeCastingPractice {

	/**
	 * Main method
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		// create a int variable
		int x = 1000;

		// try to assign it to a short variable (without casting)
		// short s = x; // compiler will not allow it

		// now assign the same with casting
		short s = (short) x;

		System.out.println("int value is : " + x);
		System.out.println("short value (cast from int) : " + s);

		// now assign(cast) the same int value to a byte
		byte b = (byte) x;
		System.out.println("byte value (cast from int) : " + b);

		/**
		 * Learnings - down casting must be explicitly cast value may lost in case of
		 * down casting
		 */

		// now assign (cast) the int into a long variable
		long l = x; // no explicit cast is required
		System.out.println("long value (cast from int) : " + l);
		
		/**
		 * Learnings - up casting is implicit
		 */

		// TODO - do similar exercise for other data type
		// (float, double, char, etc) as well
		
		float f = x;
		System.out.println("float value (cast from int) : " + f);
		
		double d = x;
		System.out.println("double value (cast from int) : " + d);
		
		char c = (char)x;
		System.out.println("double value (cast from int) : " + c);
		
		//could not down cast int to boolean by explicit casting
		//boolean bool = (boolean)x;
		boolean bool = (x==1000);
		System.out.println("boolean value (cast from int) : " + bool);
		

	}

}
