package travis_ci_tutorial_java;

import java.util.*;

import static org.junit.Assert.*;
import org.junit.*;

public class SimpleCalculatorTest {
	@Test
	public void testAdd() {
		SimpleCalculator calc = new SimpleCalculator();
		assertEquals(calc.add(1, 1), 2);
	}
	@Test
	public void testMinus() {
		SimpleCalculator calc = new SimpleCalculator();
		assertEquals(calc.minus(5,3),2);	//test with smaller subtrahend
		assertEquals(calc.minus(2,2),0);	//test with equal subtrahend
		assertEquals(calc.minus(2,3),-1);	//test with larger subtrahend
	}
	@Test
	public void testMultiply() {
		SimpleCalculator calc = new SimpleCalculator();
		assertEquals(calc.multiply(5,3),15);	//test positive
		assertEquals(calc.multiply(5,-3),-15);	//test negative
		assertEquals(calc.multiply(5,0),0);		//test degenerate rule for 0
		assertEquals(calc.multiply(5,1),5);		//test identity
	}
	
	@Test
	public void testDivide() {
		double epsilon = 0.0000001;						//room for error
		SimpleCalculator calc = new SimpleCalculator();
		assertEquals(calc.divide(6,3),2, epsilon);		//test positive
		assertEquals(calc.divide(-6,3),-2, epsilon);	//test negative
		assertEquals(calc.divide(3,2),1.5, epsilon);	//test fractional
	}
}
