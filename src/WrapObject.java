
public class WrapObject {

	
		//add 2 int
		int add(int a,int b) {
		
			return a+b;
		}
		
		//swap 2 int
		void swap(int a,int b) {
			
			a=a+b-(b=a);
			System.out.println(a+","+b);
		}
		
		//divide 2 int
		int divide(int a,int b) {
			
			return a/b;
		}
		
	public static void main(String[] args) {
		WrapObject w = new WrapObject();
		System.out.println(w.add(2, 3));
		System.out.println(w.divide(10, 2));
		w.swap(22, 21);
		

	}

}
