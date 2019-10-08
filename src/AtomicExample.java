import java.util.concurrent.atomic.*;

public class AtomicExample {

	public static void main(String[] args) {
		
		AtomicInteger ai = new AtomicInteger(3);
		
		System.out.println(ai.getAndIncrement());
		System.out.println(ai.incrementAndGet());
	}

}
