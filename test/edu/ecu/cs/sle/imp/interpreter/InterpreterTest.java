package edu.ecu.cs.sle.imp.interpreter;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

import edu.ecu.cs.sle.imp.value.IntegerValue;

public class InterpreterTest {

	private static Interpreter interpreter;
	
	@BeforeClass
	public static void setUpClass() {
		interpreter = new Interpreter();
	}
	
	@Test
	public void testMultiply() {
		IntegerValue iv = interpreter.interpret("1*2");
		assertEquals("1*2", 2, iv.getIntValue().intValue());
	}	
	@Test
	public void testMinus() {
		IntegerValue iv = interpreter.interpret("4-2");
		assertEquals("4-2", 2, iv.getIntValue().intValue());
	}	
	@Test
	public void testPlus() {
		IntegerValue iv = interpreter.interpret("2+2");
		assertEquals("2+2", 4, iv.getIntValue().intValue());
	}	
	@Test
	public void testDiv() {
		IntegerValue iv = interpreter.interpret("2/2");
		assertEquals("2/2", 1, iv.getIntValue().intValue());
	}	
	@Test
	public void testUnaryMinus() {
		IntegerValue iv = interpreter.interpret("-2");
		assertEquals("-1*2", -2, iv.getIntValue().intValue());
	}	
	@Test
	public void testLiteralInt() {
		IntegerValue iv = interpreter.interpret("1*2");
		assertEquals("1*2", 1*2, iv.getIntValue().intValue());
	}	
	@Test
	public void testLiteralExp() {
		IntegerValue iv = interpreter.interpret("2");
		assertEquals("2", 2, iv.getIntValue().intValue());
	}
}
