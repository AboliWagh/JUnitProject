package JUnits;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.DynamicTest;
import org.junit.jupiter.api.TestFactory;

public class DynamicTestExample {
	
	@TestFactory
	public List<DynamicTest> Method() {
		
		return Arrays.asList(

				DynamicTest.dynamicTest("Positive Test", ()-> assertTrue(StringFunctions.ispalindrom("madam"))),
				DynamicTest.dynamicTest("Negative Test", ()-> assertFalse(StringFunctions.ispalindrom("Aboli")))
			
				);	
			
		}
		
	}

