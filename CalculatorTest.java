import static org.junit.Assert.*;

import org.junit.Test;

import junit.framework.TestCase;

public class CalculatorTest extends TestCase
	{
	
		public void test() 
		{
			int a=6;
	Calculator c=new Calculator();
	assertEquals(720,c.factorial(a));
		}

}
