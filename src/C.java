
class A {

//	void add(int a, int b) {
//		System.out.println(a + b);
//	}
	void display() {
		System.out.println("A display");
	}

	int a = 30;
}

class B extends A {

//	void sub(int a, int b) {
//		System.out.println(a - b);
//	}

	void display() {
		System.out.println("B display");
	}

	int a = 40;
}

public class C extends B {

	public static void main(String[] args) {
		C c = new C();
		System.out.println(c.a);
//		c.add(1, 2);
//		c.sub(1, 2);
		c.display();

	}

}
