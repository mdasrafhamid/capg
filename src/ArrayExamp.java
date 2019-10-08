
public class ArrayExamp {

	public static void main(String[] args) {

		int a[] = { 33, 66, 99, 77 };
		int len = a.length-1;

//		for (int i = 0; i < 2; i++) {
//			a[i]=a[i]+a[(len-i)]-(a[(len-i)]=a[i]);
//		}
		for (int i = 0; i < 2; i+=2) {
		a[i]=a[i]+a[i+1]-(a[i+1]=a[i]);
		}
		System.out.println(a[0]);
		System.out.println(a[1]);
		System.out.println(a[2]);
		System.out.println(a[3]);
//		for (int i : a) {
//			System.out.println(a[i]);
//		}

	}

}
