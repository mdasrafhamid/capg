import java.util.StringTokenizer;

public class ReverseStr {

	public static void main(String[] args) {
		String para = "what is life";
		
		StringBuilder inp = new StringBuilder();
		inp.append(para);
		inp.reverse();
		System.out.println(inp);
		
		StringTokenizer tk = new StringTokenizer(para);
		while (tk.hasMoreElements()) {
			System.out.println(tk.nextElement());
		}
	}

}
