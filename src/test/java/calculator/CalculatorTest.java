package calculator;

import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;

public class CalculatorTest {
	
	Calculator calc;
	
	@Before
	public void setUp() {
		calc = new Calculator();
	}
	
	@Test
	public void testAdd() {
		//Calculator calc = new Calculator();
		assertEquals(5, calc.add(3, 2));
		
	}
	
	@Test
	public void testSubtract() {
		//Calculator calc = new Calculator();
		assertEquals(3, calc.subtract(5, 2));
		
	}
	
	@Test
	public void testDivision() {
		//Calculator calc = new Calculator();
		assertEquals(3, calc.Division(9, 3));
		
	}
	
	@Test
	public void testMulti() {
		//Calculator calc = new Calculator();
		assertEquals(9, calc.Multi(3, 3));
		
	}

}
