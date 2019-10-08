interface Base{
	int a = 99;
	String b = "BennyLava";
}

interface Class1 extends Base{
	int abc();
	void display();
}

interface Class2 extends Base{
	int abc();
	void display(int a);
}

class Class3 implements Class1, Class2{

	@Override
	public void display(int a) {
		System.out.println("Hi : "+a);
		
	}

	@Override
	public int abc() {
		
		return 123;
	}

	@Override
	public void display() {
		System.out.println("Hi");
		
	}
	
}

public class Heir {

	public static void main(String[] args) {
		Class3 c3 = new Class3();
		System.out.println(c3.abc());
		c3.display();

	}

}
