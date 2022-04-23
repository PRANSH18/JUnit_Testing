package JUnitTestPackage;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestAddStringsFalse 
{

	@Test
	public void test() 
	{
		JUnitFunctions junit = new JUnitFunctions();
		String add = junit.AddStrings("Pransh ","Gupta E20CSE165");
		assertEquals("Pransh Gupta",add);
	}

}
