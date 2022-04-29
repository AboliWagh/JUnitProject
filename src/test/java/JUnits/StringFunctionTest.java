package JUnits;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;

public class StringFunctionTest {

	@CustomAnnotation
	public void test1() {
		assertTrue(StringFunctions.ispalindrom("madam"));
	}
	
	@Tag("Sanity")
	@DisplayName("Negative Test")
	@Test
	public void test2() {
		assertFalse(StringFunctions.ispalindrom("Aboli"));
	}

	
}
