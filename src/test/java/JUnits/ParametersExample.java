package JUnits;

import static org.junit.jupiter.api.Assertions.*;

import java.time.Month;
import java.util.stream.Stream;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EnumSource;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

public class ParametersExample {
	
	@ParameterizedTest
	@ValueSource(strings ={"radar","madam","Aboli"})
	
	public void test1(String name) {
	
		assertTrue(StringFunctions.ispalindrom(name));
		
	}
	
	@ParameterizedTest
	@ValueSource(ints = {4,5,6,7})
	public void test2 (int num) {
		assertTrue(num%2==0);
		
	}
	@ParameterizedTest
	@EnumSource(Month.class)
	public void test3 (Month month) {
		int monthval = month.getValue();
		System.out.println(monthval);
		
		assertTrue(monthval<=12);
	}
	
	@ParameterizedTest
	@EnumSource(value=Month.class,names= {"APRIL","JUNE","SEPTEMBER","NOVEMBER"})
	public void test4 (Month month) {

		assertEquals(30,month.length(false));
	}
	
	@ParameterizedTest
	@EnumSource(value=Month.class,names= {"FEBRUARY"})
	public void test5(Month month) {
		assertEquals(28,month.length(false));
	}
	
	@ParameterizedTest
	@MethodSource("DPMethod")
	public void test6(String name) {
	
		assertTrue(StringFunctions.ispalindrom(name));
		
	}
	
	public static Stream<String> DPMethod() {
		
		return Stream.of("radar","mom","dad","racecar");
	}
}
