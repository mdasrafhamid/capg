
public class DatatypeConverter {

	public static void main(String[] args) {
		int a = 45;
		float b = 33.7f;
		String z = "99";
		
		float aF = (float)a;
		String aS = String.valueOf(a);

		String bS = String.valueOf(b);
		double bD = (float)b;
		
		int zI = Integer.parseInt(z);
		float zF = Float.parseFloat(z);
		
		System.out.print(aF+",");
		System.out.print(aS+",");
		System.out.print(bS+",");
		System.out.print(bD+",");
		System.out.print(zI+",");
		System.out.print(zF);
	}

}
