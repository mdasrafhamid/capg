import java.util.Arrays;

public class ArrInDepth {

	static void display(int a[]) {
		
//		main(new String[] {"asraf","wei"});
	}
	public static void main(String[] args) {
		Integer[] a = {22,344,1,324,5,35};
		Integer[] z = new Integer[a.length];
//		int zz[][]=new int[2][];
//		System.out.println(Arrays.copyOf(a, a.length));
		System.arraycopy(a, 0, z, 0, a.length);
		
		Arrays.parallelSort(z);
//		for (Integer i : z) {
//			System.out.println(i);
//		}
//		System.out.println();
		System.out.println(Arrays.deepEquals(a, z));
		
		//copyrange
		//binarysearch
		
		Integer[] c=Arrays.copyOfRange(z, 0, 3);
		for (Integer i : c) {
			System.out.println(i);
		}
		
		
		System.out.println(Arrays.binarySearch(c, 22));
	}

}
