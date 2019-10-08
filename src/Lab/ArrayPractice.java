package Lab;
/**
 * This class is use to practice Array
 */
public class ArrayPractice {

	public static void main(String[] args) {

		// creates an int array of size 10
		int[] intArray = new int[10];

		// populate it with value of table of 2
		for (int i = 1; i < 11; i++) {
			intArray[i - 1] = i * 2;
		}

		// print intArray // you will see it will print an object ref.
		System.out.println(intArray);
		
//		intArray[0]='1'; //works because it implicitly converts char to int
//		intArray[0]="1"; //fails, array is homogenous
		

		// to print value of intArray
		int j = 0;
		for (;;) {
//			j++;//modified ++ to line 29 because it skipped intArray[0] 
			if (j == 10) //IndexOutOfBoundsException if j==11
				break;

			System.out.println(intArray[j++]);
		}

	}

}
