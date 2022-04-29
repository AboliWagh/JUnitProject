package JUnits;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Disabled;


public class CalculatorTest {
	
	@Test
	public void addTest1() {
		
		assertEquals(9,Calculator.add(4, 5));
		
		
	}

	@Disabled
	@Test
	public void subTest1() {
		
		assertEquals(1,Calculator.sub(5, 4));
		
		
	}
}
