
public class ShiftOver {

	static String seq = "abcd";
	static int l = 1;
	static int r = 2;

	static void lShift(String s,int a) {

		seq=(s.substring(a).concat(s.substring(0, a)));
	}

	static void rShift(String s,int a) {

		a=s.length()-a;
		
		seq=(s.substring(a).concat(s.substring(0,a)));
	}

	public static void main(String[] args) {

		lShift(seq,l);
		rShift(seq,r);
		System.out.println(seq);

	}

}
