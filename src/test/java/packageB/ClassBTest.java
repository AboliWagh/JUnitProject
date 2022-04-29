package packageB;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

public class ClassBTest {
	
	@Tag("Sanity")
	@Test
	public void Test1() {
		
		System.out.println("Inside Test1 ClassB");
	}

}
