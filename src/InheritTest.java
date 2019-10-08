
class Parent{
		int a=90;
		
		void display() {
			System.out.println("a is "+a);
		}
		static void displayS() {
			System.out.println("static a is ");
		}
		
	}

public class InheritTest extends Parent{

	
	public static void main(String[] args) {
		InheritTest inh = new InheritTest();
		inh.display();
		inh.displayS();

	}

}
