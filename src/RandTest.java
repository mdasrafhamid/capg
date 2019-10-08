import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.Random;

public class RandTest {

	public static void main(String[] args) throws NoSuchAlgorithmException {
		
		Random r = new Random();
		System.out.println(r.nextInt(10));
		
		SecureRandom a = new SecureRandom().getInstance("SHA1PRNG");
		String str = "Tajmahal"; 

	}

}
