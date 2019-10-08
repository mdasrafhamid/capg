
public class GCTest {

	public static void main(String[] args) {
		
//		Runtime.getRuntime().gc();
		Runtime rn=Runtime.getRuntime();
		
		System.out.println("Before \t"+rn.totalMemory());
		
		Object a[] = new Object[126877696];
		
		for (int i = 0; i < a.length-999999; i++) {
			a[i] = new GCTest();
		}
		
		System.out.println("After \t"+rn.totalMemory());
	}

}
