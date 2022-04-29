package JUnits;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class AnnotationsExample {
	
	@BeforeAll
	public static void Method3() {
		System.out.println("Before All Method3");
		
	}
	
	@BeforeEach
	public void Method1() {
		
	System.out.println("Before each");	
	}
	
	@Test
	public void addTest1() {
		
		assertEquals(9,Calculator.add(4, 5));
		System.out.println("Inside test1");
		assertTrue(true);
		
		String[] array1 = {"one","two","three"};
		String[] array2 = {"one","two","three"};
		
		assertArrayEquals(array1, array2);
		
		
	}
	
	@Test
	public void addTest2() {
		
		assertEquals(9,Calculator.add(5, 4));
		System.out.println("Inside test2");
	}
	
	@AfterEach
public void Method2() {
		
		System.out.println("After Each");
		
	}
	@AfterAll
	public static void Method4() {
		System.out.println("After All Method4");
		
	}

}
