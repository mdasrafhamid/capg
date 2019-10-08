
public class StrNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StringBuilder sb = new StringBuilder("Capgemini");

		int len = sb.length();
		
		int j=1;
		for (int i = 1; i < len+1; i++) {
			sb.insert(j,String.valueOf(i));
			j+=2;
		}
		System.out.println(sb);
	}

}
