package JUnitTestPackage;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestAddNumbers 
{
	@Test
	public void test() 
	{
		JUnitFunctions junit = new JUnitFunctions();
		int add = junit.AddNumbers(165,165);
		assertEquals(330,add);
	}

}
