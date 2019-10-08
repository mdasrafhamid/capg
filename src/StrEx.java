
public class StrEx {

	public static void main(String[] args) {
		
		
		String para = "A wiki (About this soundlisten) WIK-ee) is a knowledge base website on which users collaboratively modify content and structure directly from the web browser. In a typical wiki, text is written using a simplified markup language and often edited with the help of a rich-text editor.";
		int sume=0;
		char temp;
		
		for (int i = 0; i < para.length(); i++) {
			temp = para.charAt(i);
			if(temp=='e') {
				sume++;
			}
			
		System.out.println(para.replace('e', 'f'));
		
		
			
		}
		
		System.out.println("sum of e: "+sume);
		
		String a = new String("Capgemini");
		System.out.println(a.toUpperCase());
		System.out.println(33+a.trim());
		System.out.println(a.equals("Capgemini"));
		System.out.println(a.endsWith("mini"));
	}

}
