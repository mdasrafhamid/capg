package Lab;

/**
 * This class is use to take three argument from user first as operation type
 * and other two as number
 * 
 * Aim of this assignment is to learn how to use if-else-if block
 */

public class MathsOnUserArguments2 {

	public static void main(String[] args) {
		/**
		 * Please ignore - what is String, args[, Integer and parseInt just use it for
		 * now, we will learn about String in Java.LANG session, Integer and parseInt in
		 * WrapperClass session and args[] in session on ARRAY
		 * 
		 * For now just understand that, String args[] is use to take command line
		 * arguments, and parseInt to convert it into number
		 */
		// Receive three arguments; considering first as operation choice
		String oprArg = args[0];
		String firstArg = args[1];
		String seconfArg = args[2];

		// parsing them
		int oprType = Integer.parseInt(oprArg);
		int firstNo = Integer.parseInt(firstArg);
		int secondNo = Integer.parseInt(seconfArg);

		// create two local variable
		int result = 0;
		boolean isWrongChoice = false;
		System.out.println("If else replaced with Switch case");
		//oprType is KEY, (1-5) is VALUE
		//cannot use float, long, double as KEY
		switch (oprType) {
		case 1:
			result = firstNo + secondNo;
			break;  //if break removed, 
					//result from case 2 will be output
		case 2:
			result = firstNo - secondNo;
			break;
		case 3:
			result = firstNo * secondNo;
			break;
		case 4:
			result = firstNo / secondNo;
			break;
		case 5:
			result = firstNo % secondNo;
			break;
		default:
			isWrongChoice = true;
			break;
		}
		

		if (!isWrongChoice) {
			System.out.println("Result is : " + result);
		} else {
			System.out.println("Invalid choice!!! please enter 1-5 as choice.");
		}

	}

}
