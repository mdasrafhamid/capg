import java.util.Arrays;

public class BlackList {

	public static void checkList(String ip, String[] ipList) {
		if(Arrays.asList(ipList).contains(ip))
			System.out.println("accepted");
		else
			System.out.println("denied");
		
		if(Arrays.stream(ipList).anyMatch(ip::equals))
			System.out.println("accepted");
			
	}
	
	public static void main(String[] args) {
		String [] ipList = {
							"122.33.44.55",
							"122.33.44.58",
							"122.33.44.128",
							"122.33.44.12", };
		String ip="122.33.44.55";
		
		checkList(ip,ipList);
		

	}

}
