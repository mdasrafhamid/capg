
public class WrapperClass {

	public static void main(String[] args) {
		int a = 99;
		Integer z = new Integer(a);
		System.out.println(z.floatValue());
		System.out.println(z.parseInt("2"));
		
		Float f1 = new Float(22.5f);
		f1.longValue();
		System.out.println(f1.longValue());

	}

}
