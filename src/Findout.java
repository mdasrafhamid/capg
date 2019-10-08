
public class Findout {

	public static void main(String[] args) {
		String s="ddsafxASdadxvagEFADFSACFARWFGBDSGNAZAssss";
		int suma = 0,sumA = 0, sums = 0;
		char temp;
		
		for (int i = 0; i < s.length(); i++) {
			temp = s.charAt(i);
			if(temp=='a')
				suma++;
			else if(temp=='A')
				sumA++;
			else if(temp=='s')
				sums++;
		}
		System.out.println("sum of a: "+suma);
		System.out.println("sum of A: "+sumA);
		System.out.println("sum of s: "+sums);

	}

}
