import java.util.Arrays;
import java.util.Iterator;

public class ThreeDExample {

	static void max(int[][] a) {
		int max=0;
		for (int[] is : a) {
			for(int i: is)
				if(max<i)
					max=i;
		}
		System.out.println(max +" is max");
	}
	static void dup(int[][] a) {
		
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				for (int k = i+1; k < a.length; k++) {
					for (int l = j+1; l < a[i].length; l++) {
						if(a[i][j]==a[k][l])
							System.out.println(a[i][j]+ " is duplicated");
					}
					
				}
			}
			
		}
	}
	static void addMat() {
		int sum=0;
		int a[]= {22,33,44,55};
		for (int i : a) {
			sum+=i;
		}
		System.out.println(sum);

	}
	
	public static void main(String[] args) {
		 int a[][]= {
				 	{22,33,44},
		 			{55,68,77},
		 			{99,10,33} };
		 System.out.println(a.length);
		 
		 int m;
		 max(a);
		 dup(a);
		 addMat();
		 
		 String cap = "Capgemini";
		 char[] c = cap.toCharArray();
		 
//		 c[0]=c[0]+c[(c.length-1)]-(c[(c.length-1)]=c[0]);
		 char temp=c[0];
		 c[0]=c[(c.length-1)];
		 c[(c.length-1)]=temp;
		 
		 System.out.println(String.valueOf(c));
		 
//		 System.out.println(m);
		 
//		 for (int[] is : a) {
////			for (int i : is) {
////				System.out.println(i);
////			}
//			 System.out.println(Arrays.toString(is));
//		}
//		 
////		 Arrays.deepToString(a);
//		 System.out.println(Arrays.deepToString(a));
		 
		 
	}

}
