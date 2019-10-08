import java.util.Scanner;

public class CaseTest {

	public static void main(String[] args) {

		Scanner obj = new Scanner(System.in);
		Character z = obj.next().charAt(0);

//		System.out.println((int)z);
		if (z.isUpperCase(z.charValue()))
			System.out.println("upper case");
		else if (z.isLowerCase(z.charValue()))
			System.out.println("lower case");
		else if (z.isDigit(z.charValue()))
			System.out.println("number");
		else
			System.out.println("special char");

	}

}
