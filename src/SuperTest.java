class Parents
{
	Object z = 90_90;
	int a = 12_12;
	Parents(){
		System.out.println("parents");
	}
	Parents(int a){
		System.out.println("parents" +a);
	}
}

class Child extends Parents{
	Child(){
		super(22);
		System.out.println("child");
		System.out.println(super.z);
	}
	Child(int a){
		System.out.println("child" +a);
	}
}

public class SuperTest {
	public static void main(String...args) {
		Child c = new Child();
	}
	
}
