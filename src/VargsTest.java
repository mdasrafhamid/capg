import java.util.Arrays;

public class VargsTest {
	
	void add(int...a) {
		int t = Arrays.stream(a).sum();
		System.out.println(t);
		System.out.println(Math.round(Math.pow(2,3)));
		
	}

	public static void main(String[] args) {
		VargsTest ts = new VargsTest();
		ts.add(22, 33, 44);
//		new Long().in
		 int y = (int)Math.pow(2, 3);
		//1
//		System.out.println(y);
	}

}
