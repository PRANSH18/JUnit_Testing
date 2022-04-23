package JUnitTestPackage;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestAddNumbersFalse 
{

	@Test
	public void test() 
	{
		JUnitFunctions junit = new JUnitFunctions();
		int add = junit.AddNumbers(185,165);
		assertEquals(330,add);
	}

}
