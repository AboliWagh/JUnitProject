package JUnits;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assumptions.assumeTrue;

import org.junit.Assume;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class AssumtionsExample {
	
	@BeforeAll
	public static void SetUp() {
		
		System.setProperty("ENV","DEV");
	}

	@Test
	public void test1() {
		
	assumeTrue("DEV".equals(System.getProperty("ENV")));
		assertTrue(StringFunctions.ispalindrom("madam"));
		assertTrue(StringFunctions.ispalindrom("racecar"));
	}
	
	
}
