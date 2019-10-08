package Lab;

/**
 * This class is use to practice FOR loop
 */
public class LoopPractice2 {

	/**
	 * Main Method (starting point)
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		int x = 3;
		System.out.println("Table of : " + x);

		// {Lab2.9} for loop version
		for (int i = 1; i < 11; i++) {
			if (i % 3 != 0)
				System.out.println(x + " * " + i + " : " + x * i);
		}
		// {Lab2.11} while loop version
		System.out.println("\nWhile loop version");
		int j = 1;
		while (j < 11) {
			if (j % 3 != 0)
				System.out.println(x + " * " + j + " : " + x * j);
			j++;
		}
		// {Lab2.11} do-while loop version
		System.out.println("\nDo-while loop version");
		int k = 1;
		do {
			if (k % 3 != 0)
				System.out.println(x + " * " + k + " : " + x * k);
			k++;
		} while (k < 11);

	}

}
