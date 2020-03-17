import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
public class PrepareMyBagTest
{
FirstDayAtSchool school;
String[] bag= {"Books","Notebooks","Pens"};
@Before 
public void setUpBeforeClass() throws Exception{
	System.out.println("Initializing");
	school=new FirstDayAtSchool();
}
@Test
public void testPrepareMyBag()
{
	System.out.println("Inside test prepareMyBag()");
	assertArrayEquals(bag,school.prepareMyBag());
}
@Test
public void testCheckMyName()
{
	System.out.println("Inside test check name()");
	school.checkMyName("Tilaka");
	assertTrue(school.res);
}
}
