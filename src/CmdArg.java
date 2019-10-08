
public class CmdArg {

	public static void main(String[] args) {
//		String id = args[0];
//		String name = args[1];
		String salary = args[2];
		
		int s = Integer.parseInt(salary);
		int totalSal = s+100;
		System.out.println(totalSal);

	}

}
