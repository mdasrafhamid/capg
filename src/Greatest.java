
public class Greatest {

	static int max(int...a) {
		
		int m=0;
		for (int i : a) {
			if (i>m)
				m=i;
		}
		return m;
	}
	static void maximum(int a,int b, int c, int d) {
		
		if((a>b)&&(a>c)&&(a>d))
			System.out.println("a is >");
		
		if((b>a)&&(b>c)&&(b>d))
			System.out.println("b is >");
		
		if((c>a)&&(c>b)&&(c>d))
			System.out.println("c is >");
		
		if((d>a)&&(d>b)&&(d>c))
			System.out.println("d is >");
	
	}
	
	public static void main(String[] args) {
		int m = max(33,144,55,66);
		maximum(33,144,55,66);
		System.out.println(m);
	}

}
