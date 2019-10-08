
public class Wrap {
	
	//add 2 int
	static int add(int a,int b) {
	
		return a+b;
	}
	
	//swap 2 int
	static void swap(int a,int b) {
		
		a=a+b-(b=a);
		System.out.println(a+","+b);
	}
	
	//divide 2 int
	static int divide(int a,int b) {
		
		return a/b;
	}
	
	//starting pt
	public static void main(String args[]) {
		
		int res;
//		res=add(2,3);
		res=divide(10,0);
		System.out.println(res);
	}
}
