import java.util.Arrays;
import java.util.Iterator;

public class TwoDExample {

	public static void main(String[] args) {
		 int a[][]= {
				 	{2,4},
		 			{33,44},
		 			{44,55} };
		 System.out.println(a.length);
		 
		 for (int[] is : a) {
//			for (int i : is) {
//				System.out.println(i);
//			}
			 System.out.println(Arrays.toString(is));
		}
		 
//		 Arrays.deepToString(a);
		 System.out.println(Arrays.deepToString(a));
		 
		 
	}

}
