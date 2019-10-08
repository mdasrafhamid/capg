
public class ForTest {

	public static void main(String[] args) {
		
//		char alpha = 'A';
//		for (int i = 0; i < 5; i++) {
//			
//			System.out.print(i+1);
//			System.out.println((char)(alpha+i));
//			
//		}
		int year = 1900;
		
		while(year<=2020) {
			System.out.print(year+", ");
			if(year == 2019) {
				System.out.println("Current year is 2019");
				break;
			}
			year++;
		}
	}

}
