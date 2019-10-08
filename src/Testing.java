
public class Testing {

	//static int c;
//	public static void main(String s[]) {
		// TODO Auto-generated method stub
		//int b=33.55;
//		int d='c';
//		//int e='abc';
//		float f=3.17f;
//		double e=f;
////		int c;
//		System.out.println("Hello World");
//		System.out.println(f);
//		System.out.println(e);
//		
//		int a=3,b=2;
//		a=a+b-(b=a);
//		System.out.println(a+" "+b);
//		
//		byte a=9;
//		byte b=9;
//		byte c=a+b;
//		
//		int b=90;
//		byte z=-33;
//		
//		int h;
//		int g=h=9;
//		
//		int a3=b+z+h-(g+h)*2;
//		System.out.println(a3);
//		
//		System.out.println(g+" "+h);
//		
//		System.out.println(c[0]);	
//	}
	
		static int add(int a,int b) {
			
			return a+b;
		}
		
		static void swap(int a,int b) {
			
			a=a+b-(b=a);
			System.out.println(a+","+b);
		}
		
		static int divide(int a,int b) {
			
			return a/b;
		}
		
		
		public static void main(String args[]) {
			
			int res=0;
//			res=add(2,3);
//			res=divide(10,2);
			swap(3,4);
			System.out.println(res);
		}


		
	

}
