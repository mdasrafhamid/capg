
public class Blocks {

	static {
		System.out.println("Static block invoked");
	}
	float calc(float p, float r, float t){
		System.out.println("Simple interest");
		float si = (p*r*t)/100;
		
		return si;
		
	}
	
	public static void main(String[] args) {
		Blocks ss = new Blocks();
		System.out.println("Named block invoked");
		System.out.println(ss.calc(13000,12,2));
	}

}
