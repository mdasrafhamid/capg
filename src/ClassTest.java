import java.lang.reflect.*;

public class ClassTest {

	public static void main(String[] args) {
		try {
			Class c = Class.forName("java.lang.Integer");
			Method r[] = c.getMethods();
			for (Object j : r) {
				System.out.println(j);
			}
			
		} catch(Exception e) {
			System.out.println(e);
		}

	}

}
