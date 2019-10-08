package Lab;

public class LoopPractice3 {

	/**
	 * Main Method (starting point)
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		// since we have to print table of 3
		int x = 3; // x can be change with run time argument
		System.out.println("Table of : " + x);

		// this variable will be use to print table of 10, 20, 30 etc.
		int multipleOfThreecount = 0;

		for (int i = 1; i < 11; i++) {
			if (i % 3 != 0) {
				System.out.println(x + " * " + i + " : " + x * i);
			} else {
				// first time number will be 10, next time 20 and so on
				multipleOfThreecount++;
				int number = multipleOfThreecount * 10;

				for (int j = 1; j < 11; j++) {
					System.out.print(j * number + ", ");
				}
				System.out.println(" "); // just to give a line break
			}
		}
		// {Lab2.11} while loop version
		System.out.println("\nWhile loop version");
		multipleOfThreecount=0;
		int k = 1;
		while (k < 11) {
			if (k % 3 != 0) {
				System.out.println(x + " * " + k + " : " + x * k);
			} else {
				// first time number will be 10, next time 20 and so on
				multipleOfThreecount++;
				int number = multipleOfThreecount * 10;

				int l = 1;
				while (l < 11) {
					System.out.print(l * number + ", ");
					l++;
				}
				System.out.println(" "); // just to give a line break
			}
			k++;
		}
		
		// {Lab2.11} do-while loop version
				System.out.println("\nDo-while loop version");
				multipleOfThreecount=0;
				k = 1;
				do{
					if (k % 3 != 0) {
						System.out.println(x + " * " + k + " : " + x * k);
					} else {
						// first time number will be 10, next time 20 and so on
						multipleOfThreecount++;
						int number = multipleOfThreecount * 10;

						int l = 1;
						do{
							System.out.print(l * number + ", ");
							l++;
						}while (l < 11);
						System.out.println(" "); // just to give a line break
					}
					k++;
				}while(k < 11);

	}

}
